class searchpos {
    int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if(target<nums[0])
        {
            return 0;
        } 
        if(target>nums[end])
        {
            return end+1;
        }
        while (start<=end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (target < nums[mid]) {
                end = mid - 1;
            } else
                start = mid + 1;
            
        }
         return start;
    }
}

public class lc35 {
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 6};
        int target = 2;

        searchpos sp =new searchpos();
        System.out.println(sp.searchInsert(nums, target)); // Output: 2
    }
}