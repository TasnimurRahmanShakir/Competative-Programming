#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n, sum = 0, count = 0;
        cin >> n;
        int health[n];
        for (int i = 0; i < n; i++)
        {
            cin >> health[i];
            if(health[i]==1 || health[i]==2)
                sum += health[i];
            else
                count++;
        }

        if(sum%2 == 0)
            count += sum / 2;
        else
            count += (sum / 2) + 1;

        cout << count << endl;
        sum = 0;
        count = 0;
    }
    
    
}