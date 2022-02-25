#include <iostream>

using namespace std;


int wall[200002];
int paint[5002];
int nw, np;

bool isPossible(int targetH) {
    int wi = 0; // 檢查第 wi 木板
    int pi = 0; // 用第 pi 張海報

    while (pi < np) { // 把所有海報放上牆

        // 找到第一個可以放的牆                  
        while (wi < nw && wall[wi] < targetH) {
            wi++;
        }
        if (wi == nw) {
            // 都沒有找到可以放的
            break;
        }

        // 往後連續( paints[pi] )的牆面都要符合 targetH 高度
        bool isOk = true;
        for (int i = 0; i < paint[pi]; i++) {
            if (wi >= nw || wall[wi++] < targetH) {
                // 沒有符合
                isOk = false;
                break;
            }
        }

        if (isOk) {
            // 有符合，換下一個海報
            pi++;
        }
        else {
            // 沒有符合，找下一個可能的牆（原來的海報 pi 不加）
            continue;
        }

    }
    if (pi == np) {
        return true;
    }
    return false;
}

int main()
{

    ios::sync_with_stdio(0);
    cin.tie(0);
    /*
    10 3
    5 3 7 5 1 7 5 3 8 4 ==> wall
    2 2 1 ==> paint
    */


    cin >> nw >> np;

    int maxWall = -1;
    for (int i = 0; i < nw; i++) {
        cin >> wall[i];
        if (wall[i] > maxWall) {
            maxWall = wall[i];
        }
    }
    for (int i = 0; i < np; i++) {
        cin >> paint[i];
    }

    int nextStep = maxWall / 2;
    int targetHeight = 0;
    while (nextStep > 0) {
        while (isPossible(targetHeight + nextStep)) {
            targetHeight = targetHeight + nextStep;
        }
        nextStep = nextStep / 2;
    }

    cout << targetHeight << endl;

    return 0;
}