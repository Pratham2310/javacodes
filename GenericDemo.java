class circle<T extends Number>
{
    T radius;
    circle(T x)
    {
        radius=x;

    }
    Float area()
    {
        float r=radius.floatValue();
        return 22f/7*r*r;
    }
}
public class GenericDemo {
    public static void main(String[] args) {
        circle <Integer>c1= new circle<>(5);
        System.out.println("Area of the circle is "+c1.area());
        circle <Float>c2=new circle(2.5);
        System.out.println("Area of the circle is "+c2.area());
    }
}
