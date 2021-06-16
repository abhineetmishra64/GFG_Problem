#include<bits/stdc++.h>
using namespace std;
#define M 101

vector<vector<int>> transpose(int a[][M], int n);
int main(){
    int n; cin>>n;
    int a[M][M];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            cin>>a[i][j];
        }
    }
    vector<vector<int>> b;
    b = transpose(a,n);
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            cout<<b[i][j]<<" ";
        }
    }
    cout<<endl;
}

vector<vector<int>> transpose(int a[][M],int n){   
}