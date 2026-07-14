
class myclass
{
    int nonstatic_x=100;
    static int static_x=200;
    static void staticmethod()
    {
	System.out.println("static_x ="+static_x);
        myclass obj=new myclass();
	System.out.println(obj.nonstatic_x);
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