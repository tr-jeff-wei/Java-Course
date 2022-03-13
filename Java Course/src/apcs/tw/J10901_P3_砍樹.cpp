#include<iostream>
#include<algorithm>

using namespace std;

struct Tree
{
    int height;
    int position;
    int next;
    int prev;
};

Tree trees[100005];

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n, limit;
    cin >> n >> limit;

    // position
    trees[0].position = 0;
    trees[0].next = 1;
    trees[0].prev = -1;
    for (int i = 1; i <= n; i++)
    {
        cin >> trees[i].position;
        trees[i].next = i + 1;
        trees[i].prev = i - 1;
    }
    trees[n + 1].position = limit;
    trees[n + 1].next = -1;
    trees[n + 1].prev = n;

    // height    
    for (int i = 1; i <= n; i++)
    {
        cin >> trees[i].height;
    }

    // 開始砍樹
    int tmax = -1;  // 最高
    int tcount = 0; // 紀錄砍數次數
    int checkIdx = trees[0].next; // 準備拿來檢查可不可以砍的樹
    while (checkIdx <= n) {

        // 判斷可不可以砍
        while (trees[checkIdx].position + trees[checkIdx].height <= trees[trees[checkIdx].next].position || // 右倒
            trees[checkIdx].position - trees[checkIdx].height >= trees[trees[checkIdx].prev].position // 左倒
            ) {
            // 可以砍

            // 設最大值
            if (trees[checkIdx].height > tmax) {
                tmax = trees[checkIdx].height;
            }

            //cout << "[" << checkIdx << "] >> " << trees[checkIdx].height;
            // remove
            trees[trees[checkIdx].prev].next = trees[checkIdx].next;
            trees[trees[checkIdx].next].prev = trees[checkIdx].prev;
            tcount++;

            // 回溯前一棵
            if (trees[checkIdx].prev == 0) {
                break;
            }
            checkIdx = trees[checkIdx].prev;
        }

        // 往下一棵
        checkIdx = trees[checkIdx].next;


    }

    cout << tcount << "\n";
    cout << tmax;


}