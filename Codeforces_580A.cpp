#include<bits/stdc++.h>
using namespace std;
int main()
{
    int size, count = 1, max_cnt=1;
    cin>>size;
    int  array[size];
    for (int i = 0; i < size; i++)
    {
        cin>>array[i];
        if(i>0)
        {
            if(array[i]>=array[i-1])
            {
                count++;
                max_cnt = max(max_cnt, count);
            }
            else
                count = 1;
        }
    }
    cout<<max_cnt<<endl;
    
    return 0;
}