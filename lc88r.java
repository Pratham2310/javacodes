class solution{
    public void merge(int []nums1,int m,int n,int []nums2)
    {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0 && i>=0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0)
        {
            nums1[k--]=nums2[j--];
        }

        for (int l = 0; l < nums1.length; l++) {
            System.out.print(nums1[l] + ",");
        }
    }
}

class lc88r{
    public static void main(String args[])
    {
        int []nums1={1,2,3,0,0,0};
        int []nums2={2,5,6};
        int m=nums1.length-nums2.length;
        int n=nums2.length;
        solution s= new solution();
        s.merge(nums1, m, n, nums2);
    }
}