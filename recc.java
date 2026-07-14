import java.util.Scanner;
class fact
{
    int sum=0;
    int fact(int n)
    {
        System.out.print(n+"!+");
         System.out.print("\b");
	if(n==1)
	   return 1;
	return n*fact(n-1);
    }
}

class recc
{
    public static void main(String[] args)
    {
	System.out.println("enter a number to find factorial of");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fact f1=new fact();
        System.out.println("="+f1.fact(n));
    }
}