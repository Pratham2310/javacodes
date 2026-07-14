class factsum{
    static int sum=0;
    int sumall(int n)
    {
        
        System.out.print(n+"!+");
        
        if(n==1)
        {
          
          //System.out.print("="+sum);
          //System.out.println();
          return 1;
          
        }
        sum=fact(n)+sumall(n-1);
        //System.out.print(n+"!+");


        return sum;
    }  
    void aescending(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(i!=n)
                System.out.print(i+"!+");
            else
                System.out.print(i+"!");
        }
    }
    int fact(int n)
    {
       
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String []args)
    {
        int num=5;
        factsum f1=new factsum();
        System.out.println("\b="+f1.sumall(num));
        f1.aescending(num);
        System.out.print("="+f1.sum);
    }
}