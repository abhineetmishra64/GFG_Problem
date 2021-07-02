import java.util.*;
import java.lang.*;
import java.io.*;

class rt_arr {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		// int t = sc.nextInt();
		// while(t--){
		    
        //     }
        int n = sc.nextInt();
        int d = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> c = new ArrayList<Integer>();
	    for(int i=0;i<n;i++){
            int b = sc.nextInt();
	        a.add(b);
	    }
        for(int i=0;i<d;i++){
            c.add(a.get(i));
        }
        for(int i=0;i<n;i++){
            if(i<(n-d)) a.set(i,a.get(i+d));
            else a.set(i,c.get((i+d)-i-1));
        }
        System.out.println(a);
	}
}

//second largest
nt i, largest= arr[0], sec=0;
	    
	    for(i=1;i<n;i++)
        {
            if(largest < arr[i])
            {
                sec = largest;
                largest = arr[i];
            }
            if(sec < arr[i] && arr[i] < largest)
                sec = arr[i];
        }
        if(sec == 0)
            return -1;
        return sec;