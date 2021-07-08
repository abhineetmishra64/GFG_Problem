import java.io.*;

class max_c_sum{
    public static void main(String args[])throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int arr[] = new int[n];
        String inputLine[]=br.readLine().trim().split(" ");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(inputLine[i]);
        }
        max_c_sum1 obj = new max_c_sum1();
        System.out.println(obj.maxSubarraySum(arr,n));
    }
}

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int max_so_far = arr[0];
        int curr_max = arr[0];
 
        for (int i = 1; i < n; i++)
        {
            curr_max = Math.max(arr[i], curr_max+arr[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }
}
