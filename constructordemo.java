public class constructordemo{
    public static void main(String []args)
    {
        rectangle r1=new rectangle();
        r1.showbox("b1");
        rectangle r2=new rectangle(34, 032);
        r2.showbox("r2");
        rectangle r3=new rectangle(r2);
        r3.showbox("b3");
       
    }
}
