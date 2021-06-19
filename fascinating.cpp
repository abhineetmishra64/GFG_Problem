#include<bits/stdc++.h>
using namespace std;

class Solution{
public:
	
	bool fascinating(int n) {
	    // code here
	    int c=0;
	    int p2 = n*2;
	    int p1 = n*3;
	    unordered_map<int,int> mp;
	    if(n<=99) 
	    return false;
	    while(n){
	        int d=n%10;
	        n=n/10;
	        if(d>=1 && d<=9)
	           { mp[d]++;
	            c++;}
	        }
	        while(p1){
	           long d=p1%10;
	            p1=p1/10;
	            if(d>=1 && d<=9)
	                {mp[d]++;
	                c++;}
	            }
	            while(p2){
	               long d=p2%10;
	                p2=p2/10;
	                if(d>=1 && d<=9)
	                    {mp[d]++;
	                  c++;}
	                }
	          //  if(c!=9) 
	           // return false;
	           
	            if(mp.size()==9 && c==9)
	            return true;
	       
	            return false;} 
	    
};

int main(){
    int n;
    cin>>n;
    Solution ob;
    auto ans = ob.fascinating(n);
    if(ans) cout<<"Fascinating";
    else cout<<"Not Fascinating";
    return 0;
}