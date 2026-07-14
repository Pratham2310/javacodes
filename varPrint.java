public class varPrint
{
    int x=30;
    static int y=20;
    public static void main(String args[])
    {
        varPrint t1=new varPrint();
        t1.x=99;
        t1.y=88;
        int z1=t1.x+t1.y;
        varPrint t2=new varPrint();
        System.out.println(t2.x+" "+t2.y+" "+z1);
        
    }
}