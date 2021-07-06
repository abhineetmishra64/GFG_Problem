import java.io.*;
import java.util.*;

class first_letter{
    public static void main(String []args) throws IOException{
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String S = read.readLine();
        Solution ob = new Solution();
        String result = ob.firstAlphabet(S);
        System.out.println(result);
    }
}

class Solution {
    String firstAlphabet(String S) {
        // code here
        String res = new String();
        res+=S.charAt(0);
        for(int i=1;i<S.length();i++){
            if(S.charAt(i-1)==' ') res+=S.charAt(i);
        }
        return res;
    }
};
