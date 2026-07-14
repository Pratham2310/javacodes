class gen<T>
{
    T ob;
    gen(T o)
    {
        ob=o;
    }
    T getob()
    {
        return ob;
    }
    void showtype()
    {
        System.out.println("Type of ob is"+ob.getClass().getName());
    }
}
public class gendemo 
{
    public static void main(String[] args) 
    {
        gen<Integer> ob=new <Integer>gen(88);
        ob.showtype();
        int v =ob.getob();
        System.out.println("value="+v);
        gen<String>s1=new <String>gen("Test line");
        s1.showtype();
        String s=s1.getob();
        System.out.println(s);   
    }    
}
