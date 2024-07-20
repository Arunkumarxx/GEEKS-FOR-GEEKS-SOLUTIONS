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
            String s;
            s = sc.next();
           
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String modify (String str)
    {
        // your code here
        
        char[] chars = str.toCharArray();  // More concise way to convert to char array

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            // Move start index to the next vowel
            while (start < end && !isVowel(chars[start])) {
                ++start;
            }

            // Move end index to the previous vowel
            while (start < end && !isVowel(chars[end])) {
                --end;
            }

            // Swap vowels
            if (start < end) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;

                ++start;
                --end;
            }
        }

        // Convert char array back to string and print result
        String result = new String(chars);
        return result;
    }
    

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}