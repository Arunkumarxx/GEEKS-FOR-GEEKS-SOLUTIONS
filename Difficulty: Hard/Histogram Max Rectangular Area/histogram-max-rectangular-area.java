//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            String inputLine[] = br.readLine().trim().split(" ");
            long[] arr = new long[(int)n];
            for (int i = 0; i < n; i++) arr[i] = Long.parseLong(inputLine[i]);
            System.out.println(new Solution().getMaxArea(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    private StackNode head;
    private class StackNode
    {
        long data;
        StackNode next;
        StackNode(long value)
        {
            this.data=value;
            this.next=null;
        }
    }
    private void push(long value)
    {
        StackNode newNode =new StackNode(value);
        newNode.next=head;
        head=newNode;
    }
    private boolean isEmpty()
    {
        return head==null;
    }
    private long pop()
    {
        long x=head.data;
        head=head.next;
        return x;
    }
    private long top()
    {
        return head.data;
    }
    private void  clear()
    {
        head=null;
    }
    
    private static long [] previousSmallerElement(Solution stack,long [] arr)
    {
        long res []=new long[arr.length];
        long n=arr.length;
        for(int i=0; i<n;++i)
        {
            while(!stack.isEmpty() && arr[(int)stack.top()]>=arr[i])
                stack.pop();
            res[i]=stack.isEmpty()?-1:stack.top();
            stack.push(i);
        }
        return res;
    }
    private static long [] nextSmallerElement(Solution stack,long [] arr)
    {
        int n= arr.length;;
        long res[]= new long[n];
        for(int i=n-1; i>=0; --i)
        {
            while(!stack.isEmpty() && arr[(int)stack.top()]>=arr[i])
                stack.pop();
            res[i]=stack.isEmpty()?n:stack.top();
            stack.push(i);
        }
        return res;
    }
    public static long getMaxArea(long arr[]) {
        Solution stack = new Solution();
        long[] pse=previousSmallerElement(stack,arr);
        stack.clear();
        long[] nse=nextSmallerElement(stack,arr);
        int n= arr.length;
        long max=0;
        for(int i=0;i<n;++i)
        {
            long width=nse[i]-pse[i]-1;
            long area=width*arr[i];
            if(area>max)
                max=area;
        }
        return max;
    }
}
