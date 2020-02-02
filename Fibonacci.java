import java.io.*;
import java.lang.*;
import java.util.Scanner;
class Fibonacci
{
	public static void main(String args[])
	{
	int a=0,b=1,next;
	System.out.println("Enter the number of terms\n");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println(a+"\n"+b);
	for(int i=1;i<n-1;i++)
	{
		next=a+b;
		System.out.println(next+"\t");
		a=b;
		b=next;
	}
	}
}

	
	