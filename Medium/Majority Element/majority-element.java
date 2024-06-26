//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
         int ca=a[0],cc=1;
       
       for(int i=1;i<size;i++)
       {
           if(a[i]==ca) cc++;
           else
           {
               cc--;
               if(cc<0)
               {
                   ca=a[i];
                   cc=1;
               }
           }
       }
       
       int cnt=0;
       for(int i=0;i<size;i++)
       {
           if(ca==a[i]) cnt++;
       }
       
       return cnt>size/2?ca:-1;
    }
}