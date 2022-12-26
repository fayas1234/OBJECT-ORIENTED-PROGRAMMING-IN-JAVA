//Java program that shows the usage of try, catch, throws and finally for Employee class

import java.io.*;
import java.util.*;



class Employee
{	
	int empid;
	String num;
	String address;
	String name;
	
	public void setData(int e,String na,String a,String n) throws InputMismatchException //Might throw exception
	{
		empid=e;
		name=na;
		num=n;
		address=a;
		
	}
	
	public void getData()
	{
		System.out.println("EmpID:"+empid+"|"+"Name:"+name+"|"+"Phonenumber:"+num+"|"+"Address:"+address+'\n');
	}
	
}


class Usage
{
	public static void main(String args[]) throws InputMismatchException //Might throw exception
	{
		Employee[] obj=new Employee[5];
		
		int i=0;
		
		int e;
		String num,address,name;
		
		
		
		while(i<5)
		{
			
			try{
			Scanner s=new Scanner(System.in);
			obj[i]=new Employee();
			
			System.out.print("\nEmpID:");
			e=s.nextInt();
			
			System.out.print("\nName:");
			s.nextLine();
			name=s.nextLine();
			
			System.out.print("\nPhonenumber:");
		    num=s.nextLine();
			
			System.out.print("\nAddress:");
			address=s.nextLine();
			
			
			obj[i].setData(e,name,address,num);
			}
			
			catch(InputMismatchException exp)
			{
				System.out.println(exp);
				i--;
			}
			finally //Always executed
			{
				i++;
			}
			
		}
		
		for(i=0;i<5;i++)
		{
			obj[i].getData();
			
			
		}
		
		
	}	
	
}