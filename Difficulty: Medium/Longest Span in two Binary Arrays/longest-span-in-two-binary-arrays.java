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
            int n = Integer.parseInt(br.readLine().trim());

            boolean arr1[] = new boolean[n];
            boolean arr2[] = new boolean[n];
            String[] str = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr1[i] = str[i].equals("1") ? true : false;
            }
            str = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr2[i] = str[i].equals("1") ? true : false;
            }

            int ans = new Solution().longestCommonSum(arr1, arr2, n);

            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int longestCommonSum(boolean arr1[], boolean arr2[], int n) {
        // code here
         int []  temp =  new int [n];
        int tn= temp.length;
        for (int i=0; i<tn; ++i)
        {
            int one=arr1[i]?1:0;
            int two=arr2[i]?1:0;
            temp[i]=one-two;
        }
        int sum=0;
        int res=0;
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        hashMap.put(0,-1);
        for (int i=0; i<tn;++i)
        {
            sum+=temp[i];
            if(sum==0 || hashMap.containsKey(sum))
                if(i-hashMap.get(sum)>res)
                    res=Math.max(res,i-hashMap.get(sum));
            if(!hashMap.containsKey(sum))
                hashMap.put(sum,i);
        }
        
        return res;
    }
}