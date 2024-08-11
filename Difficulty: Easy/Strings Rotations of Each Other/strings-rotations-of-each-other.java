//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException{
		
		//taking input using BufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//taking total count of testcases
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    //Reading the two Strings
		    String s1 = br.readLine();
		    String s2 = br.readLine();
		    
		    //Creating an object of class Rotate
		    Solution obj = new Solution();
		    
		    //calling areRotations method 
		    //of class Rotate and printing
		    //"1" if it returns true
		    //else "0"
		    if(obj.areRotations(s1,s2))
		    {
		        System.out.println("1");
		    }
		    else
		    {
		        System.out.println("0");
		    }
		}
	}
}
// } Driver Code Ends



class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        int [] lsp=new int[s2.length()];
        BuildLSP(s2,lsp);
        String concat = s1+s1;
        int n=concat.length();
        int n2=s2.length();
        int j=0;
        int i=0;
        while(i<n && j<n2)
        {
            if(concat.charAt(i)==s2.charAt(j))
            {
                ++i;
                ++j;
                
            }
            if(j==n2 )
                return true;
            if(i<n && concat.charAt(i)!=s2.charAt(j))
                if(j!=0)
                    j=lsp[j-1];
                else ++i;
        }
        return false;
        
    }
    private static void BuildLSP(String pattern,int [] lps) {
        int i=0;
        int j=1;
        lps[i]=0;
        int n=pattern.length();
        while(j<n)
        {
            if(pattern.charAt(i)==pattern.charAt(j))
            {
                ++i;
                lps[j]=i;
                ++j;
            }
            else {
                if(i!=0)
                    i=lps[i-1];
                else {
                    lps[j]=0;
                    ++j;
                }
            }
        }
        
    }
    
    
}