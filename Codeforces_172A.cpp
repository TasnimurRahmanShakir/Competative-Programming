#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin >> n;
    string s;
    cin >> s;
    n--;
    int cnt = s.size();
    while (n--)
    {
        string p;
        int x = 0;
        cin >> p;
        for (int i = 0; i <cnt; i++)
        {
            if(s[i] == p[i])
                x++;
            else{
                cnt = x;
                x = 0;
                break;
            }
        }
        
    }
    cout << cnt << endl;
}