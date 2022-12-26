
//Java program that read from a file and write to file by handling all file related exceptions

import java.io.*;
import java.util.*;

class FileHandler
{
	
	
	public static void main(String args[]) throws IOException,FileNotFoundException //Expect Exceptions
	{
		
		
		
		PrintWriter pw=null;
		try
		{
		
			
			pw=new PrintWriter(new FileWriter("C:\\Users\\fayas\\OneDrive\\Desktop\\JAVA\\FILE\\file2.txt"));
			
			File f=new File("C:\\Users\\fayas\\OneDrive\\Desktop\\JAVA\\FILE\\file1.txt");
		
			Scanner s=new Scanner(f);
			
			
			
			while(s.hasNextLine())
			{
				String data=s.nextLine();
				pw.println(data);
			}
			System.out.println("FILE CONTENTS of file1.txt COPIED to file2.txt");
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		finally //Always executed
		{
			
			pw.close();
			
			
		}
		
	}
}
		
		
		
		
		