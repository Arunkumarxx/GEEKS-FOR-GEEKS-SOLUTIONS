//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    static ArrayList<String> perm =new ArrayList();
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        perm.clear();
         permutations(S,"");
         Collections.sort(perm);
         return perm;
    }
    private static void permutations(String str,String prefix){
        if(str.length()==0)
            perm.add(prefix);
        else {
            for (int i = 0; i < str.length(); ++i) {
                String string = str.substring(0, i) + str.substring(i + 1);
                permutations(string,prefix+str.charAt(i));
            }
        }
    }
	   
}
