//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String str = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.transform(str));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String transform(String s)
    {
      String str="";
        int n=s.length();
        String te=s.charAt(0)+"";
        str+=te.toUpperCase();
        for(int i=1; i<n; ++i)
        {
            if(s.charAt(i-1)==' ')
            {
                String temp=s.charAt(i)+"";
                str+=temp.toUpperCase();
            }
           else  str+=s.charAt(i);
        }

        return str;
    }
}