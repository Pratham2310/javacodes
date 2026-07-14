import java.util.Scanner;
class Solution
{
    public int majority(int nums[])
    {
        int cnt=0;
        int candidate=0;
        for(int i=0;i<nums.length;i++)
        {
            if(cnt==0)
            {
                candidate = nums[i];
            }
            if(candidate==nums[i])
            {
                cnt++;
            }
            else
            {
                cnt--;
            }
        }
        if(cnt>=nums.length/2)
        {
            return candidate;
        }
        return -1;
    }
}
public class lc169 {
    public static void main(String args[])
    {
        Solution s11= new Solution();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(s11.majority(arr));
    }
}
