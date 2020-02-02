import java.io.*;
import java.lang.*;
import java.util.Scanner;
class Armstrong
{	
	public static void main(String args[])
	{
	System.out.println("Enter a number");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int x=n;
	int sum=0,rem;
	while(n!=0)
	{
		rem=n%10;
		sum=sum+rem*rem*rem;
		n=n/10;
	}
	if(sum==x)
	System.out.println("It is an armstrong number");
	else
	System.out.println("It is not an armstrong number");
	}
}