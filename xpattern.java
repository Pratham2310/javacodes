import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter a number ");
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i*2-2;j++)
            {
                System.out.print(" ");
            }
            System.out.print(num);
           
            for(int j=1;j<=(-4*i)+19;j++)
            {
                System.out.print(" ");
            }
            if(i==5)
            {
                System.out.print("\b");
            }

            System.out.print(num+" ");
           
            num++;
            System.out.println();    
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i*2-2;j++)
            {
                System.out.print(" ");
            }
            System.out.print(num+" ");
            
            for(int j=1;j<=(-4*i)+18;j++)
            {
                System.out.print(" ");
            }
            System.out.print(num+" ");
            num++;
            System.out.println();
        }
    }
}