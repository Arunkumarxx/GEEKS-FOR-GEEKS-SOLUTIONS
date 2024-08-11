//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

class Solution {

    int search(String pattern, String str) {
        int n1=str.length();
        int n2=pattern.length();

        if(n2>n1) return 0;

        int result=0;
        int [] windowHash  =new int[26];
        int [] patternHash = new int[26];

        for(int j=0; j<n2; ++j)
            ++patternHash[pattern.charAt(j)-'a'];

        for(int i=0; i<n2; ++i)
            ++windowHash[str.charAt(i)-'a'];

        if(isMatchFound(windowHash,patternHash))
            ++result;
        for(int i=n2; i<n1; ++i)
        {
            --windowHash[str.charAt(i-n2)-'a'];
            ++windowHash[str.charAt(i)-'a'];
            if(isMatchFound(windowHash,patternHash))
                ++result;
        }
        return result;
    }
    
    private static boolean isMatchFound(int[] windowHash, int[] patternHash) {
        for(int i=0; i<26;++i)
        {
            if(windowHash[i]!=patternHash[i])
                return false;
        }
        return true;
    }
    
}