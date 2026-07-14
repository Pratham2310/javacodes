import java.util.Scanner;
class Arr
{
    static int[]  Create(int n)
    {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[n];
        System.out.println("Enter array element");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt(); 
        }
        return arr;
    }
    public static void display(int[] arr)
    {
        System.out.println("Array elements are");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    
}
public class arprac {
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a array size");
        int n=sc.nextInt();
        Arr a1= new Arr();
        int arr[] =a1.Create(n);
        a1.display(arr);
        
    }
}
