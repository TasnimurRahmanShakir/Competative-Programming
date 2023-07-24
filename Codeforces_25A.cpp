#include<bits/stdc++.h>
using namespace std;
#define optimize()                \
    ios_base::sync_with_stdio(0); \
    cin.tie(0);                   \
    cout.tie(0);

int main()
{
    int n, even = 0, odd=0;
    cin >> n;
    vector<int> v(n);
    for (int i = 0; i < n; i++)\
    {
        cin >> v[i];
        if(v[i]%2 == 0)
            even++;
        else
            odd++;
    }
    if(odd < even)
    {
        for (int i = 0; i < n; i++)
        {
            if(v[i] % 2 == 1)
            {
                cout << i+1 << endl;
                return 0;
            }
        }
        
    }
    else
    {
        for (int i = 0; i < n; i++)
        {
            if(v[i] % 2 == 0)
            {
                cout << i+1 << endl;
                return 0;
            }
        }
        
    }

    return 0;

}