import java.util.Scanner;
class solution{
    public void reverseString(char[] s)
    {
        int left=0,right=s.length-1;
        while (left<right)
        {
            char temp=s[left];
            s[left]=s[right];
            s[right]= temp;
            left++;
            right--;
            
        }
        System.out.print("[");
        
        for(int i=0;i<s.length;i++)
        {
            System.out.printf("\""+s[i]+"\""+",");
        }
        System.out.print("\b"+"]");
    }
}
public class lc344 {
    public static void main(String args[])
    {

        char ch[]={'p','r','a','t','h','a','m'};
        solution s1 = new solution();
        s1.reverseString(ch);
    }
}
