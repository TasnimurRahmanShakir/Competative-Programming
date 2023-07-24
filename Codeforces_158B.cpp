#include<bits/stdc++.h>
using namespace std;
int main()
{
    int group, count1(0), count2(0),count3(0),count4(0), min_taxi(0), extra;;
    cin>>group;
    int team_member[group];
    for (int i = 0; i < group; i++)
    {
        cin>>team_member[i];
        if(team_member[i]==1)
            count1++;
        else if(team_member[i]==2)
            count2++;
        else if(team_member[i]==3)
            count3++;
        else
            count4++;
    }
    min_taxi += count4;

    if(count3 < count1)
    {
        min_taxi+=count3;
        count1 = count1-count3;
        count3 = 0;
    }
    else if(count1 < count3)
    {
        min_taxi += count3;
        count1 = 0;
    }
    else if(count1 == count3)
    {
        min_taxi += count1;
        count1 = count3 = 0;
    }
    if(count2 > 0 )
    {
        min_taxi += count2/2;
        count2 = count2%2;
    }
    
    extra = count1+(count2*2);
    if(extra <= 4 && extra > 0)
    {
        min_taxi++;
    }
    else if(extra%4 != 0)
    {
        min_taxi += (extra/4)+1;
    }
    else
        min_taxi += extra/4;
    
    cout<<min_taxi<<endl;
    return 0;
}