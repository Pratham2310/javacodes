import java.util.Scanner;
class  stack
{
    char arr[];
    int tos=-1;
    stack(String s)
    {
        int le= s.length();
        arr=new char[le];
    }
    boolean is_empty()
    {
        if(tos== -1)
        {
            return true;
        }
        return false;
    }
    void push(char ch)
    {
        arr[++tos]=ch;
    }
    char pop()
    {
        if(is_empty())
        {
            System.out.println("stack is empty");
        }
        return arr[tos--];
    }
    
    

}
public class strrev 
{
    public static void main(String args[])
    {
        System.out.println("enter a string");
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        stack t1= new stack(str);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                while(t1.is_empty()!= true)
                    System.out.print(t1.pop());
                System.out.print(" ");
            }
            //System.out.print(" ");
            t1.push(str.charAt(i));
        }
        while(!(t1.is_empty()))
        {
            System.out.print(t1.pop());
        }
    }    
}
