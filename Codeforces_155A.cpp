#include<bits/stdc++.h>
using namespace std;
#define optimize()                \
    ios_base::sync_with_stdio(0); \
    cin.tie(0);                   \
    cout.tie(0);

int main()
{
    int n, more, less, count(0);
    cin >> n;
    vector<int> v(n);
    for (int i = 0; i < n;i++)
        cin >> v[i];
    more = less = v[0];

    for (int i = 1; i < n; i++)
    {
        if(v[i] > more)
        {
            more = v[i];
            count++;
        }
        else if(v[i]<less)
        {
            less = v[i];
            count++;
        }
    }
    cout << count << endl;

    return 0;
}