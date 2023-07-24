#include<bits/stdc++.h>
using namespace std;
int main()
{
    int j = 0;
    string s, x;
    cin >> s;
    for (int i = 0; i < s.size(); i++)
    {
        if((s[i]=='W' && s[i+1]=='U' && s[i+2]=='B'))
        {
            i += 2;
            cout << " ";
        }
        else
            cout << s[i];
    }
    cout << endl;

    return 0;
}