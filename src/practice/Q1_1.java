package practice;

public class Q1_1 {

	boolean unique(String str)
	{
		
		boolean[] char_at = new boolean[256];
		if (str.length()>256)
			return false;
		else
		{
			for (int i = 0 ; i < str.length(); i++)
			{
				int j = str.charAt(i);
				if (char_at[j])
					return false;
				else
					char_at[j] = true;
			}
		}
		
		return true;
	
	}
	
}
