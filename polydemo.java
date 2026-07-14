class Figure
{
    double dim1;
    double dim2;

    Figure(double dim1, double dim2)
    {
        this.dim1=dim1;
        this.dim2=dim2;
    }
    void area()
    {
        System.out.println("figur does not have defined area");
    }
}
class Triangle extends Figure
{
    Triangle(double dim1, double dim2)
    {
        super(dim1,dim2);
    }
    void area()
    {
        double res= dim1*dim2/2;
        System.out.println("Area of the triangle is :"+res);

    }
}
class Rectangle extends Figure
{
    Rectangle(double dim1,double dim2)
    {
        super(dim1,dim2);
    }
    void area()
    {
        double res=dim1*dim2;
        System.out.println("area of rectangle is : "+res);
    }
}
public class polydemo 
{
   public static void main(String []args)
   {
        Figure f= new Figure(10, 20);
        Triangle t= new Triangle(23,33 );
        Rectangle r = new Rectangle(2, 5);
        Figure f1= new Figure(0, 0);
        f1.area();
        f1= new Rectangle(20,30);
        f1.area();
        f1= new Triangle(3, 5);
        f1.area();
   } 
}
