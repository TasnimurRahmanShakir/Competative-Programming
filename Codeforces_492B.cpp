#include <bits/stdc++.h>
using namespace std;
#define optimize() ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);
int main()
{
    optimize();
    int n, l;
    double maximum = 0;
    cin >> n >> l;
    int arr[n];
    for(int i=0; i<n; i++) cin>>arr[i];

    sort(arr, arr+n);
    
    maximum = arr[0] - 0;
    for(int i = 0; i < n-1; i++)
    {
        maximum = max(maximum,(arr[i+1]-arr[i])/2.0);
    }
    maximum = max(maximum,(double)l-arr[n-1]);
    double d = (double)maximum;
    cout << fixed << setprecision(9) << d << endl;
    return 0;
}