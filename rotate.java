import java.util.Scanner;
class Solution{
    public void rotate(int[][] matrix)
    {
        int n=matrix.length;
        //transpose
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i+1;j<matrix.length;j++)
            {
               if(i != j)
               {
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
               }
            }
        }
        //mirror
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
public class rotate {
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        Solution s1=new Solution();
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        s1.rotate(arr);
    }
}
