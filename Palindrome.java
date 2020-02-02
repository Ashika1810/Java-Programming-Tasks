import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		String rev="";
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();
		int n=st.length();
		for(int i=n-1;i>=0;i--)
		{	
			rev=rev+st.charAt(i);
		}
		if(st.equalsIgnoreCase(rev))
		{
			System.out.println("It is a palindrome");

		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}
}
	