//Program to find the frequency of a given character in the string

import java.io.*;

class Output
{
	String str;
	char c; //c is the character whose frequency is to be found
	
	void countcalc()
	{
		System.out.println("The given string is:"+str);
		System.out.println("The given character is:"+c);
		
		int count=0,i;
		
		int len=str.length();
		
		for(i=0;i<len;i++)
		{
			if(str.charAt(i)==c)
			{
				count+=1;
			}
		}
		
		System.out.println("The frequency of the given character"+" "+c+" "+"in the string is:"+count);
	}
}


class Frequency
{
	
	public static void main(String arg[])
	{
		Output s=new Output();
		
		s.str="malayalam";
		s.c='a';
		
		s.countcalc();
		
	}
	
}
