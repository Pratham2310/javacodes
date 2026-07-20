public class lc26r {
    public static void main(String args[])
    {
        int nums[]={0,0,1,1,1,2,2,3,3,4};
        int k=0;
        if(nums.length==0)
        {
            System.out.println("array is ofsize zero");
        }
        for(int i=1;i<nums.length;i++)
        {

            if(nums[i]!=nums[k])
            {
                k++;
                nums[k]=nums[i];
            }
        }
        System.out.println("new length: " + k+1);
    }
    
}
