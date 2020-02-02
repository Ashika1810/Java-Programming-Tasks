import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Duplicate
{
	public static void main(String args[])
	{
		System.out.println("Enter the number of elements");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int i,j;
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("The duplicate elements are:");
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
					break;
				}
			}
		}
	}
}