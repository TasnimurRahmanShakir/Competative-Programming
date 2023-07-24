#include<bits/stdc++.h>
using namespace std;
int main()
{
    int a, b, c, max[5], i=0;
    cin>>a>>b>>c;
    max[i++]=(a+b)*c;
    max[i++]=a+(b*c);
    max[i++]=a*b*c;
    max[i++]=a*(b+c);
    max[i++]=a+b+c;

    sort(max,max+i,greater<int>());
    cout<<max[0];
    return 0;
    
}