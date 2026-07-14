public class lc167 {
    public static void main(String args[])
    {
        int arr[]={2,3,4};
        int start=0;
        int sum=0;
        int target= 6;
        int end=arr.length-1;
        while(start<end)
        {
            sum=arr[start]+arr[end];
            if(sum== target)
            {
                System.out.println("target found at "+start+1);
                System.out.println(end+1);
                break;
            }
            else if (sum>target)
            {
                end--;
            }
            else if (sum<target) 
            {
                start++;
            }
        }
        System.out.println("target not found in array");
    }
}
