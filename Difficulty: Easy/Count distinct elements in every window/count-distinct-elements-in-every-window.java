//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.util.HashMap;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            Solution g = new Solution();
            
            ArrayList<Integer> ans = g.countDistinct(a, n, k);

            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


class Solution
{
    ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
          HashMap<Integer,Integer> hashMap =new HashMap<>();
        for(int i=0; i<k;++i)
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);
        ArrayList<Integer> res =new ArrayList<>();
        res.add(hashMap.size());
        for(int i=k; i<n; ++i)
        {
            if(hashMap.get(arr[i-k])==1)
                hashMap.remove(arr[i-k]);
            else hashMap.put(arr[i-k],hashMap.getOrDefault(arr[i-k],0)-1);
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);
            res.add(hashMap.size());
        }
        return res;
    }
}

