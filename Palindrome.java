//Program to check for palindrome string

import java.io.*;

class Output
{
	String str;
	
	void palindrome()
	{
		System.out.println("THE GIVEN STRING IS:"+str+"\n");
		
		int f=1;
		
		int len=str.length();
		
		int i,j=0;
		
		for(i=len-1;i>j;i--)
		{
			
			if(str.charAt(i)!=str.charAt(j))
			{
				f=0;
				break;
			}
			j++;
		}
		
		if(f==1)
		{
			System.out.println("Palindrome String");
		}
		
		else
		{
			System.out.println("Not a Palindrome String");
			
		}
	}
		
}


class Palindrome
{
	
	public static void main(String arg[])
	{
		Output s=new Output();
		
		s.str="MALAYALAM";
		
		s.palindrome();
		
	}
	
}
