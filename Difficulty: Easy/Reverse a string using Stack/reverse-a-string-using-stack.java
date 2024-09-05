//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}

// } Driver Code Ends


class Solution {
    private StackNode head;
    private class StackNode
    {
        char data;
        StackNode next;

        StackNode(char data)
        {
            this.data=data;
            this.next=null;
        }
    }
    private void  push(char value)
    {
        StackNode newNode=new StackNode(value);
        newNode.next=head;
        head=newNode;
    }

    private char  pop()
    {
        if(head==null)
            return ' ';
        char x=head.data;
        head=head.next;
        return x;
    }
    public String reverse(String input){
        Solution stack =new Solution();
        for(int i=0; i<input.length(); ++i)
            stack.push(input.charAt(i));
        String result="";
        while (stack.head!=null)
        {
            result+=stack.pop();
        }
        return result;
    }

}