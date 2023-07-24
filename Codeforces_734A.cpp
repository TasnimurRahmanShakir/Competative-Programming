#include<bits/stdc++.h>
using namespace std;
#define mx 100000
int main()
{
    char s[mx];
    int Anton = 0, Denik = 0, size;
    cin>>size;
    
    for (int i = 0; i < size; i++)
    {
        cin>>s[i];
        if(s[i] == 'A')
            Anton++;
        else
            Denik++;
    }
    if(Anton>Denik)
        cout<<"Anton"<<endl;
    else if(Denik>Anton)
        cout<<"Danik"<<endl;
    else
        cout<<"Friendship"<<endl;
    return 0;
    
}