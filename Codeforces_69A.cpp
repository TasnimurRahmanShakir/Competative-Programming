#include<bits/stdc++.h>
using namespace std;
#define mx 1000
int main()
{
    int test, x[mx],y[mx],z[mx], result[mx], X=0,Y=0,Z=0;
    cin>>test;
    for (int i = 0; i < test; i++)
    {
        cin>>x[i]>>y[i]>>z[i];
    }
    for (int i = 0; i < test; i++)
    {
        X += x[i];
        Y += y[i];
        Z += z[i];
    }

    if(X == 0 && Y == 0 && Z==0)
        cout<<"YES"<<endl;
    else
        cout<<"NO"<<endl;

    return 0;
}