/*import java.util.Scanner;
public class spral {
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter numbre of rows");
        int n=sc.nextInt();
        int num=1;
        int spiral[][]=new int[n][n];
        int iter=0;
        {
            for(int j=0;j<n;j++)
            {
                 spiral[iter][j]=num; 
                 num++;
            }
            for(int k=iter+1;k<n;k++)
            {
                spiral[k][iter]=num;
                num++;
            }
            
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(spiral[i][j]+" ");
            }
            System.out.println();
        }
    }
}
*/
import java.util.Scanner;
public class spral {
    public static void main(String []args)
    {
        System.out.println("enter number of rows:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int spiral[][]=new int[n][n];
        int num=1;
        for(int iter=0;iter<(n+1)/2;iter++)
        {
            int r=n-(iter+1);
            for(int top=iter;top<n-iter;top++)
            {
                 spiral[iter][top]=num;
                 num++;
            }
            for(int left=iter+1;left<n-iter;left++)
            {
                spiral[left][r]=num;
                num++;
            }
            for(int bott=n-(iter+2);bott>=iter;bott--)
            {
                spiral[r][bott]=num;
                num++;
            }
            for(int right=r-1;right>iter;right--)
            {
                spiral[right][iter]=num;
                num++;
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(spiral[i][j]+" ");
            }
            System.out.println();
        }
    }
}


