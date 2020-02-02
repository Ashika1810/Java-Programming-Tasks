import java.io.*;
import java.lang.*;
import java.util.Scanner;
class PrimeN
{
public static void main(String args[])
{
int i,x,c,sum=0;
Scanner obj=new Scanner(System.in);
System.out.println("Enter no of prime numbers to be printed");
int n=obj.nextInt();
                for(i=2;sum<n;i++)
                {
                c=0;
                for(x=2;x<i;x++)
                {
                if((i%x==0)&&(x!=i))
                {
                c=1;
                break;
                }
                }
                if(c==0)
                 {
                System.out.println(i);
                sum=sum+1;
                 }
                }
}
}
