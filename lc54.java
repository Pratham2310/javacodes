import java.util.*;
class conclusion
{
    public List<Integer> spiralmat(int [][]matrix)
    {
        List<Integer> result = new ArrayList<>();
        int n= matrix.length;
        int m=matrix[0].length;
        for(int iter=0;iter<(Math.min(m, n)+1)/2;iter++)
        {
            int r=n-1-iter;
            int c=n-1-iter;
            for(int top=iter;top<r;top++)
            {
                result.add(matrix[iter][top]);
            }
            for(int right=iter+1;right<=c;right++)
            {
                result.add(matrix[right][c]);
            }
            if(r!=iter)
            {
                for(int bottom=c-1;bottom>=iter;bottom--)
                {
                    result.add(matrix[r][bottom]);
                }
            }
            if(c!=iter)
            {
                for(int left=r-1;left>=iter+1;left--)
                {
                    result.add(matrix[left][iter]);
                }
            }
        }
        return result;
    }
}
public class lc54 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENter a number of rows");
        int n=sc.nextInt();
        conclusion s1= new conclusion();
        int num=1;
        int matrix[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=num;
                num++;
            }
        }
       
        System.out.println(s1.spiralmat(matrix));
        for(int i=0;i<matrix.length;i++)
        {
            System.out.print(matrix[i]);
        }
    }   
}
