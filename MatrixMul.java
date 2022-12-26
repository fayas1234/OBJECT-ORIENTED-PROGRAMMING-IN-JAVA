//Program to implement Matrix multiplication
import java.io.*;

class Operation
{
	
	int a[][]={{1,2,3},{4,5,6},{7,8,9}};
	int b[][]={{9,8},{7,6},{5,4}};

	void mul()
	{
		int i,j,k;
		int sum=0;
		
		System.out.println("THE GIVEN MATRICES IS:");
		System.out.println("A=");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("B=");
		for(i=0;i<3;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		
		int result[][]=new int[3][3];
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<2;j++)
			{
				sum=0;
				for(k=0;k<3;k++)
				{
					sum+=a[i][k]*b[k][j];
				}
				
				result[i][j]=sum;
				
			}
		}
		
		System.out.println("AXB=");
		for(i=0;i<3;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}

class MatrixMul
{	

	public static void main(String arg[])
	{
		Operation m=new Operation();
	
		m.mul();
		
	}
		
	
}
