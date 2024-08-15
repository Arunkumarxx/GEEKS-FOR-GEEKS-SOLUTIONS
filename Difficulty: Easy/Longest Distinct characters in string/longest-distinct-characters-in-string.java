//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String str){
        HashSet<Character> hashSet =new HashSet<>();
        int i=0 ,j =0 ,n =str.length();
        int max=0;
    
        while(j<n)
        {
            if(!hashSet.contains(str.charAt(j)))
            {
                hashSet.add(str.charAt(j));
                ++j;
                if(j-i>max)
                    max=j-i;
            }
            else  {
                hashSet.remove(str.charAt(i));
                ++i;
            }
        }
        return max;
        
    }
}