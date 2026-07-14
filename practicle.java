class practicle
{
 	String name;
 	int age;
 	pr(String name, int age) 
{
 		this.name = name;
 		this.age = age;
 	}
 	void displayP()
{
 		System.out.println("Name: " + name);
 		System.out.println("Age: " + age);
 	}
 	public static void main(String[] args) 
{
 		Person p1 = new Person("Amit", 22);
 		p1.display();
 	}
}
