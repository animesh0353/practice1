package practice;

public class StackNode {

	int top;
	int[] capacity = new int[10]; 
//	StackNode next;
	
	
	int peek()
	{
		if (top == -1 )
		{
			return -1;
		}
		else 
			return capacity[top];
	}
	
	int pop()
	{
		if (top == -1 )
		{
			return -1;
		}
		else 
			return capacity[top--];
		
	}
	
	void push(int item)
	{
		if(top<10)
			capacity[++top]=item;
		else
			System.out.println("Stack is overflowing");
		
	}
}

