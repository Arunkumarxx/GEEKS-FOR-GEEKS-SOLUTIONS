//{ Driver Code Starts
import java.util.*;

class FindMinCost
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[][] = new int[n][m];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().maxArea(arr, n, m));
		t--;
		}
	}
}
// } Driver Code Ends


/*Complete the function given below*/
class Solution {
    public int maxArea(int M[][],int n,int m) {
        int[] heights=new int[m];
        int maxArea=0;
        for(int j=0;j<m;j++)
            heights[j]=M[0][j];
        maxArea=getMaxArea(heights,m);
        for(int i=1;i<n;i++) {
            for(int j=0;j<m;j++)
                heights[j]=(M[i][j]==1)?heights[j]+1:0;
            maxArea=Math.max(getMaxArea(heights,m),maxArea);
        }
        return maxArea;
    }
    public int getMaxArea(int[] heights,int n) {
        int[] nsl=nearestSmallerToLeft(heights,n);
        int[] nsr=nearestSmallerToRight(heights,n);
        int maxArea=0;
        for(int i=0;i<n;i++) {
            int width=nsr[i]-nsl[i]-1;
            int area=heights[i]*width;
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
    private int[] nearestSmallerToLeft(int[] heights,int n) {
        Stack<Integer> stack=new Stack<>();
        int[] result=new int[n];
        for(int i=0;i<n;i++) {
            while(!stack.isEmpty()&&heights[stack.peek()]>=heights[i])
                stack.pop();
            result[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        return result;
    }
    private int[] nearestSmallerToRight(int[] heights,int n) {
        Stack<Integer> stack=new Stack<>();
        int[] result=new int[n];
        for(int i=n-1;i>=0;i--) {
            while(!stack.isEmpty()&&heights[stack.peek()]>=heights[i])
                stack.pop();
            result[i]=stack.isEmpty()?n:stack.peek();
            stack.push(i);
        }
        return result;
    }
}

