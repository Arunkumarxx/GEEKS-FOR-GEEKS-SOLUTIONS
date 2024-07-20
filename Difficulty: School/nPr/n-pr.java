//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            Long n = Long.parseLong(a[0]);
            Long r = Long.parseLong(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.nPr(n, r));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long nPr(long n, long r){
        // code here
        
        if (r > n) {
            return 0; // Permutations are not defined for r > n
        }

        // Compute n! and (n - r)!
        long factorialN = 1;
        long factorialNR = 1;

        for (int i = 1; i <= n; i++) {
            factorialN *= i;
            if (i <= n - r) {
                factorialNR *= i;
            }
        }

        // Return nPr = n! / (n - r)!
        return factorialN / factorialNR;
    }
}