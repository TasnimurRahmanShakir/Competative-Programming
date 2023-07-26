#include <bits/stdc++.h>
using namespace std;
void solve()
{
    string a;
    string b;
    cin >> a >> b;
    if (a[0] == b[0])
    {
        cout << "YES\n"
             << a[0] << "*" << endl;
        return;
    }
    if (a[a.size() - 1] == b[b.size() - 1])
    {
        cout << "YES\n*" << a[a.size() - 1] << endl;
        return;
    }

    for (int i = 0; i < a.size() - 1; i++)
        for (int j = 0; j < b.size() - 1; j++)
            if (a[i] == b[j] && a[i + 1] == b[j + 1])
            {
                cout << "YES\n*" << a[i] << a[i + 1] << "*" << endl;
                return;
            }
    cout << "NO" << endl;
}
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        solve();
    }
    return 0;
}