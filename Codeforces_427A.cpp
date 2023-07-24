#include<bits/stdc++.h>
using namespace std;
#define optimize()                \
    ios_base::sync_with_stdio(0); \
    cin.tie(0);                   \
    cout.tie(0);

int main()
{
    int n, count(0);
    cin >> n;
    vector<int> v(n);
    for (int i = 0; i < n; i++)
    {
        cin >> v[i];
    }
    int police = 0;
    
    for (int i = 0; i < n; i++)
    {
        if(v[i] > 0)
            police += v[i];
        else if( v[i]<0 && police == 0)
            count++;
        else
            police--;
    }
    cout << count << endl;
    return 0;
}