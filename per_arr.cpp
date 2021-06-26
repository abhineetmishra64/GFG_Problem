#include<bits/stdc++.h>
using namespace std;

class Solution{
    public:
    bool IsPerfect(int a[],int n)
    {
        // Complete the function
        int b[n],count;
        for(int i=0;i<n;i++){
            b[i]=a[n-1-i];
        }
        int i=0;
        while(i<n){
            if(a[i]==b[i]){
                count++;
                i++;
            }
            else if(a[i]!=b[i]){
                count=0;
                break;
            }
        }
        if(count==0) return false;
        else return true;
    }
};

int main(){
    int n;cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    Solution ob;
    if(ob.IsPerfect(a,n)) cout<<"Perfect\n";
    else cout<<"Not Perfect\n";
}