#include <bits/stdc++.h>
using namespace std;

int main() {
    int n , flag = 0;
    cin>>n;
    int arr[n];
    for(int i = 0; i<n; i++){
        int a;
         cin>>a;
         if(a==1) flag = 1;
         arr[i]= a;
    }
    if(flag==0) cout<<"EASY"<<endl;
    else cout<<"HARD"<<endl;
    return 0;
}