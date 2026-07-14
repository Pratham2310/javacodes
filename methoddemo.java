public class methoddemo {
    public static void main(String []args)
    {
        box b1=new box();
        b1.setbox(12, 23, 34);
        b1.showbox("box 1");
        box b2=new box();
        b2.showbox("b2");
        box b3=new box(23, 22, 11);
        b3.showbox("b3");
    }
}
