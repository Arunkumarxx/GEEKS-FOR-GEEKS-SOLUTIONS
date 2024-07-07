//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                String line[]=read.readLine().trim().split(" ");
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int median(int matrix[][], int r, int c) {
        // code here      
        // pick smallest element
        int n= matrix.length;

        int min=matrix[0][0];

        int max=matrix[0][0];
        // find smallest element in matrix
        for (int i=0; i<n;i++)
           min= Math.min(matrix[i][0],min);
        //find largest element in matrix
        for (int i=0; i<n;i++)
            max=Math.max(max,matrix[i][matrix[i].length-1]);

        //median =n*n/2 bcz consider matrix is odd dude.....
        int median=r*c/2;

        while(min<max)
        {
            int mid=(min+max)/2;
            int count=0;
            for (int i=0;i<n; i++)
            {
                count+=countSmallestNumber(matrix[i],mid);
            }
            if(count<=median)
                min=mid+1;
            else max=mid;
        }

        return min;
    }
     static int countSmallestNumber(int [] matrix,int mid) {
        int count=0;
        for (int i=0; i< matrix.length; i++)
        {
            if(matrix[i]<=mid) count++;
        }
        return count;
    }
}