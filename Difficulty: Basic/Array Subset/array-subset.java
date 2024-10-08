//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            long a1[] = new long[(int)(n)];
            long a2[] = new long[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a1[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                a2[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Compute obj = new Compute();
            System.out.println(obj.isSubset( a1, a2, n, m));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute {
    public String isSubset( long arr1[], long arr2[], long n, long m) {
        
        HashMap<Long,Integer> freq= new HashMap();
        
        for(int i=0; i<m;++i)
             freq.put(arr2[i], freq.getOrDefault(arr2[i], 0) + 1);
        
        
        for(int i=0;i<n;++i)
        {
            if(freq.containsKey(arr1[i]))
            {
               freq.put(arr1[i], freq.get(arr1[i]) - 1);
                if(freq.get(arr1[i])==0)
                freq.remove(arr1[i]);
            }
            if(freq.isEmpty())
            return "Yes";
        }
        return "No";
        
    }
}