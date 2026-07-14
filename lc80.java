public class lc80 {
    public static void main(String args[])
    {
        int nums[]={1,1,1,2,2,3};
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(k<2|| nums[i]!=nums[k])
            {
                nums[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<k;i++)
        {
            System.out.print(nums[i]+",");
        }
    }
}
