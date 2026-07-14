import java.util.Scanner;
class NumberConversions 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter decimal number: ");
int num = sc.nextInt();
System.out.println("Binary: " + Integer.toBinaryString(num));
System.out.printf("Octal:%o ",num);
System.out.println("Hex:%x" + num);
}
}
