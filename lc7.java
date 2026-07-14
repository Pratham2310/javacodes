import java.util.Scanner;
class Solution
{

}
public class lc7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number");

        int x = sc.nextInt();
        StringBuilder reversed = new StringBuilder();
        String str = Long.toString(Math.abs((long)x));

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        if(x<0)
        {
            reversed.insert(0, "-");
        }
        try{
        long reversedlong =Long.parseLong(reversed.toString());
        if(reversedlong>Integer.MAX_VALUE  || reversedlong< Integer.MIN_VALUE)
            System.out.print("number exids the Integer limit");  //retunr (int)longreversed
        }catch(NumberFormatException e){
            System.out.println(reversed);
        }
    }

}


 /*
  * LEETCODE PROBLEM NO 7 SUBMITTED CODE


  class Solution {
    public int reverse(int x) {
       StringBuilder reversed = new StringBuilder();
        String str = Long.toString(Math.abs((long)x));

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        if(x<0)
        {
            reversed.insert(0,"-");
        }
        try{
            long reversedlong =Long.parseLong(reversed.toString());
            if(reversedlong>Integer.MAX_VALUE  || reversedlong< Integer.MIN_VALUE)
                return 0;
            return (int)reversedlong;
        }catch(NumberFormatException e){
            return 0;
        }
        

    }
    
}





solution 2 


class Solution {
    public int reverse(int x) {
        int result = 0;
        
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            
            // Check for overflow/underflow before multiplying by 10
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) return 0;
            
            result = result * 10 + digit;
        }
        
        return result;
    }
}

  */