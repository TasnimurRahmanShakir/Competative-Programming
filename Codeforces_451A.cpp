#include<bits/stdc++.h>
using namespace std;
#define optimize()                \
    ios_base::sync_with_stdio(0); \
    cin.tie(0);                   \
    cout.tie(0);

int main()
{
    int n, m;
    cin >> n >> m ;
    int count = 0;
    while (1)
    {
        m--;
        n--;
        if(m==0 || n==0)
            break;
        count++;
    }
    
    if(count%2!=0)
        cout << "Malvika" << endl;
    else
        cout << "Akshat" << endl;
}