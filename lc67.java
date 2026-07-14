class binarysum
{
    void binarysumm(String str1,String str2)
    {
        int i=str1.length()-1;
        int j=str2.length()-1;
        char carry=0;
        String ans = null;
        while(i>=0 || j>=0 || carry==0)
        {
            if(str1.charAt(i)=='1' && str2.charAt(j)=='0')
            {
                ans='1'+ans;
            }
            else if(str1.charAt(i)=='0' && str2.charAt(j)=='1')
            {
                ans='1'+ans;
            }
            else
            {
                carry
            }
        }
    }
}
public class lc67 {
    public static void main(String args[])
    {

    }
}
