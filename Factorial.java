import java.util.Scanner;
class Factorial 
{
public static void main(String[] args)
 {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number: ");
int n = sc.nextInt();
System.out.println("Factorial: " + factorial(n));
}
static int factorial(int n) 
{
	if(n==1)
	   return 1;
 	return n * factorial(n - 1);
}
}
