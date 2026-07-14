/* 
public class kadanealgo {
    public static void main(String args[])
    {
        int kad[] ={-2,1,-3,4,-1,2,1,-5,4};
        int length=1;
        int sum=0,sum1=0;
        
            for(int j=0;j<kad.length;j++)
            {
                while(length<=kad.length)
                {
                    int i=0;
                    
                    while(i<=length)
                    {
                        sum+=kad[i];
                        i++;
                    }
                    if(sum1<sum)
                    {
                        sum1=sum;
                    }
                    
                }
                length++;
            }

    }
}
*/

//kadane's algorithm for finding the maximum sum od array in its subarray
class kadanealgo
{
    public static void main(String []args)
    {
        int []arr={-2,1,-3,4,-1,2,1,-5,4};
        int maxsum=arr[0];
        int currentsum=0;
        int start=0,end=0, tempstart=0;
        for(int i=0;i<arr.length;i++)
        {
            currentsum+=arr[i];
            if(currentsum>maxsum)
            {
                maxsum = currentsum;
                start = tempstart;
                end=i;
            }
            if(currentsum<0)
            {
                currentsum=0;
                tempstart=i+1;
            }
        }
        System.out.println("maximum subarray sum is"+maxsum);
        System.out.print("Subarray");
        System.out.print("[");
        for(int i=start;i<=end;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.print("]");
    }
}