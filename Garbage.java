//Program to implement garbage collection

import java.io.*;

class Garbage
{
	protected void finalize()
	{
		System.out.println("Garbage collected");
	}
	
	public static void main(String args[])
	{
		Garbage a=new Garbage();
		Garbage b=new Garbage();
		
		a=null;
		b=null;
		System.gc();
	
	}
	
}
