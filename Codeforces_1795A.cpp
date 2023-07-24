#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n, m;
        cin >> n >> m;
        string s1, s2;
        cin >> s1 >> s2;
        reverse(s2.begin(), s2.end());
        string res = s1 + s2;

        int count = 0;
        for (int  i = 0; i < res.size(); i++)
        {
            if(res[i] == res[i+1])
                count++;
        }
        
        if(count > 1)
            cout << "NO" << endl;
        else
            cout << "YES" << endl;
        count = 0;
    }

    
}