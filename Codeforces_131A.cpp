#include <iostream>
using namespace std;

int main()
{
    string s;
    bool c = true;
    cin >> s;

    for(int i = 1; i < s.length(); i++)
    {
        if(islower(s[i]))
        {
            c = false;
        }
    }

    if(c == true)
    {
        for(int j = 0; j < s.length(); j++)
        {
            if(islower(s[j]))
                s[j] = toupper(s[j]);
            else
                s[j] = tolower(s[j]);
            cout << s[j];
        }
    }
    else
        cout << s;
    return 0;
}