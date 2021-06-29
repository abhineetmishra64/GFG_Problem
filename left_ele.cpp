#include<bits/stdc++.h>
using namespace std;

class Solution{
    public:
    int leftElement(int a[], int n) {
        // Your code goes here 
        int med,i,j;
        sort(a,a+n);
        int size=n/2;
        if(n%2==0){
            return a[size-1];
        }
        else return a[size];
    }
};

int main(){
    int n;
    cin>>n;
    int a[n],i;
    for(i=0;i<n;i++){
        cin>>a[i];
    }
    Solution ob;
    cout<<ob.leftElement(a,n)<<endl;
}