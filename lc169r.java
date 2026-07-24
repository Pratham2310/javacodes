class lc169r{
    public static void main(String arg[])
    {
        int nums[]={3,3,2};
        int count=0;
        int val=0;
        int k=0;
        val=nums[k];
        while(k<nums.length)
        {
            for(int i=k;i<nums.length;i++)
            {
                if(nums[i]==val)
                {
                    count++;
                }
            }
            k++;
        }
        if(count>nums.length/2)
        {
            System.out.println("majority element is:"+val);
        }
        count=0;
    }
}