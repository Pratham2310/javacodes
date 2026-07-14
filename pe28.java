import java.util.Scanner;
public class pe28{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows");
        int n=sc.nextInt();
        int spiral[][]= new int[n][n];
        int num=n*n;
        int sum=0;
        for(int iter=0;iter<n/2;iter++)
        {
            int r=n-(iter+1);
            for(int top=iter;top<n-iter;top++)
            {
                spiral[iter][top]=num;
                num--;
            }
            for(int left=iter+1;left<n-iter;left++)
            {
                spiral[left][r]=num;
                num--;
            }
            for(int bott=n-(iter+2);bott>=iter;bott--)
            {
                spiral[r][bott]=num;
                num--;
            }
            for(int right=r-1;right>iter;right--)
            {
                spiral[right][iter]=num;
                num--;
            }

        }
         int r=n-1,l=0;
            while(r>=0 && l<n)
            {
                sum+=spiral[l][r];
                r--;
                l++;
            }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    sum+=spiral[i][j];
                }

            }
        }
        System.out.println("sum of the diagonal is="+sum);
    }
}
