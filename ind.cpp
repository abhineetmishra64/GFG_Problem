#include <iostream>
#include <bits/stdc++.h> 
#include <vector> 
using namespace std; 

 // } Driver Code Ends
class Solution
{
  public:
    vector<int> findIndex(int a[], int n, int key)
    {
        //code here.
        int f;
        vector <int> res;
        int i = 0;
        while(i<n){
            if(a[i]==key){
                res.push_back(i);
                break;
            }
            else i++;
        }
        for(int j=n;j>=i;j--){
            if(a[j]==key){
                res.push_back(j);
                break;
            }
        }
        if(res.empty()){
            res.push_back(-1);
            res.push_back(-1);
        }
        return res;
    }
  
};

// { Driver Code Starts.
int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        vector<int> res;
        cin>>n;
        int arr[n];
        for(int i=0;i<n;i++)
            cin>>arr[i];
        int key;
        cin>>key;
        Solution ob;
        res=ob.findIndex(arr, n, key);
        for (int i = 0; i < res.size(); i++) 
        cout << res[i] << " ";
        cout << "\n";
    }
    
    return 0;
}
  // } Driver Code Ends
