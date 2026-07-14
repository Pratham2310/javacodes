/*class s1{
   public static void main(String []args)
   {
	int x=2;
	switch(x)
	{
	   case 1:
	      System.out.println("one");
	      break;
           case 2:
	      System.out.println("Two");
	      break;
	   default:
	      System.out.println("INvalid choice");
	      break;
        }
    }
}


import java.util.Scanner;
class swithchdemo
{
   public static void main(String []args)
   {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter a number between 1-7");
      int n=sc.nextInt();
      switch(n)
      {
	 case 1:
	    System.out.println("monday");
	    break;
	 case 2:
	    System.out.println("tuesday");
	    break;
	 case 3:
	    System.out.println("wednseday");
	    break;
	 case 4:
	    System.out.println("funday");
	    break;
     }
   }
}

class tp{
   public static void main(String []args)
   {
	int i=1;
        do
	{
	   for(int j=1;j<i;j++)
 	      System.out.print(" ");
	   System.out.println(i);
	   i++;
   	}while(i<=5);
   }
}

//labeled loop and labled break
class main{
   public static void main(String []args)
   {
	outer:for(int i=0;i<=5;i++)
	{
	    inner:for(int j=1;j<=5;j++)
	    {
		if(j>i)
		   break outer;
		System.out.println(j+" ");
	    }
	}
   }
}

//constructor and method overloading
class box
{
  double length;
  double width;
  double depth;
  box()//default constructor
  {
    length=0;
    width=3;
    depth=5;
  }
  box(double depth,double length,double width) //parameterized constructor
  {
     this.depth=depth;
     this.length=length;
     this.width=width;
  }
  box(box b)//copy constructor
  {
     length=b.length;
     width=b.width;
     depth=b.depth;
  }
  void setbox()
  {
     length=4;
     width=4;
     depth=6;
  }
  void setbox(double length,double width, double depth)
  {
     this.length=length;
     this.width=width;
     this.depth=depth;
  }
  void display()
  {
     System.out.println("length="+length+" "+"width="+width+" "+"depth="+depth);
  }
}
class overloaddemo
{
  public static void main(String []args)
  {
     box b1=new box();
     //b1.setbox();
     b1.display();
     box b2=new box(2.0,5.0,3);
     //b1.setbox(4.0,2.3,5.2);
     b2.display();
     box b3= new box(b2);
     b3.display();
  }
}
 



//Static and non-sttaic in java

class myclass
{	
    static int count=0;
    myclass()
    {
	count++;
    }
}
class staticdemo
{
    public static void main(String ...s)
    {
	System.out.println(myclass.count);
	myclass obj1=new myclass();
        myclass obj2=new myclass();
	myclass obj3=new myclass();
	System.out.println(myclass.count);
    }
}


class staticdemo
{
    static int cube(int n)
    {
	return n*n*n;
    }
    public static void main(String []args)
    {
	System.out.println(cube(5));
    }
}


class myclass
{
    int nonstatic_x=100;
    static int static_x=200;
    static void staticmethod()
    {
	System.out.println("static_x ="+static_x);
        myclass obj=new myclass();
	System.out.println(obj.nonsattic_x);
    }
    void nonstaticmethod()
    {
	System.out.println("nonstatic_x="+nonstatic_x);
	System.out.println("sattic_x="+static_x);
    }
    public static void main(String []args)
    {
	staticmethod();
	myclass temp=new myclass();
	temp.nonstaticmethod();
    }
}


//Nested class
class employee
{
    int id;
    String name;
    double salary;
    Date joiningDate;

    class Date
    {
	int day;
	int month;
	int year;
	Date(int day,int month,int year)
	{
	    this.year=year;
	    this.month=month;
	    this.day=day;
	}
    }
    
    employee()
    {
	id=101;
	name="tom cruise";
	salary=0.0;
	joiningDate=new Date(1,1,2015);
    }
    void showemployee()
    {
	System.out.println("id="+id);
	System.out.printlm("name ="+name);
	System.out.println("salary="+salary);
	System.out.prinf("joining date= %02d/%02d/%04d\n",day,month,year);
    }
}
public class InnerclassDemo
{
    public static void main(String []args)
    {
	employee e1=new employee();
	e1.showemployee();
    }
}	


//command line argument
public class stringdemo
{
    static public void main(String []args)
    {
	String mystring = new String("I love java");
	System.out.println(mystring.length);
	System.out.println(mystring.isEmpty());
	System.out.println(charAt(0));
	String temp=new String("Ilove Java");
	if(mystring.equalsIgnoreCase(temp));
	    System.out.println("Same");
	else
	    System.out.println("Different");
    }
}


class comandline
{
    public static void main(String []args)
    {
	for(int i=0;i<args.length;i++)
	    System.out.println("args"+"["+i+"]"+"="+args[i]);
    }
}

//varriable length argument
class passarray
{
    static int sum(int r[])
    {
	int s=0;
	for(int item:r)
	   s+=item;
        return s;
    }
    public static void main(String []args)
    {
	int m1[]={10};
  	int m2[]={10,20};
        int m3[]={12,20,32};
	System.out.println("sum of m1="+sum(m1));
	System.out.println("sum of m2="+sum(m2));
	System.out.println("sum of m3="+sum(m3));
    }
}


class passarray
{
    static int sum(int...v)
    {
	int s=0;
	for(int item:v)
  	    s+=item;
	return s;
    }
    public static void main(String []args)
    {
	System.out.println(sum(10));
	System.out.println(sum(10,20));
	System.out.println(sum(20,10,32,40));
    }
}


//INheritance
//1]Single level inheritance
class animal
{
   void eat()
   {
	System.out.println("animal is eating");
   }
}
class dog extends animal
{
   void bark()
   {
	System.out.println("dog is barking");
   }
}
class inheritdemo
{
    public static void main(String []args)
    {
	dog d=new dog();
	d.eat();
	d.bark();
    }
}

//2]multilevel inheritance
class animal
{
    void eat()
    {
	System.out.println("animal is eating");
    }
}
class mammel extends animal
{
    void sleep()
    {
	System.out.println("mammels are sleeping");
    }
}
class dog extends mammel
{
    void bark()
    {
	System.out.println("dog is barking");
    }
}
class inheritdemo
{
    public static void main(String []args)
    {
	dog d=new dog();
        d.eat();
	d.sleep();
	d.bark();
    }
}

//3]hirarchical inheritance
class animal
{
    void eat()
    {
	System.out.println("animal is eating");
    }
}
class dog extends animal
{
    void bark()
    {
      System.out.println("dog is barking");
    }
}
class puppy extends dog
{
    void howl()
    {
	System.out.println("puppy is howling");
    }
}
class cat extends animal
{
    void meow()
    {
	System.out.println("meow! meow!");
    }
}
class kitten extends cat
{
    void purr()
    {
	System.out.println("kitten is purrig");
    }
}
class inheritdemo
{
    public static void main(String []args)
    {
	cat c=new cat();
        c.eat();
	c.meow();
        puppy p=new puppy();
	p.bark();
	p.howl();
	p.eat();
    }
}


//order of constructor in inheritance
class parent
{
   parent()
   {
	System.out.println("inside parent class");
   }
}
class child extends parent
{
    child()
    {
	System.out.println("inside child class");
    }
}
class inheritdemo
{
    public static void main(String []args)
    {
	child c=new child();
    }
}
o/p:-inside parent class
     inside child class


class parent
{
    parent()
    {
	System.out.println("inside parent");
    }
    parent(int x)
    {
	System.out.println("inside parent(int)");
    }
}
class child extends parent
{
    child()
    {
        System.out.println("inside child");
    }
    child(int x)
    {
        System.out.println("inside child(int)");
}
class inheritdemo
{
    public static void main(String args[])
    {
        child c= new child();
        child c1=new child(10);//here is the problem we can not go to the parameterized constructor of the parent class to access the parent class we have to use super
    }
}
}

class parent
{
    parent()
    {
	System.out.println("inside parent");
    }
    parent(int x)
    {
	System.out.println("inside parent(int)");
    }
}
class child extends parent
{
    child()
    {
        System.out.println("inside child");
    }
    child(int x)
    {
        super(x);
        System.out.println("inside child(int)");
    }
}
class inheritdemo
{
    public static void main(String args[])
    {
        child c= new child();
        child c1=new child(10);
    }
}
o/p:-inside parent
inside child
inside parent(int)
inside child(int)



//superclass object can refer to the subclass object
class animal
{
}
class dog extends animal
{}
class cat extends animal
{}
class inheritdemo
{
   public static void main(String []args)
   {
      animal ref;
      ref=new cat();
      ref -new dog();
   }
}


//method overriding 
class A
{
    int cube(int n)
    {
	return 0;
    }
}
class B extends A
{
    int cube(int n)
    {
	return n*n*n;
    }
}
class inheritdemo
{
    public static void main(String []args)
    {
	A ref=new B();
	System.out.println(ref.cube(5));
    }
}

in java by default priority is to the object rather than the reference variable thats why 
we can refere a object of derived class by reference variable of base class


//polymorphism
class test
{
    void callme()
    {
	System.out.println("Inside callme");
    }
    void callme(int n)
    {
	System.out.println("inside callme(int)");
    }
}
class polymorphism
{
    public static void main(String []args)
    {
	test t=new test();
	t.callme(8);
	t.callme();
    }
}


*************
*   *+*    *
*  *+*+*   *
* *+*+*+*  *
*+*+*+*+*+ *
* *+*+*+*  *
*  *+*+*   *
*   *+*    *
*************


import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        double radius, area, circumference;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Radius For Calculating Area Of Circle:");
        radius = sc.nextDouble();

        area = 3.14 * radius * radius;
        System.out.println("The Area Of Circle Is: " + area);

        circumference = 2 * 3.14 * radius;
        System.out.println("The Circumference Of Circle Is: " + circumference);

        sc.close();
    }
}

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose the conversion option (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (9.0 / 5.0) * celsius + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (5.0 / 9.0) * (fahrenheit - 32);
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            System.out.println("Invalid choice. Please choose 1 or 2.");
        }

        scanner.close();
    }
}


import mymath.Complex;

public class practice {
    public static void main(String[] args) {
        // Creating an array of Complex objects
        Complex[] numbers = new Complex[2];

        // Initializing objects
        numbers[0] = new Complex(3.5, 2.5);
        numbers[1] = new Complex(1.5, 4.5);

        // Displaying original numbers
        System.out.print("First Complex Number: ");
        numbers[0].display();

        System.out.print("Second Complex Number: ");
        numbers[1].display();

        // Adding the two complex numbers
        Complex result = numbers[0].add(numbers[1]);

        // Displaying result
        System.out.print("Sum: ");
        result.display();
    }
}

import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        Displayable[] vehicles = new Displayable[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for vehicle " + (i + 1));
            System.out.print("Enter type (1 - Light, 2 - Heavy): ");
            int type = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter company name: ");
            String company = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            if (type == 1) {
                System.out.print("Enter mileage (km/l): ");
                double mileage = sc.nextDouble();
                vehicles[i] = new LightMotorVehicle(company, price, mileage);
            } else if (type == 2) {
                System.out.print("Enter capacity (tons): ");
                double capacity = sc.nextDouble();
                vehicles[i] = new HeavyMotorVehicle(company, price, capacity);
            } else {
                System.out.println("Invalid type! Skipping...");
                i--; // repeat iteration
            }
        }

        // Display all vehicles
        System.out.println("\n--- Vehicle Information ---");
        for (Displayable v : vehicles) {
            v.display();
        }

        sc.close();
    }
} 

import java.util.Scanner;

// Custom Exception
class UserValidationException extends Exception {
    public UserValidationException(String message) {
        super(message);
    }
}

// Interface
interface CardOperations {
    void useCard(double amount);
    void payCredit(double amount);
}

// Superclass
class CardCustomer implements CardOperations {
    String name, city, vehicleType;
    int age;
    double income;
    double creditLimit = 50000;
    double creditAmount = 0;

    CardCustomer(String name, int age, double income, String city, String vehicleType) throws UserValidationException {
        this.name = name;
        this.age = age;
        this.income = income;
        this.city = city;
        this.vehicleType = vehicleType;

        validateUser();
    }

    public void validateUser() throws UserValidationException {
        if (age < 18 || age > 55)
            throw new UserValidationException("Age must be between 18 and 55.");
        if (income < 50000 || income > 100000)
            throw new UserValidationException("Income must be between ₹50,000 and ₹1,00,000.");
        if (!(city.equalsIgnoreCase("Pune") || city.equalsIgnoreCase("Mumbai") || 
              city.equalsIgnoreCase("Bangalore") || city.equalsIgnoreCase("Chennai")))
            throw new UserValidationException("City must be Pune, Mumbai, Bangalore, or Chennai.");
        if (!vehicleType.equalsIgnoreCase("4-wheeler"))
            throw new UserValidationException("User must own a 4-wheeler.");
    }

    public void useCard(double amount) {
        if (creditAmount + amount <= creditLimit) {
            creditAmount += amount;
            System.out.println("Card used for ₹" + amount + ". Total credit used: ₹" + creditAmount);
        } else {
            System.out.println("Cannot exceed credit limit of ₹" + creditLimit);
        }
    }

    public void payCredit(double amount) {
        if (amount <= creditAmount) {
            creditAmount -= amount;
            System.out.println("Paid ₹" + amount + ". Remaining credit: ₹" + creditAmount);
        } else {
            System.out.println("You are trying to pay more than you owe!");
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Income: ₹" + income);
        System.out.println("City: " + city);
        System.out.println("Vehicle: " + vehicleType);
        System.out.println("Credit Limit: ₹" + creditLimit);
        System.out.println("Credit Used: ₹" + creditAmount);
    }
}

// Subclass with extended limit
class GoldCardCustomer extends CardCustomer {
    int increaseCount = 0;

    GoldCardCustomer(String name, int age, double income, String city, String vehicleType) throws UserValidationException {
        super(name, age, income, city, vehicleType);
    }

    public void increaseLimit(double amount) {
        if (increaseCount < 3 && amount <= 5000) {
            creditLimit += amount;
            increaseCount++;
            System.out.println("Credit limit increased by ₹" + amount + ". New limit: ₹" + creditLimit);
        } else {
            System.out.println("Limit increase failed. You can increase up to 3 times, ₹5000 max each.");
        }
    }
}


public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            // Input
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter monthly income: ");
            double income = sc.nextDouble();
            sc.nextLine(); // consume newline
            System.out.print("Enter city: ");
            String city = sc.nextLine();

            System.out.print("Enter vehicle type (4-wheeler): ");
            String vehicle = sc.nextLine();

            // Create GoldCardCustomer object
            GoldCardCustomer customer = new GoldCardCustomer(name, age, income, city, vehicle);

            customer.display();

            // Try card operations
            customer.useCard(10000);
            customer.payCredit(3000);
            customer.increaseLimit(4000); // First increase
            customer.increaseLimit(5000); // Second increase
            customer.increaseLimit(6000); // Invalid - more than 5000
            customer.increaseLimit(2000); // Third increase
            customer.increaseLimit(2000); // Invalid - already 3 times

        } catch (UserValidationException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }

        sc.close();
    }
}


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> numbers = new TreeSet<>();

        System.out.print("Enter how many integers you want to input: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            boolean added = numbers.add(num);
            if (!added) {
                System.out.println("Duplicate " + num + " not added.");
            }
        }

        // Displaying sorted unique numbers
        System.out.println("\nSorted Unique Numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

import java.util.Hashtable;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        // Create a Hashtable to store student name and percentage
        Hashtable<String, Double> studentData = new Hashtable<>();

        // Adding student data
        studentData.put("Alice", 85.5);
        studentData.put("Bob", 78.2);
        studentData.put("Charlie", 92.0);
        studentData.put("Diana", 88.6);

        // Display all students and their percentages
        System.out.println("Student Records:");
        for (String name : studentData.keySet()) {
            System.out.println("Name: " + name + ", Percentage: " + studentData.get(name));
        }

        // Search for a specific student
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter student name to search: ");
        String searchName = scanner.nextLine();

        if (studentData.containsKey(searchName)) {
            System.out.println("Percentage of " + searchName + ": " + studentData.get(searchName));
        } else {
            System.out.println(searchName + " not found in the records.");
        }

        scanner.close();
    }
}

import java.util.*;

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numberSet = new HashSet<>();

        System.out.print("Enter how many numbers you want to input: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        try {
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (!numberSet.add(num)) {
                    // Duplicate found, throw exception
                    throw new DuplicateNumberException("Duplicate number found: " + num);
                }
            }
            System.out.println("All numbers entered successfully. No duplicates found.");
            System.out.println("Numbers: " + numberSet);

        } catch (DuplicateNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

import java.util.ArrayList;

public class practice{     
    public static void main(String[] args) { 

        ArrayList<Integer> a1 = new ArrayList<>();   
        for (int i = 1; i < 7; i++) {             
            a1.add(i * 10); 
        } 
        
        System.out.println(a1);         
        a1.set(1, 12); 
        System.out.println(a1); 
        System.out.println(a1.size()); 
    }  
} 
*/
import java.io.*;

class practice {
    private String line;
    private boolean hasData = false;

    public synchronized void setLine(String line) throws InterruptedException {
        while (hasData) {
            wait(); // wait until data is consumed
        }
        this.line = line;
        hasData = true;
        notify(); // notify writer
    }

    public synchronized String getLine() throws InterruptedException {
        while (!hasData) {
            wait(); // wait until data is available
        }
        hasData = false;
        notify(); // notify reader
        return line;
    }
}

class Reader extends Thread {
    private BufferedReader reader;
    private practice data;

    public Reader(String sourceFile, practice data) {
        this.data = data;
        try {
            reader = new BufferedReader(new FileReader(sourceFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                data.setLine(line);
            }
            data.setLine("EOF"); // End-of-file signal
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Writer extends Thread {
    private BufferedWriter writer;
    private practice data;

    public Writer(String destFile, practice data) {
        this.data = data;
        try {
            writer = new BufferedWriter(new FileWriter(destFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        try {
            String line;
            while (!(line = data.getLine()).equals("EOF")) {
                writer.write(line);
                writer.newLine();
            }
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
