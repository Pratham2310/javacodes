/* 
class factoro
{
    long facto(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*facto(n-1);
    }
    int digitsum(int fac)
    {
        int sum=0;
        int num=0;
        while(fac!=0)
        {
            sum+=fac%10;
            fac=fac/10;
        }
        return sum;
    }
}
public class factdigitsum {
    public static void main(String args[])
    {
        factoro f1=new factoro();
        long fac=f1.facto(25);
        System.out.println(fac);
        int sum=f1.digitsum(fac);
        System.out.println("Sum of digit of factorial is :"+sum);
    }
}
*/
import java.math.BigInteger;

class factoro {
    BigInteger facto(int n) {
        if (n == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(facto(n - 1));
    }

    int digitsum(BigInteger fac) {
        int sum = 0;
        String str = fac.toString();
        for (char c : str.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}

public class factdigitsum {
    public static void main(String args[]) {
        factoro f1 = new factoro();
        BigInteger fac = f1.facto(100);
        System.out.println("Factorial of 25 is: " + fac);
        int sum = f1.digitsum(fac);
        System.out.println("Sum of digits of factorial is: " + sum);
    }
}
