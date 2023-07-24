#include<bits/stdc++.h>
using namespace std;
#define mx 1000
int main()
{
    int size, a[mx];
    cin>>size;
    for (int i = 0; i < size; i++)
    {
        cin>>a[i];
    }
    sort(a,a+size);
    for(int i=0; i<size; i++)
        cout<<a[i]<<" ";
    return 0;
}