//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());// input size of array
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
		}
	}
}



// } Driver Code Ends


class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int a[], int n) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int s = 0, s1 = 0, s2 = 0;
        for(int i : a) {
            s += i;
            
            s1 += i;
            if(s1 > max) max = s1;
            if(s1 < 0) s1 = 0;
            
            s2 += i;
            if(s2 < min) min = s2;
            if(s2 > 0) s2 = 0;
        }
        
        if(max < 0) return max;
        return Math.max(max,s-min);
    }
    
}

