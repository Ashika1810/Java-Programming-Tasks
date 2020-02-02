import java.io.*;
import java.lang.*;
import java.util.Scanner;
class PalindromeInt
{	
	public static void main(String args[])
	{
	System.out.println("Enter a number");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int x=n;
	int rev=0,rem;
	while(n!=0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(rev==x)
	System.out.println("It is a palindrome");
	else
	System.out.println("It is not a palindrome");
	}
}