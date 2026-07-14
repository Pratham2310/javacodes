public class rectangle {
    double length;
    double breath;
    rectangle()
    {
        System.out.println("inside rectangle");
        length=3.5;
        breath=5.5;
    }
    rectangle(double l,double d)
    {
        System.out.println("inside rectangle (double ,double)");
        length=l;
        breath=d;
    }
    rectangle(rectangle r)
    {
        length=r.length;
        breath=r.breath;
    }
    void showbox(String who)
    {
        System.out.println(who);
        System.out.println(length+" "+breath);
    }
    
}

/*
 * void setbox(double length,double breath)
    {
        this.length=length;
        this.breath=breath;
    }
    void setbox(double dim)
    {
        length=breath=dim;
    }
    void setbox(rectangle r)
    {
        r.length=length;
        r.breath=breath;
    }
    void showbox(String who)
    {
        System.out.println(who);
        System.out.println(length+" "+breath);
    }
 */