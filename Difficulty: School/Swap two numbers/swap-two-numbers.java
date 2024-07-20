//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            Solution ob = new Solution();
            List<Integer> ans = ob.get(a,b);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static List<Integer> get(int a,int b)
    {
        // code here
        /*
    13= 13+9    22  a=a+b
    9=22-9      13  b=a-b
    13=22-13    9   a=a-b;
        */
        a=a+b;
        b=a-b;
        a=a-b;
        
      ArrayList<Integer> list = new ArrayList<Integer>();
      list.add(a);
      list.add(b);
      return list;
    }
}