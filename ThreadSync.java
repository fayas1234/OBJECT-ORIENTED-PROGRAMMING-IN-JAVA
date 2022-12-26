//Program to implement Thread Synchronization

import java.io.*;
import java.util.*;
import java.lang.*;

class DisplayNum
{
	synchronized public void display(int num) /*Synchronized method inorder to avoid mixing of the odd and even numbers*/
	{
		if(num==1)
			System.out.print("Odd Numbers:");
		
		else if(num==2)
			System.out.print("\n\nEven Numbers:");
		
		System.out.print(num+"\t");

	}
}


class EvenThread extends Thread
{
	
	DisplayNum dn;
	
	EvenThread(DisplayNum dn)
	{
		this.dn=dn;
	}
	
	public void run()
	{
	
		for(int i=1;i<=100;i++) /*printing Even numbers from 1 to 100 both inclusive*/
		{
			if(i%2==0)
			{
				dn.display(i);
			}
		}
		
	}
	
	
}


class OddThread extends Thread
{

	DisplayNum dn;
	
	OddThread(DisplayNum dn)
	{
		this.dn=dn;
	}
	
	public void run()
	{

		for(int i=1;i<=100;i++) /*printing Odd numbers from 1 to 100 both inclusive*/
		{
			if(i%2!=0)
			{
				dn.display(i);
			}
		}
	}
	
}



class ThreadSync
{
	public static void main(String args[])
	{
		DisplayNum dn=new DisplayNum();
		
		new OddThread(dn).start(); /*Starting OddThread*/
		
		new EvenThread(dn).start(); /*Starting EvenThread*/
			
		
	}

}
