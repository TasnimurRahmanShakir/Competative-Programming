#include<bits/stdc++.h>
using namespace std;
#define mx 1000
int main()
{
    int sum = 0, n , a[mx];
    cin>>n;
    for (int i = 0; i < n; i++)
    {
        cin>>a[i];
        sum += a[i];
    }
    sum = sum/2;
    sort(a, a+n, greater<int>());
    int count = 0, ans = 0;
    for (int i = 0; i < n; i++)
    {
        ans += a[i];
        if(ans>sum)
        {
            count++;
            break;
        }
        count++;
    }
    cout<<count<<endl;
    return 0;
    
}