// #include<bits/stdc++.h>

#include<iostream>
#include<unordered_set>


using namespace std;

int main()
{

    ios::sync_with_stdio(0);
    cin.tie(0);

    int n;
    cin >> n;

    unordered_set<string> strSet;
    for (int i = 0; i < n; i++) {
        string s;
        cin >> s;
        strSet.insert(s);
    }
    int ans = 0;
    for (auto itr = strSet.begin(); itr != strSet.end(); itr++) {
        string w = (*itr);
        for (int len = 2 - w.length() % 2; len < w.length(); len += 2) {
            // w:pairpa    ir
            int m = (w.length() + len) / 2; // full string mid point

            // 檢查後段 pa 可以匹配最前面 pa ==>  w :  pari | pa  
            string head2 = w.substr(m, w.length() - m);
            //cout << w << " >>  " << len << " : " << head2 << " ==> " << w.find(head2) << endl;
            if (w.find(head2) != 0) {
                continue;
            }


            string target = w.substr(w.length() - m, 2 * m - w.length()); // 2 ~4
            //cout << "target : " << target << endl;
            if (strSet.find(target) != strSet.end()) {

                //cout << w << " >>  " << target << endl;
                ans++;
            }
        }
    }

    cout << ans;
    return 0;
}
