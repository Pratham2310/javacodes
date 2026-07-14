class trigitriplate
{
    public static void main(String []args)
    {
        for(int c=0;c<1000;c++)
           for(int b=1;b<c;b++)
              for(int a=2;a<b;a++)
                 if(a*a+b*b==c*c && a+b+c==1000)
                 {
                    System.out.println("a="+a+"b="+b+"c="+c);
                    System.out.println("pro="+a*b*c);
                 }
    }
}