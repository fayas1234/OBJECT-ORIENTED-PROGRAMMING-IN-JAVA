//File handling program in Java with reader/writer

import java.io.*;
import java.util.*;



class FileOperations
{
	public static void main(String args[])
	{
		
		FileWriter fw=null;
		FileReader fr=null;
		char c;
		
		try
		{
		
			fw=new FileWriter("C:\\Users\\fayas\\OneDrive\\Desktop\\JAVA\\FILE\\file3.txt",true); //Creates a new file if file not there
			Scanner s=new Scanner(System.in);
			
			do
			{
				System.out.print("Enter a Line:");
				String str=s.nextLine();
				
				fw.write(str+'\n');
				
				System.out.print("Do you want to continue:");
				c=s.nextLine().charAt(0);
			
			}while(c=='y'||c=='Y');
			
			fw.close();
			
			int ch;
			fr=new FileReader("C:\\Users\\fayas\\OneDrive\\Desktop\\JAVA\\FILE\\file3.txt");
			
			System.out.println("\n\nThe content of the file is:");
			while((ch=fr.read())!=-1) //Reading character by character until EOF
			{
				System.out.print((char)ch);
			}
			
			fr.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
	
}
