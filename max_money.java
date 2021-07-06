import java.io.*;
import java.util.*;

class max_money{
    public static void main(String args[]) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String St[] = read.readLine().split(" ");
        int N = Integer.parseInt(St[0]);
        int K = Integer.parseInt(St[1]);

        Solution ob = new Solution();
        System.out.println(ob.maximizeMoney(N,K));
    }
}

class Solution {
    static int maximizeMoney(int N , int K) {
        // code here
        int sum = 0;
        for(int i=0;i<N;i+=2){
            sum = sum + K;
        }
        return sum;
    }
};