#include<iostream>
using namespace std;

int main(){
    int t,n,i,j,a[100];
    cin>>t;
    for(i=0;i<n;i++){
        cin>>n;
        for(j=0;j<n;j++){
            cin>>a[j];
        }
        for(j=0;j<n-1;j++)
        {
            for(int k=0;k<n-i-1;k++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }   
        }
        for(i=0;i<n;i++){
            cout<<a[i];
        }
        // cout << a[0] <<" " << a[n-1];
        // cout<<"\n";
    }
}