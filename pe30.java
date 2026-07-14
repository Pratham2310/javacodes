class pe30
{
    static int power(int digit)
    {
       int n=digit*digit*digit*digit*digit;
       return n; 
    }
    public static void main(String args[])
    {
        int totalsum=0;
        for(int i=2;i<=354294;i++)
        {
            int num=i;
            int sumofpow=0;
            while(num>0)
            {
                sumofpow+=power(num%10);
                num=num/10;
            }
            if(sumofpow==i)
            {
                System.out.println(i);
                totalsum+=i;
            }
        }
        System.out.println("sum of all fifth digit power number is="+totalsum);
    }    
}