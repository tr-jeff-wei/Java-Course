#include <bits/stdc++.h>

using namespace std;
typedef long long LL;

int main() {
        ios_base::sync_with_stdio(0);
        cin.tie(0);

        int m, n;
        cin >> m >> n;
        LL wholeGroup = (1l << m) - 1;
        map<LL, int> mp;
        int ans = 0;
        for (int i = 0; i < n; i++) {
                string s;
                cin >> s;
                LL myGroup = 0l;
                for (int si = 0; si < s.length(); si++) {
                        char c = s[si];
                        int ci = 0;
                        if (c <= 'Z') {
                                ci = c - 'A';
                        }
                        else {
                                ci = c - 'a' + 26;
                        }
                        LL pi = 1l << ci;
                        myGroup = myGroup | pi;
                }
                // add item
                if (mp.find(myGroup) != mp.end()) {
                        mp[myGroup]++;
                }
                else {
                        mp[myGroup] = 1;
                }

                // find partner
                LL partner = (~myGroup) & wholeGroup;
                if (mp.find(partner) != mp.end()) {
                        ans += mp[partner];
                }
        }


        cout << ans;

        return 0;

}

