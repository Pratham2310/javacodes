//static method
public class staticdem {
    static int cube(int n)
    {
        return n*n*n;
    }
    public static void main(String []args)
    {
        int result=cube(3);
        System.out.println(result);
    }
}

/*
 * in the above program we can see that the method cube is also the static
 * and main method is also static thats why we can access the static method cube from 
 * static method main without creating any object of the class
 * 
 * 
 * in simple way we can say that we can access the static method from anothe rstatic method 
 * without creating instance  or object of that calss
 */