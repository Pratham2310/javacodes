import java.util.Scanner;
class Solutiom
{
    public void rotate(int arr[],int k)
    {
        if(k>arr.length)
        {
                k=k%arr.length;
        }
        /*
        while(k>0)
        {
            int last=arr[arr.length-1];
            for(int i=0;i<arr.length-1;i++)
            {
                arr[(arr.length-1)-i]=arr[(arr.length-2)-i];
            }
            k--;
            arr[0]=last;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+", ");
        }
            */
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
       
    }
     public void reverse(int nums[],int start,int end)
    {
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
public class lc189 {
    public static void main(String args[])
    {
        Solutiom s1=new Solutiom();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number of elements");
        int n=sc.nextInt();
        System.out.println("enter a numner of rotation");
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        s1.rotate(arr, k);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
}
