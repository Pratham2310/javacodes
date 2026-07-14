
import java.util.Arrays;
import java.util.Scanner;
// class solution
// {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2)
//     {
//         int result[]=new int[nums1.length+nums2.length];
//         int sum=0;
//         double median=0.0;
//         for(int i=0;i<nums1.length;i++)
//         {
//             result[i]=nums1[i];
//             sum+=nums1[i];
//         }
//         for(int i=0;i<nums2.length;i++)
//         {
//             result[nums1.length+i]=nums2[i];
//             sum+=nums2[i];
//         }
//         Arrays.sort(result);
//         /* 
//         for(int i=0;i<result.length;i++)
//         {
//             for(int j=0;j<result.length-1;j++)
//             {
//                 if(result[j]>result[j+1])
//                 {
//                     int temp=result[j];
//                     result[j]=result[j+1];
//                     result[j+1]=temp;
//                 }
//             }
//         }*/
//         for(int i=0;i<result.length;i++)
//         {
//             System.out.print(result[i]+",");
//         }
//         if(result.length%2==1)
//         {
//             median=result[result.length/2];
//         }
//         else
//             median=(result[result.length/2-1]+result[result.length/2])/2.0;
//         return median;
//     }
// }

class just
{
    public double j1(int[] nums1, int[] nums2)
    {
        double median=0;
        int result[]=new int[(nums1.length+nums2.length)];
        for(int i=0;i<nums1.length;i++)
        {
            result[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++)
        {
            result[nums1.length+i]=nums2[i];
        }
        Arrays.sort(result);
        if(result.length%2==0)
        {
            median=(result[(result.length/2)-1]+result[result.length/2])/2.0;
        }
        else
        {
            median=result[result.length/2];
        }
        return median;
    }
}
public class lc4 {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        just s1=new just();
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println("\n"+s1.j1(arr1, arr2));
    }
}
