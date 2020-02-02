import java.io.*;
import java.lang.*;
import java.util.Scanner;
class Prime
{
	public static void main(String args[])
	{ 
	int flag=0;
	System.out.println("Enter a number\n");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			flag=1;
			break;
		}
	}
	if(flag==1)
	{
		System.out.println("It is not a prime number\n");
	}
	else
	System.out.println("It is a prime number\n");
	}
}