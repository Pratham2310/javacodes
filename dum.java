public class dum {
    public static void main(String args[])
    {
        int arr[]={1,2,3};
        String a="";
        for(int i=0;i<arr.length;i++)
        {
            String s1=Integer.toString(arr[i]);
            a+=s1;
        }
        System.out.println(a);
    }
}
