import java.util.Scanner;
class fact
{
    int fact(int n)
    {
	if(n==1)
	   return 1;
	return n*fact(n-1);
    }
}

class main
{
    public static void main(String[] args)
    {
	    System.out.println("enter a number to find factorial of");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fact f1=new fact();
        System.out.println("factorial of that number is:"+f1.fact(n));
    }
}