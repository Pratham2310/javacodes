import java.util.Scanner;
public class bubblesort {
    public static void main(String args[])
    {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number of elements");
        n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
        System.out.print("array aafter sorting = ");
        System.out.print("[");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.print("\b]");
    }
}
