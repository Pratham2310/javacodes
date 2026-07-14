/* 
class pe25
{
    public static void main(String args[])
    {
        int f1=1,f2=1.fn;
        int index=2;
        while(true)
        {
            fn=f1+f2;
            index++;
            int length=String.length.valueof(fn).length();
            if(length ==3)
            {
                System.out.println(index+" "+fn);
                break;
            }
            f1=f2;
            f2=fn;
        }
    }
}
    */
class PE25 {
    public static void main(String[] args) {
        long f1 = 1, f2 = 1, fn;
        int index = 2; // because f1 and f2 are the first two Fibonacci numbers

        while (true) {
            fn = f1 + f2;
            index++;

            // Count number of digits using string conversion
            int length = String.valueOf(fn).length();

            if (length == 1000) {
                System.out.println("Index: " + index + " | Fibonacci Number: " + fn);
                break; // stop when we find the first 3-digit Fibonacci number
            }

            // Shift for next iteration
            f1 = f2;
            f2 = fn;
        }
    }
}
