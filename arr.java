import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GFG{
    public static void main(String[]args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str;
        String st[];
        int sum = 0;
        int A[] = new int[N];
        str = br.readLine();
        st = str.split(" ");
        for(int i=0;i<N;i++){
            A[i] = Integer.parseInt(st[i]);
            sum+=A[i];
        }
        Compute ob = new Compute();
        String s = ob.average(A,N);
        System.out.println(sum+" "+s);
    }
}

class Compute
{
    String average(int A[], int N)
    {
        int i;
        float sum=0;
        for(i=0;i<N;i++){
            sum = sum + A[i];
        }
        float avg;
        avg = sum/N;
        String s=String.format("%.2f",avg);
        return s;
    }
}