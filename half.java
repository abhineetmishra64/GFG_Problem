import java.io.*;
import java.util.*;

class half{
    public static void main(String []args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String a[] = in.readLine().trim().split("\\s+");
        int N = Integer.parseInt(a[0]);
        int M = Integer.parseInt(a[1]);
        Solution ob = new Solution();
        System.out.println(ob.mthHalf(N,M));
    }
}

class Solution{
    static int mthHalf(int N, int M){
        // code here
        for(int i=1;i<M;i++){
            N = N/2;
        }
        return N;
    }
}
