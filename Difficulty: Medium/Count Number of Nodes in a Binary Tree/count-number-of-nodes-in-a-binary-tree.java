//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] v = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = sc.nextInt();
            }
            Node root = new Node(v[0]);
            int cnt = 0;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            Node cur = null;
            for (int i = 1; i < n; i++) {
                Node node = new Node(v[i]);
                if (cnt == 0) {
                    cur = q.peek();
                    q.poll();
                }
                if (cnt == 0) {
                    cnt++;
                    cur.left = node;

                } else {
                    cnt = 0;
                    cur.right = node;
                }
                if (v[i] >= 0) {
                    q.add(node);
                }
            }

            Solution obj = new Solution();
            int ans = obj.countNodes(root);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
    public static int countNodes(Node root) {
        Node lnode=root;
        Node rnode=root;
        int l=0;
        int r=0;
        while(lnode!=null)
        {
            ++l;
            lnode=lnode.left;
        }
        while(rnode!=null)
        {
            ++r;
            rnode=rnode.right;
        }
        int res=0;
        if(l!=r)
        {
            Queue<Node> q =new LinkedList<Node>();
            q.add(root);
            while(!q.isEmpty())
            {
                int size=q.size();
                res+=size;
                for(int i=0;i<size;++i)
                {
                    Node curr=q.poll();
                    if(curr.left!=null)
                    q.add(curr.left);
                    if(curr.right!=null)
                    q.add(curr.right);
                }
            }
        }
        else res=(int)Math.pow(2,l)-1;
        return res;
    }
}