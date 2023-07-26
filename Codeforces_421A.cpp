#include<bits/stdc++.h>
using namespace std;
int main(){
    int n, a, b;
    cin >> n >> a >> b;
    vector<int>arr(n);
    for (int i = 1; i <= a; i++)
    {
        int x;
        cin >> x;
        arr[x-1] = 1;
    }
    for (int i = 1; i <= b; i++)
    {
        int x;
        cin >> x;
        if(arr[x-1]==0)
            arr[x-1] = 2;
        
    }
    for (auto x: arr)
        cout << x << " ";
}