#include<bits/stdc++.h>
using namespace std;
#define mx 1000
int main()
{
    int f, h,size[mx], count = 0;
    cin>>f>>h;
    for (int i = 0; i < f; i++)
    {
        cin>>size[i];
        if(size[i]<=h)
          count++;
        else
          count+=2;
    }
    
    cout<<count<<endl;
    return 0;
}