import java.util.Scanner;
class twosum
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int target=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        outer: for(int i=0;i<arr.length;i++)
        {
            inner: for(int j=i+1;j<arr.length;j++)
            {
                int sum=0;
                sum=arr[i]+arr[j];
                if(sum==target)
                {
                    System.out.println("["+i+","+j+"]");
                    break outer;
                }
            }
        }


        /* 
        int arr[]={2,3,0,4,3,2,1,5};
        int target=7;
       outer: for(int i=0;i<arr.length;i++)
        {
            
            inner:for(int j=i+1;j<arr.length;j++)
            {
                int sum=0;
                sum=arr[i]+arr[j];
                if(sum==target)
                {
                    System.out.println("["+i+","+j+"]");
                    break outer;
                }
            }
        }
            */
        
    }
}