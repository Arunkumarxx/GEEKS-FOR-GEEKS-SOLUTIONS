//{ Driver Code Starts
import java.util.Scanner;

class PrintPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            GfG g = new GfG();
            g.printPat(n);
            System.out.println();

            t--;
        }
    }
}
// } Driver Code Ends


class GfG {
    void printPat(int n) {
        // Your code her
        
         for (int i = n; i >= 1; --i) {
           for (int j = n; j >= 1; --j) {
               for (int k = 0; k < i; k++) {
                   System.out.print(j + " ");
               }
           }
           System.out.print("$");
       }
    }
}