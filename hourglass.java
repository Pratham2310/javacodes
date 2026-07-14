import java.util.Scanner;
class pattern
{
    void hourglass(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            for(int s=0;s<=((n-i)*2);s++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int s=1;s<=i*2-1;s++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class hourglass {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        pattern pal=new pattern();
        pal.hourglass(n);
    }
}
