class solution{
    int[] sol(int arr[],int target)
    {
       for(int i=0;i<arr.length;i++)
       {
            for(int j=i+1;j<arr.length;j++)
            {
                int sum=arr[i]+arr[j];
                if(sum==target)
                {
                    return new int[]{i,j};
                }
            }
       }
       return new int[]{-1,-1};
    }
}   


class lc1{
    public static void main(String args[])
    {
        solution s1= new solution();

    }
}