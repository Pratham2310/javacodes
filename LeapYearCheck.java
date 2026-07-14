import java.util.Scanner;
public class LeapYearCheck 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter year: ");
int year = sc.nextInt();
System.out.println(isLeapYear(year) ? "Leap Year" : "Not a Leap Year");
}
static boolean isLeapYear(int year) 
{
return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}
}
