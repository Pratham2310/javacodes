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
	System.out.println("name ="+name);
	System.out.println("salary="+salary);
	System.out.printf("joining date= %02d/%02d/%04d\n",joiningDate.day,joiningDate.month,joiningDate.year);
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