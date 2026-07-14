public class Box{
    double length;
    double width;
    double depth;
    void setbox(double l,double w,double d)
    {
        length=l;
        depth=d;
        width=w;
    }
    void setbox(double dim)
    {
        length=width=depth=dim;
    }
    void showbox()
    {
        System.out.println("length="+length+"depth="+depth+"width="+width);
    }
    
}
public class Overloadingdemo {
    public static void main(String[] args) {
        Box b1= new Box();
        b1.setbox(30);
        b1.showbox();
        b1.setbox(1.2,3.2,3.2);
        b1.showbox();
    }
}
