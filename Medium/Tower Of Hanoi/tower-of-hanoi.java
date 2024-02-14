//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();//total testcases
        while (T-- > 0) {
            Hanoi obj = new Hanoi();
            int N;
            
            //taking input N
            N = sc.nextInt();

            //calling toh() method 
            System.out.println(obj.toh(N, 1, 3, 2));
        }
    }
}






// } Driver Code Ends


// User function Template for Java


// avoid space at the starting of the string in "move disk....."
class Hanoi {
static int TowerOfHanoiUsingRecursion(int n,int src,int aux,int des){
if(n==1){
    System.out.println("move disk "+n+" from rod "+src+ " to rod "+des);
    return 1;
}
int count=0;
   count+=TowerOfHanoiUsingRecursion(n-1,src,des,aux);
   System.out.println("move disk "+n+" from rod "+src+" to rod "+des);
   count+=TowerOfHanoiUsingRecursion(n-1,aux,src,des);
   return count+1;
   
    
}
    public long toh(int N, int from, int to, int aux) {
        // Your code here
return   (long) TowerOfHanoiUsingRecursion (N,from,aux,to) ;  
    }
}
