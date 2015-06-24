package practice;

public class Anagram {
	
	boolean ana(String str, String str1)
	{
		int [] bool = new int[256];
		if (str.length() != str1.length())
			return false;
		else
		{
			for (int i=0; i<str.length(); i++)
			{
				int val = str.charAt(i);
				bool[val]++;
				
			}
			for (int i=0; i<str1.length(); i++)
			{
				int val = str1.charAt(i);
				bool[val]--;
			}
			for (int i=0 ; i<256; i++)
			{
				if(bool[i] != 0)
					return false;
			}
		}
		
		
		
		return true;
		
	}

}
