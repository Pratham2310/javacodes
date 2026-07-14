public class box 
{
    double length;
    double width;
    double depth;

    box()
    {
        length=1;
        width=2;
        depth=3;
    }
    box(double l,double w,double d)
    {
        length=l;
        width=w;
        depth=d;
        System.out.println("inside parameterised custroctur");
        System.out.println(length+" "+depth+" "+width);
    }
    void setbox(double l,double w,double d)
    {
        length=l;
        width=w;
        depth=d;
    }
    void showbox(String who)
    {
        System.out.println(who);
        System.out.println(length+" "+depth+" "+width);
    }
}
