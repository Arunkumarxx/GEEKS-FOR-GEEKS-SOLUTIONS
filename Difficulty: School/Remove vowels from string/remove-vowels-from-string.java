//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeVowels(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeVowels(String s) {
        StringBuilder result = new StringBuilder(); // Use StringBuilder for efficient string manipulation
        
        for (int i = 0; i < s.length(); ++i) {
            if (!isVowel(s.charAt(i))) {
                result.append(s.charAt(i)); // Append non-vowel characters
            }
        }
        
        return result.toString(); // Convert StringBuilder to String
    }
    
    private static boolean isVowel(char c) {
        // Check if the character is a vowel
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
