class pe12{
public static void main(String []args)
{
   int n=1;
   int n1=0,count=0;
   //System.out.println(n);
   for(int i=2;i<=1000000;i++)
   {
      int div=0;
      //System.out.print(n+i+": ");
      n=n+i;
      for(int j=1;j<=n;j++)
      {
         if(n%j==0)
         {
            //System.out.print(j+", ");
            div++;
         }
      }
      if (div>count)
      {
         count=div;
         n1=n;
         if(count==500)
         {
            System.out.println(n1+"is the first number which has over 500 divisor");
         }
      }
      //System.out.println();
   }
 // System.out.println(n1 +"is the number which has heightest divisor"+ count);
}
}