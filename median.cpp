#include<bits/stdc++.h>
using namespace std;

class Solution
{
public:
	public:
		int find_median(vector <int> v)
		{
		    // Code here.
		    int med;
		    size_t size = v.size();
		    size = v.size();
		    for(int i=0;i<size;i++){
		        for(int j=0;j<size;j++){
		            if(v[i]>v[j]){
		                int temp=v[i];
		                v[i]=v[j];
		                v[j]=temp;
		            }
		        }
		        int a=size/2;
		        if(size%2==0){
		            med=(v[a]+v[a-1])/2;
		        }
		        else{
		            med=v[a];
		        }
		    }
		    return med;
		}
};

int main(){
    int n;cin>>n;
    vector<int>v(n);
    for(int i=0;i<n;i++) cin >> v[i];
    Solution ob;
    int ans = ob.find_median(v);
    cout<<ans<<endl;
}