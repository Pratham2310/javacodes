import java.util.Scanner;
class circle{
    double radius;
    float pi=22/7f;
    circle()
    {
        double radius =0.0;
    }
    circle(double radius)
    {
        this.radius=radius;
    }
    double area(double radius)
    {
        return pi*radius*radius;
    }
    double circumference(double radius)
    {
        return 2*(pi*radius);
    }

}
public class practicle1 {
    public static void main(String...s)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a radius of circle : ");
        double n=sc.nextDouble();
        circle c1= new circle(n);
        System.out.println("area of circle is :"+c1.area(n));
        System.out.println("circumference of circle ="+c1.circumference(n));

    }
}
