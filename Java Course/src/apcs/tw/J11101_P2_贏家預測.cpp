#include <iostream>
#include <vector>

using namespace std;

struct Data {
    long long ap = 0;
    long long rp = 0;
    int loseCount = 0;
    int id;

    void winUpdate(Data& d2) {
        //  ap --> a+cd/(2b)
        long long nap = ap + d2.score() / (2 * rp);
        // rp --> b+cd/(2a)
        long long nrp = rp + d2.score() / (2 * ap);

        ap = nap;
        rp = nrp;

    }
    void loseUpdate() {
        ap = ap + ap / 2;
        rp = rp + rp / 2;
    }
    void lose() {
        loseCount++;
    }

    long long score() {
        return ap * rp;
    }
};


bool beat(Data& d1, Data& d2) {
    if (d1.score() >= d2.score()) {
        d1.winUpdate(d2);
        d2.loseUpdate();
        d2.lose();
        return true;
    }
    else {
        d2.winUpdate(d1);
        d1.loseUpdate();
        d1.lose();
        return false;
    }
}

int main()
{

    ios::sync_with_stdio(0);
    cin.tie(0);

    int n, m;
    cin >> n >> m;

    vector<Data> data;
    vector<int> round;
    for (int i = 0; i < n; i++) {
        Data d;
        cin >> d.ap;
        d.id = i + 1;
        data.push_back(d);
    }
    for (int i = 0; i < n; i++) {
        cin >> data[i].rp;
    }
    for (int i = 0; i < n; i++) {
        int r;
        cin >> r;
        round.push_back(r - 1);
    }

    while (round.size() > 1) {

        vector<int> wlist;
        vector<int> llist;
        for (int r = 0; r < round.size() - 1; r += 2) {

            int d1 = round[r];
            int d2 = round[r + 1];
            if (beat(data[d1], data[d2])) {
                wlist.push_back(d1);
                if (data[d2].loseCount < m) {
                    llist.push_back(d2);
                }
            }
            else {
                wlist.push_back(d2);
                if (data[d1].loseCount < m) {
                    llist.push_back(d1);
                }
            }

        }
        if (round.size() % 2 == 1) {
            // put last
            wlist.push_back(round[round.size() - 1]);
        }
        for (int i = 0; i < llist.size(); i++) {
            wlist.push_back(llist[i]);
        }
        round = wlist;

        // debug
        // for (int i = 0; i < round.size();i++) {
        //     cout << round[i] << ",";
        // }
        // cout << " | ";
        // for (int i = 0; i < data.size();i++) {
        //     cout << data[i].ap << ",";
        // }
        // cout << " | ";
        // for (int i = 0; i < data.size();i++) {
        //     cout << data[i].rp << ",";
        // }
        // cout << " | ";
        // for (int i = 0; i < data.size();i++) {
        //     cout << data[i].loseCount << ",";
        // }
        // cout << endl;

    }
    cout << data[round[0]].id;
    return 0;
}