#include<iostream>
#include<algorithm>
#include<vector>
#include<unordered_set>

using namespace std;

struct Node
{
    int weight = 0;
    int parent = -1;
    int lc = -1;
    int rc = -1;
};

// n:10^5 ==> 2n+2 : 200002
Node tree[2000002];
vector<int> goods;
// unordered_set<int> sumParents;

void build(int i) {

    int lw = 0;
    if (tree[i].lc != -1) {
        build(tree[i].lc);
        lw = tree[tree[i].lc].weight;
    }
    int rw = 0;
    if (tree[i].rc != -1) {
        build(tree[i].rc);
        rw = tree[tree[i].rc].weight;
    }

    tree[i].weight = tree[i].weight + rw + lw;

}

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0);

    int n, m;
    cin >> n >> m;
    for (int i = n; i <= 2 * n - 1; i++) {
        cin >> tree[i].weight;
    }

    for (int i = 0; i < m; i++) {
        int g;
        cin >> g;
        goods.push_back(g);
    }

    for (int i = 1; i <= n - 1; i++) {
        int p, l, r;
        cin >> p >> l >> r;

        tree[p].lc = l;
        tree[p].rc = r;

        tree[l].parent = p;
        tree[r].parent = p;

        // if (n <= l && n <= r) {
        //     // 此時的父節點，擁有兩個完整的貨箱
        //     sumParents.insert(p);
        // }
    }

    build(1);

    // unordered_set<int>& processSet = sumParents;
    // unordered_set<int> newSet;
    // unordered_set<int>& tmpSet = newSet;
    // long n1 = 0, n2 = 0;;
    // while (true) {
    //     tmpSet.clear();
    //     for (auto& pI : processSet) {
    //         n1++;
    //         tree[pI].weight = tree[tree[pI].lc].weight + tree[tree[pI].rc].weight;
    //         // add up level
    //         if (tree[pI].parent != -1) {
    //             tmpSet.insert(tree[pI].parent);
    //         }
    //     }
    //     if (tmpSet.size() > 0) {
    //         // swap
    //         unordered_set<int>& t = processSet;
    //         processSet = tmpSet;
    //         tmpSet = processSet;
    //     }
    //     else {
    //         break;
    //     }
    // }
    // cout << n1;
    for (auto& mi : goods) {
        // distribute goods

        int idx = 1; // root is at 1
        while (true)
        {
            int r = tree[idx].rc;
            int l = tree[idx].lc;
            tree[idx].weight += mi;
            // end 
            if (r == -1 && l == -1) {
                cout << idx << " ";
                break;
            }

            int rw = INT32_MAX;
            int lw = INT32_MAX;
            if (r != -1) {
                rw = tree[r].weight;
            }
            if (l != -1) {
                lw = tree[l].weight;
            }
            if (rw < lw) {
                idx = r;
            }
            else {
                idx = l;
            }


        }

    }


    // 7 2 --> n , m  (v)
    // 9 2 1 6 8 7 5 --> w(i) V
    // 2 3 --> m(i)  V
    // 1 2 5
    // 2 3 7
    // 3 13 10
    // 4 11 9
    // 6 12 8
    // 5 6 4

    // 1. 把貨物重量加到父節點
    // 2. find root:1
    // 3. 依序放入貨品


}