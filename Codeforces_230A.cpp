#include<bits/stdc++.h>
using namespace std;
int main()
{
    int s, n, count = 0;
    cin >> s >> n;
    vector<pair<int, int>> v(n);

    for (int i = 0; i < n; i++)
    {
        cin >> v[i].first >> v[i].second;
    }
    sort(v.begin(), v.end());
    
    for (int i = 0; i < n; i++)
    {
        if(v[i].first < s)
        {
            s += v[i].second;
        }
        else
        {
            cout << "NO" << endl;
            return 0;
        }
    }

    cout << "YES" << endl;
}