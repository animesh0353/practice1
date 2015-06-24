package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Solution{
	   
	public static class Point
	{
		int i;
		int j;
		Point(int i, int j)
		{
			this.i = i;
			this.j = j;
		}
	}
	public static Point search(int[][] mat, int n , int item)
	{
		
			for (int j = n -1 ,  i =0; j >= 0 && i<n; ){
				if(mat[i][j] == item)
					return new Point(i,j);
				else
				{
					if(mat[i][j] < item)
						i++;
					else
						j--;
				}
			}
			
		
		return null;
	}
	
    public static void main(String []args)
    {
    	
//    	Scanner in = new Scanner(System.in);
//    	int t = Integer.parseInt(in.nextLine());
//    	for (int i = 0; i < t; i++) {
//			int n = Integer.parseInt(in.nextLine());
//			char[][] arr = new char[n][n];
//			for (int j = 0; j < n; j++) {
//				String string = in.nextLine();
//				arr[i] = string.toCharArray();
//			}
//			
//			for (int j = 0; j < n; j++) {
////				Arrays.sort(arr[i]);
//				Arrays.sort(arr, new Comparator<char[]>() {
//				    public int compare(char[] o1, char[] o2) {
//				        return Character.compare(o2[j], o1[j]);
//				    }
//				});
//			}
//		}
    	
    	int[][] mat = { {10, 20, 30, 40},
                {15, 25, 35, 45},
                {20, 25, 37, 48},
                {32, 33, 39, 50},
              };
    	Point point = search(mat, 4, 24);
    	if(point == null)
    		System.out.println("Item is not present ");
    	else
    		System.out.println(point.i +"   "+ point.j);


    }
}
