#include<bits/stdc++.h>
using namespace std;
#define mx 1000
int main()
{
    int a, t;
    char s[mx];
    cin>>a>>t;
    cin>>s;
    while (t--)
    {
        for (int i = 0; i < a;)
        {
            if(s[i]== 'B' && s[i+1]=='G')
            {
                swap(s[i],s[i+1]);
                i=i+2;
            }
            else
                i++;
        }
    }
    cout<<s<<endl;
    return 0;
}