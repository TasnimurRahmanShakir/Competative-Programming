#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin >> n;
    int x = 0;
    vector<int> v(n);
    for (int i = 0; i < n;i++){
        cin >> v[i];

    }
    auto maxValue = max_element(v.begin(), v.end());
    int maxValueIndex = distance(v.begin(), maxValue);
    nth_element(v.begin(), v.begin()+1, v.end(), greater<int>());
    cout << maxValueIndex+1 << " " << v[1]<<endl;
}