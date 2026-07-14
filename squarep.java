import java.util.Scanner;
public class squarep {
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number of rows");
        int n=sc.nextInt();
        //int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(int j=1;j<=(2*n-2*i-1);j++)
            {
                System.out.print(i+" ");
            }
            if(i==5)
            {
                System.out.print("\b\b");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            for(int j=1;j<=(2*n-2*i-1);j++)
            {
                System.out.print(i+" ");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }



    }
}

