public class grprev {
    public static void main(String args[])
    {
        int arr[]={2,5,3,5,62,1,3,6,1};
        int k=3;
        System.out.print("original array= [");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.print("\b]\n");
        for(int i=0;i<arr.length;i+=k)
        {
            int left=i;
            int right=Math.min(i+k-1,arr.length-1);
            while(left<right)
            {
                int temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                left++;
                right--;
            }
        }
        System.out.print("reverse group array=[");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.print("\b]");
    }
}
