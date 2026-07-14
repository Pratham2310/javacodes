public class lc88 {
    public static void main(String args[])
    {
       int nums1[]={2,4,6,8,0,0};
       int nums2[]={1,9};
       int m=4;
       int n=2;
       int i=m-1;
       int j=n-1;
       int k=m+n-1;
       while (i>=0 && j>=0) 
       {
            if(nums1[i]<nums2[j])
            {
                nums1[k--]=nums2[j--];
            }
            else
            {
                nums1[k--]=nums1[i--];
            }
       }
       while(j>=0)
       {
            nums1[k--]=nums2[j--];
       }
       for(int l=0;l<nums1.length;l++)
       {
            System.out.print(nums1[l]+",");
       }
    }
}
