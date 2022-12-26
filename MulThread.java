//Program to implelement multithreading


import java.util.*;
import java.io.*;
import java.lang.*;


class RandThread extends Thread
{
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			Random r=new Random();
			
			int num=r.nextInt(100)+1; /*Range of the random number between 1 and 100 both inclusive*/
			
			try{
				
			sleep(1000); /*RandThread sleeps for 1 second*/
			if(num%2==0)
			{
				EvenThread et=new EvenThread(num);
				et.start();
			}
				
			else
			{
					
				OddThread ot=new OddThread(num);
				ot.start();
					
			}
			
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			
			
		}
	}	
	
	
}
	


class EvenThread extends Thread
{
	int num;
	
	public void run()
	{
		
		try
		{
	
			System.out.println("Number is :"+num+"||"+"Square is:"+num*num+"\n");

		}
			
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	
	EvenThread(int num)
	{
		this.num=num;
	}
	
}


class OddThread extends Thread
{
	int num;
	
	public void run()
	{
		
		try
		{
	
			System.out.println("Number is :"+num+"||"+"Cube is:"+num*num*num+"\n");

		}
			
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
	
	OddThread(int num)
	{
		this.num=num;
	}
}

class MulThread
{
	public static void main(String args[])
	{
		
		RandThread rt=new RandThread();
		rt.start();
		
		
	}
	
}