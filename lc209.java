class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len=Integer.MAX_VALUE,sum=0;
        int left=0;
        for(int num:nums)
        {
            if(num== target)
            {
                return 1;
            }
        }
        for(int right=0;right<nums.length;right++)
        {
            sum+=nums[right];
            while(sum>=target)
            {
                sum-=nums[left];
                len=Math.min(len,right-left+1);
                left++;
            }
        }
        return len==Integer.MAX_VALUE?0:len;
    }
}
public class lc209 {
    public static void main(String args[])
    {
        Solution s1= new Solution();
        int arr[]={1,3,4,2,4,3};
        int target=7;
        s1.minSubArrayLen(target, arr);
    }
}
