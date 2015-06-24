package practice;

import java.util.ArrayList;

public class merge {
	public ArrayList<String> merge1(String[] a , String[] b)
	{
		ArrayList<String> str = new ArrayList<String>();
		for (String s : a) str.add(s);
		for (String s : b) str.add(s);
		return str;
	}

}
