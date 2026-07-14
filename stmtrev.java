import java.util.Scanner;
class Stack
{
    char stck[];
    int top;
    Stack(int n)
    {
        stck=new char[n];
        top=-1;
    }
    boolean is_empty()
    {
        return top==-1;
    }
    void push(char ch)
    {
        stck[++top]=ch;
    }
    char pop()
    {
        return stck[top--];
    }
    
}

class stmtrev
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        String s;
        System.out.println("enter a statement");
        s=sc.nextLine();

        Stack stck=new Stack(s.length());
        for(int i=0;i<s.length();i++)
        {   
            char ch = s.charAt(i);
            if (ch ==' ')
            {
                while(!stck.is_empty())
                {
                    System.out.print(stck.pop());
                }
                System.out.print(" ");
            }
            else
            {
                stck.push(ch);
            }
        }
        while(!stck.is_empty())
        {
            System.out.print(stck.pop());
        }
    }
}