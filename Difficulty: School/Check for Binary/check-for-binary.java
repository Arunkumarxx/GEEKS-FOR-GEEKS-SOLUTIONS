//{ Driver Code Starts
import java.util.*;


class checkBinary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T>0)
		{
			String str = sc.nextLine();
			GfG g = new GfG();
			boolean b = g.isBinary(str);
			if(b== true)
				System.out.println(1);
			else
			    System.out.println(0);
		T--;
		}
	}
}


// } Driver Code Ends


class GfG
{
	boolean isBinary(String str)
	{
	  //Your code here
	  int start=0;
	  int end=str.length()-1;
	  while(start<end)
	  {
	      if(!((str.charAt(start)=='1')||(str.charAt(start)=='0')))
	      return false;
	      
	      if(!((str.charAt(end)=='1')||(str.charAt(end)=='0')))
	      return false;
	      
	      ++start;
	      --end;
	  }
	  if(start==end)
	       if(!((str.charAt(start)=='1')||(str.charAt(start)=='0')))
	      return false;
	      
	  return true;
	}
}