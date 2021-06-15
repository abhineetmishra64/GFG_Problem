#include<bits/stdc++.h>
using namespace std;

class Solution{   
public:
    pair<int, int> get(int a, int b){
        //complete the function here
        int temp = a;
        a = b;
        b= temp;
        return{a,b};
    }
};

int main(){
    int a,b;
    cin>>a>>b;
    Solution ob;
    pair<int,int>p = ob.get(a,b);
    cout<<p.first<<' '<<p.second<<endl;
    return 0;
}