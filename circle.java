class Circle
{
  	double radius;
 	static  double PI = 22/7;
 	Circle(double radius)
 {
this.radius = radius;
 	}
 	void setRadius(double radius) 
{
 		this.radius = radius;
 	}
 	double calculateArea() 
{
 		return PI * radius * radius;
 	}
 	double calculateCircumference() 
{
 		return 2 * PI * radius;
 	}
 	public static void main(String[] args)
{
 		Circle c1 = new Circle(8.0);
 		System.out.println("Initial Area: " + c1.calculateArea());
 		System.out.println("Initial Circumference: " +
c1.calculateCircumference());
 		c1.setRadius(7.0);
System.out.println("Updated Area: " + c1.calculateArea());
 		System.out.println("Updated Circumference: " +
c1.calculateCircumference());
 	}
 }
