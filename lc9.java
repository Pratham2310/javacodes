import java.util.Scanner;
class Solution
{
    public boolean isPalindrom(int x)
    {
        int copy=x;
        int reversed=0;
        if(x<0 || x%10==0 && x!=0)
            return false;
        else{
            while(x!=0)
            {
                reversed=reversed*10+x%10;
                x/=10;
            }
        }
       if(reversed==copy)
        {
            return true;
        }
        else
            return false;
    }
}
public class lc9 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        Solution s1= new Solution();
        boolean res=s1.isPalindrom(x);
        if(res)
        {
            System.out.println(x+" is a palindrome");
        }
        else
            System.out.println(x+" is not a palindrome");
    }
}
