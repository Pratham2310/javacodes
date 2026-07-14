public class lc26 {
    public static void main(String args[])
    {
        int arr[]={0,0,1,1,2,2,3,3};
        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[j]!= arr[i])
            {
                i++;
                arr[i]=arr[j];
            }
        }
        for(int k=0;k<i+1;k++)
        {
            System.out.print(arr[k]+",");
        }
    }
}
