import java.util.Scanner;
public class pascal {

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int n=sc.nextInt();
        int pascal[][]=new int[n][];
        for(int i=0;i<n;i++)
        {
            pascal[i]=new int[i+1];
            pascal[i][0]=1;
            pascal[i][i]=1;
            for(int j=1;j<i;j++)
            {
                pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(pascal[i][j]+" ");

            }
            System.out.println();
        }



    }
}
/* 
                  space
     1         i=1     5
    1 1        i=2     4
   1 2 1       i=3     3
  1 3 3 1      i=4     2
 1 4 6 4 1     i=5     1
1 5 10 10 5 1  i=6     0


     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
1 5 10 10 5 1 

*/