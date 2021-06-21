#include<bits/stdc++.h>
using namespace std;

class Solution{
public:	
	vector<int> getMoreAndLess(int arr[], int n, int x) {
	    // code here
	    vector <int> ans;
	    int i, smaller=0, larger=0;
	    for(i=0;i<n;i++){
	        if(arr[i]<=x) smaller++;
	        if(arr[i]>=x) larger++;
	    }
	    ans.push_back(smaller);
	    ans.push_back(larger);
	    return ans;
	}
};

int main(){
    int n,x;
    cin>>n>>x;
    int arr[n];
    for(int i=0;i<n;i++) cin>>arr[n];
    Solution ob;
    auto ans = ob.getMoreAndLess(arr,n,x);
    cout<<ans[0]<<" "<<ans[1]<<"\n";
    return 0;
}
