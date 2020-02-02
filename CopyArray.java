import java.lang.*;
import java.io.*;
import java.util.Scanner;
class CopyArray
{	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			b[i]=a[i];
		}
		for(i=0;i<n;i++)
		{
			System.out.println(b[i]);
		}
	}
}