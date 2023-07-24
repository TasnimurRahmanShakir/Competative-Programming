#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin>>t;
    while (t--)
    {
        int a, b, n, m;
        cin >> a >> b >> n >> m;
        long long int minCost = 9999999999, ans;
        if(n > m){
            ans = (m * a) + ((n - m - 1) * b);
            minCost = min(ans,  minCost);
            if(n > m+1){
                ans = b * (n - 1);
                minCost = min(ans, minCost);
            }
            
        }
        else{
            if(a < b){
                ans = n * a;
                minCost = min(ans, minCost);
            }
            else{
                ans = n * b;
                minCost = min(ans, minCost);
            }
                
        }
        cout << minCost << endl;
    }
    
}