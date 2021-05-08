#include <iostream>
#include <math.h>

using namespace std;


bool is_prim(int n) {

    if (n == 1) {
        return false;
    }
    if (n == 2) {
        return true;
    }
    for (int i = 2; i <= sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n, n2;
    while (cin >> n) {
        cin >> n2;
        int total = 0;

        for (int i = n; i <= n2; i++) {
            if (is_prim(i)) {
                total++;
            }
        }


        cout << total << "\n";


    }
    return 0;
}
