package practice;

import java.util.Scanner;

public class Stack_Array {

	public static void main(String[] args) {
		

		StackNode stk = new StackNode();
		boolean ch = true;
		int choice;
			
		do
		{
			System.out.println("Press 1 to Push "+"\n"+"Press 2 to Pop\nPress 3 to Peek");
			Scanner in = new Scanner(System.in); 
			choice = in.nextInt();
			switch(choice)
			{
			case 1: 
				System.out.println("Enter the item to insert in stack");
				stk.push(in.nextInt());
				break;
			case 2: System.out.println(stk.pop()); break;
			case 3: System.out.println(stk.peek()); break;
			default : System.out.println("Please Enter valid option");
			
			
			}
			System.out.print("Do you want to continue true or false: ");
			ch = in.nextBoolean();
			
			
		}while(ch == true);

	}

}
