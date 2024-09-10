//{ Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}



// } Driver Code Ends


class GfG
{
    private StackNode head;
    private class StackNode{
        int value;
        int min;
        StackNode next;
        
        StackNode(int value,int min)
        {
            this.value=value;
            this.min=min;
        }
    }
    private StackNode top ()
    {
        return head;
    }
    GfG()
	{
	    
	}
	
    /*returns min element from stack*/
    int getMin()
    {
        if(head==null)
        return -1;
        return head.min;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
        if(head==null)
        return -1;
        int value=head.value;
        head=head.next;
        return value;
    }

    /*push element x into the stack*/
    void push(int x)
    {
	if(head==null){
        StackNode newNode =new StackNode(x,x);
        newNode.next=head;
        head=newNode;
        }
        else
        {
            int min=top().min;
            if(x<min)
            {
                StackNode newNode = new StackNode(x,x);
                newNode.next=head;
                head=newNode;
            }
            else
            {
                StackNode newNode =  new StackNode(x,min);
                newNode.next=head;
                head=newNode;
            }
        }	
    }	
}

