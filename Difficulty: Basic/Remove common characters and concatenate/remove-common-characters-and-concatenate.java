//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        
        while(t--!=0){
            String s1=in.next(),
                   s2=in.next();
            
            Solution obj = new Solution();
            
            System.out.println(obj.concatenatedString(s1,s2));
        }
    }
}

// } Driver Code Ends




class Solution
{
    //Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1,String s2)
    {
      String ans = "";
        for(int i = 0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(s2.indexOf(ch)==-1)
                ans+=ch;
        }
        for(int i = 0;i<s2.length();i++){
            char ch = s2.charAt(i);
            if(s1.indexOf(ch)==-1)
                ans+=ch;
        }
        return ans==""?"-1":ans;
    }
}
