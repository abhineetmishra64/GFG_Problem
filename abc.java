import java.util.*;
import java.io.*;
class abc{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a[],b;
        a = new int[n][n];
        b = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            b[i] = sc.nextInt();
        }
        Complete obj = new Complete();
        ArrayList<Integer> ans;
        ans = obj.array(a,b,n);
        for(int i:ans){
            System.out.print(i+" ");
        }
        System.out.println( );
    }
}

class Complete
{
    public static ArrayList<Integer> array(int a[][], int b[], int n)
    {
        // Complete the function
        int max = b[0];
        int sum = 0;
        ArrayList<Integer> res = new ArrayList<Integer>(2);
        for(int i=1;i<n;i++){
            if(max<b[i]) max = b[i];
        }
        for(int i=0;i<n;i++){
            sum = a[i][i]+sum;
        }
        res.add(sum);
        res.add(max);
        return res;
    }
}
