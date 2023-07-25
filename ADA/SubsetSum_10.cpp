#include <bits/stdc++.h>
using namespace std;

void func(vector<vector<int>> &res, vector<int> &ds, vector<int> &S, int i, int target)
{
    if (i == S.size())
    {
        if (target == 0)
        {
            res.push_back(ds);
        }
        return;
    }

    func(res, ds, S, i + 1, target);
    if (S[i] <= target)
    {
        ds.push_back(S[i]);
        func(res, ds, S, i + 1, target - S[i]);
        ds.pop_back();
    }
}

vector<vector<int>> Subset(vector<int> &S, int d)
{
    vector<vector<int>> res;
    vector<int> ds;
    func(res, ds, S, 0, d);
    return res;
}

int main()
{
    vector<int> S = {1, 2, 5, 6, 8};
    int d = 9;
    vector<vector<int>> ans = Subset(S, d);
    for (int i = 0; i < ans.size(); i++)
    {
        for (int j = 0; j < ans[i].size(); j++)
        {
            cout << ans[i][j] << " ";
        }
        cout << endl;
    }
}
