import java.util.Scanner;
class yorpat
{
    void printer(int x)
    {
       for(int i=1;i<=x;i++)
       {
            for(int j=1;j<=x-i;j++)
            {
                System.out.print(" ");
            }
            for(int s=1;s<=i*2-1;s++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=(x-i)*2;j++)
            {
                System.out.print(" ");
            }
            for(int s=1;s<=i*2-1;s++)
            {
                System.out.print("*");
            }
            System.out.println();
       }
       for(int i=1;i<x;i++)
       {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int s=1;s<=((x-i)*2)-1;s++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=i*2;j++)
            {
                System.out.print(" ");
            }
            for(int s=1;s<=((x-i)*2)-1;s++)
            {
                System.out.print("*");
            }
            System.out.println();
       }
    }
}
public class diffpatt {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number ");
        int n=sc.nextInt();
        yorpat f1= new yorpat();
        f1.printer(n);
    }
}
