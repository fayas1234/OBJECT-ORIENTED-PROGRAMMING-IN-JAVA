//Program to implelement DoublyLinkedList

import java.io.*;
import java.util.*;

class Operations
{
	char ans='y';
	int ch;
	
	void op()
	{
		LinkedList<String> ll=new LinkedList<String>();
		
		Scanner s=new Scanner(System.in);
		while(ans=='y' || ans=='Y')
		{
			System.out.println("1-Create/Insert\n2-Delete\n3-Display\n");
			
			System.out.print("Enter your choice:");
			ch=s.nextInt();
			
			if(ch==1)
			{
				char op='y';
				String item;
				
				while(op=='y' || op=='Y')
				{
					s.nextLine();
					System.out.print("\nEnter element:");
					item=s.nextLine();
					ll.add(item);
					
					System.out.print("\nDo you want to continue:");
					op=s.nextLine().charAt(0);
				}
			}
			
			else if(ch==2)
			{
				char op='y';
				String item;
				
				while(op=='y' || op=='Y')
				{
					s.nextLine();
					System.out.print("\nEnter element to be deleted:");
					item=s.nextLine();
					ll.remove(item);
					
					System.out.print("\nDo you want to continue:");
					op=s.nextLine().charAt(0);
				}
			}
			
			else if(ch==3)
			{
				Iterator<String> itr=ll.iterator();
				
				while(itr.hasNext())
				{
					System.out.print(itr.next()+"\t");
				}
				System.out.println();
			}
			
			else
			{
				System.out.println("\nwrong choice");
			}
			
			s.nextLine();
			System.out.print("\nDo you want to continue:");
			ans=s.nextLine().charAt(0);
		}
		
	}
	
}


class DLL
{
	public static void main(String args[])
	{
		Operations p=new Operations();
		p.op();
	}
}
			
			