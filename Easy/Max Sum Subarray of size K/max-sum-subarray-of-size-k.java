//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends

class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        long cSum=0; 
        long mSum=Integer.MIN_VALUE;
        for(int i=0; i<K; i++)
        {
            cSum+=Arr.get((int)i);
        }
         mSum= Math.max(cSum,mSum);
        for(int i=K; i<N; i++)
        {
            cSum=cSum-Arr.get((int)i-K)+Arr.get((int)i);
           mSum= Math.max(cSum,mSum);
        }
        return mSum;
        
    }
}