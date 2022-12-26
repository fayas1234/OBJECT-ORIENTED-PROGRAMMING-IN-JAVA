//Program to implement StringTokenizer

import java.io.*;
import java.util.*; /* To use StringTokenizer class */

class Token
{
	public static void main(String args[])
	{
		System.out.println("\nEnter a line of integers:");
		Scanner s=new Scanner(System.in);
		
		String name=s.nextLine();
		int sum=0,i;
		
		StringTokenizer st=new StringTokenizer(name,"$");
		System.out.println("\nIntegers:");
		
		while(st.hasMoreTokens())
		{
			i=Integer.parseInt(st.nextToken()); /* To convert String to int*/
			
			sum+=i;
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("\n\nSum of the integers:"+sum);
	}
}
