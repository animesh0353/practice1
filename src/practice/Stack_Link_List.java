package practice;
import java.util.*;
public class Stack_Link_List {

	public static void main(String[] args) {
		
		
	//	Scanner in1 = new Scanner(System.in);
		
//		int a1 = in1.nextInt();
//		
//		Stack stk = new Stack();
//		
//		stk.push("HI");
//		stk.push("How are you");
//		System.out.print(stk.peek());
//		stk.push("fine");
//		while(!stk.empty())
//		{
//			System.out.println(stk.pop());
//		}
//		
//		Scanner in = new Scanner(System.in);
//		int a = in.nextInt();
		
		
//		merge m = new merge();
//		String[] s1 = {"Animesh","kumar","Singh"};
//		String[] s2 = {"hello","how","are","you"};
//		ArrayList<String> str = m.merge1(s1, s2);
//		for (String s: str ) System.out.println(s);
//		boolean[] ani = new boolean[2];
//		for (boolean s : ani) System.out.println(s);
		
//		Q1_1 q = new Q1_1();
//		System.out.println(q.unique("animeshlurk"));
		
//		String str = "animeshlumar";
//		System.out.println(str);
//		StringBuffer s = new StringBuffer(str);
//		s.reverse();
//		System.out.println(s);
//		q1_2 q2 = new q1_2();
//		q2.reverse(str);
//		System.out.println(str);
//		Iterator<String> itr = str.iterator();
//		while (itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		Anagram a = new Anagram();
		System.out.println(a.ana("animesh", "meshani"));
		
		String s = "AanimeshN";
		char[] ch = s.toCharArray();
		java.util.Arrays.sort(ch);
		System.out.println(ch);
		
		
	}
	
}
