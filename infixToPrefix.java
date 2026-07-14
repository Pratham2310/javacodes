import java.util.Scanner;
class Stack
{
    char stck[];
    int top;
    Stack(int n)
    {
        stck= new char[n];
        top=-1;
    }
    void push(char ele)
    {
        stck[++top]=ele;
    }
    char pop()
    {
        return stck[top--];
    }
    boolean isEmpty()
    {
        return top==-1;
    }
    char peek()
    {
        return stck[top];
    }
}
public class infixToPrefix 
{
    static boolean isOperator(char ch)
    {
        if(ch=='('||ch==')'||ch=='$'||ch=='^'||ch=='*'||ch=='%'||ch=='/'||ch=='+'||ch=='-')
            return true;
        return false;
    }
    static int getPriority(char ch)
    {
        switch (ch) 
        {
            case '^':
            case '$':
                return 3;
            
            case '/':
            case '%':
            case '*':
                    return 2;
            
            case '+':
            case '-':
                    return 1;
        }
        return 0;
    }
    static String reversed(String s)
    {
        String reversed="";
        for(int i=0;i<s.length();i++)
        {
            reversed=s.charAt(i)+reversed;
        }
        return reversed;

    }


    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        Stack stack =new Stack(50);
        System.out.println("Enter a Expressiom");
        String infix=sc.nextLine();
        sc.close();
        String postfix="";
        String prefix="";
        int i=0;
        String reverse=reversed(infix);
        while(i<reverse.length())
        {
            char current= reverse.charAt(i);
            if(isOperator(current))
            {
                if(stack.isEmpty() || stack.peek()=='(' || current=='(')
                    stack.push(current);
                else
                {
                    while(!stack.isEmpty() && stack.peek()!='(' && getPriority(current)<=getPriority(stack.peek()))
                    {
                        postfix+=stack.pop();
                    }
                    stack.push(current);
                }
            }
            else if(current==')')
            {
                while(stack.peek()!='(')
                {
                    postfix=postfix+stack.pop();
                }
                stack.pop();
            }
            else
            {
                postfix=postfix+current;
            }
            i++;
        }
        while(!stack.isEmpty())
        {
            postfix=postfix+stack.pop();
        }
       prefix= reversed(postfix);
       System.out.println("prefix of the expression is ="+prefix);
    }
}
