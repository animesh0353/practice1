package practice;

public class q1_2 {
	void reverse(String str1)
	{
		char[] str = str1.toCharArray();
		int size = str.length - 1;
		int i = 0;
		char ch ;
		while(i < size)
		{
			ch  = str[i];
			str[i++] = str[size];
			str[size--] = ch;
			
		}
		System.out.println(str);
	}

}
