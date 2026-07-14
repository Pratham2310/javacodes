import java.util.Scanner;
public class sumofdigit {
    static int sum1(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int result=n%10;
            sum+=result;
            n/=10;
        }
        return sum;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int n= sc.nextInt();
        System.out.println("sum of digit is "+sum1(n));
    }
}
