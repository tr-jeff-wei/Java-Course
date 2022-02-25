#include <iostream>
#include <vector>
#include <climits>
using namespace std;

int arrA[11][101];
int arrB[11][101];
int n1, n2, m1, m2, r;

int check(int i, int j) {

    int err = 0;
    int total = 0;
    for (int m = 0; m < n1; m++) {
        for (int n = 0; n < n2; n++) {
            if (arrA[m][n] != arrB[i + m][j + n]) {
                err++;
            }
            if (err > r) {
                return -1;
            }
            total += (arrB[i + m][j + n] - arrA[m][n]);
        }

    }
    return abs(total);
}

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    cin >> n1 >> n2 >> m1 >> m2 >> r;

    for (int i = 0; i < n1; i++) {
        for (int j = 0; j < n2; j++) {
            cin >> arrA[i][j];
        }
    }
    for (int i = 0; i < m1; i++) {
        for (int j = 0; j < m2; j++) {
            cin >> arrB[i][j];
        }
    }

    int min = INT_MAX;
    int count = 0;
    for (int i = 0; i < m1 - (n1 - 1); i++) {
        for (int j = 0; j < m2 - (n2 - 1); j++) {
            // check distance / cal difference       
            int total = check(i, j);
            //System.out.println(i + "," + j + " ==> " + total);

            if (total == -1) {
                continue;
            }
            if (total < min) {
                min = total;
            }
            count++;
        }
    }
    cout << count << endl;
    if (min == INT_MAX) {
        cout << -1 << endl;
    }
    else {
        cout << min << endl;
    }

    return 0;
}

