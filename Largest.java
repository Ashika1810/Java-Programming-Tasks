import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Largest
{
	public static void main(String args[])
	{	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int max=a[0];
		System.out.println("The largest number is:");
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}
}