#include<stdio.h>
using namespace std;

int largest(int arr[], int n) 
{
    int max = arr[0];
    for(int i=1;i<n;i++){
        if(arr[i]>max) max = arr[i];
    }
    return max;
}

int main(){
    int i,n;
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++) scanf("%d",&arr[i]);
    printf("%d",largest(arr,n));
    printf("\n");
    return 0;
} 
