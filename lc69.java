class fsqrt
{
    int sqrt(int x)
    {
        int ans=0;
        if(x<2)
        {
            return x;
        }
        int left=1, right=x/2;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if((long)mid*mid<=x)
            {
                ans=mid;
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return ans;
    }
}
class lc69
{
    public static void main(String args[])
    {
        int n=36;
        fsqrt s=new fsqrt();
        System.out.println("square root of the number"+n+"is"+s.sqrt(n));
    }
}