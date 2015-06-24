package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class pr {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Map<String, Integer> mapA = new HashMap<String, Integer>();
		Map<String, Integer> mapB = new HashMap<String, Integer>();
		Map<String, Integer> mapC = new HashMap<String, Integer>();
		Map<String, Integer> mapD = new HashMap<String, Integer>();
		
		
		File file = new File("/home/animesh/DM/ppd/testData.csv");
		File file1 = new File("/home/animesh/DM/ppd/testData.arff");
		File file2 = new File("/home/animesh/DM/ppd/trainingData_modified_java_key.csv");
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			BufferedWriter out = new BufferedWriter(new FileWriter(file1));
			BufferedReader in2 = new BufferedReader(new FileReader(file2));
			
			String string;
			while((string = in2.readLine())!=null)
			{
				String[] str = string.split(",");
				String keyString = (str[0].split("="))[1].trim();
				int val = Integer.parseInt((str[1].split("="))[1].trim());
				if(keyString.charAt(0)=='A')
					mapA.put(keyString, val);
				if(keyString.charAt(0)=='B')
					mapB.put(keyString, val);
				if(keyString.charAt(0)=='C')
					mapC.put(keyString, val);
				if(keyString.charAt(0)=='D')
					mapD.put(keyString, val);
				
				
			}
			
			in2.close();
			
//			
			
			while ((string = in.readLine())!= null) {
				String[] str = string.split(",");
				int count = 0;
				for (int i = 0; i < str.length; i++) {
					if(str[i].length() != 0)
						count++;
				}
				StringBuffer strOut = new StringBuffer();
				strOut.append((str[0]+","+str[1]));
				
				for (int i = 2; i < str.length; i++) {
					
					if((i-2)%4 == 0)
					{
						if(mapA.containsKey(str[i]))
							strOut.append((","+mapA.get(str[i])));
						else {
//							System.out.println(str[i]);
							strOut.append(","+"?");
						}
							
						
						
					}
					if((i-2)%4 == 1)
					{
						if(mapB.containsKey(str[i]))
							strOut.append((","+mapB.get(str[i])));
						else {
//							System.out.println(str[i]);
							strOut.append(","+"?");
						}
						
					}
					if((i-2)%4 == 2)
					{
						if(mapC.containsKey(str[i]))
							strOut.append((","+mapC.get(str[i])));
						else {
//							System.out.println(str[i]);
							strOut.append(","+"?");
						}
						
					}
					if((i-2)%4 == 3)
					{
						if(mapD.containsKey(str[i]))
							strOut.append((","+mapD.get(str[i])));
						else {
//							System.out.println(str[i]);
							strOut.append(","+"?");
						}
						
					}
					
					
					
				}
				for (int j = str.length; j < 30; j++) {
					strOut.append(","+"?");
				}
				out.write(strOut+"\n");
//				
//				
//	
//			
//			Iterator<Map.Entry<String, Integer>> entries = mapA.entrySet().iterator();
//			while (entries.hasNext()) {
//			    Map.Entry<String, Integer> entry = entries.next();
//			    out2.write("Key = " + entry.getKey() + ", Value = " + entry.getValue()+"\n");
//			}
//			entries = mapB.entrySet().iterator();
//			while (entries.hasNext()) {
//			    Map.Entry<String, Integer> entry = entries.next();
//			    out2.write("Key = " + entry.getKey() + ", Value = " + entry.getValue()+"\n");
//			}
//			entries = mapC.entrySet().iterator();
//			while (entries.hasNext()) {
//			    Map.Entry<String, Integer> entry = entries.next();
//			    out2.write("Key = " + entry.getKey() + ", Value = " + entry.getValue()+"\n");
//			}
//			entries = mapD.entrySet().iterator();
//			while (entries.hasNext()) {
//			    Map.Entry<String, Integer> entry = entries.next();
//			    out2.write("Key = " + entry.getKey() + ", Value = " + entry.getValue()+"\n");
//			}
//			 Collection<Integer> sInteger=mapA.values();
//			 Set<Integer> setA = new HashSet<Integer>(sInteger);
//				
//			Iterator<Integer> itr = setA.iterator();
//			StringBuffer str1 = new StringBuffer();
//			while (itr.hasNext()) {
//				Integer integer = (Integer) itr.next();
//				str1.append((","+integer));
//				
//			}
//			out2.write("\n"+str1);
//			sInteger=mapB.values();
//			 setA = new HashSet<Integer>(sInteger);
//				
//			itr = setA.iterator();
//			str1 = new StringBuffer();
//			while (itr.hasNext()) {
//				Integer integer = (Integer) itr.next();
//				str1.append((","+integer));
//				
//			}
//			out2.write("\n"+str1);
//			sInteger=mapC.values();
//			 setA = new HashSet<Integer>(sInteger);
//				
//			itr = setA.iterator();
//			str1 = new StringBuffer();
//			while (itr.hasNext()) {
//				Integer integer = (Integer) itr.next();
//				str1.append((","+integer));
//				
//			}
//			out2.write("\n"+str1);
//			sInteger=mapD.values();
//			 setA = new HashSet<Integer>(sInteger);
//				
//			itr = setA.iterator();
//			str1 = new StringBuffer();
//			int cc = 1;
//			while (itr.hasNext()) {
//				Integer integer = (Integer) itr.next();
////				if((cc++)%1000 ==0)
////					str1.append(("\n"));
//				str1.append((","+integer));
//				
//				
//			}
//			str1.append("}");
//			out2.write("\n"+str1);
//			
//			out2.close();
			
			
			}
			out.close();
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
