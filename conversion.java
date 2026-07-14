import java.util.Scanner;
class Stack
{
    char stack[];
    int top;
    Stack(int s)
    {
        stack=new char[s];
        top=-1;
    }
    void push(char e)
    {
        stack[++top]=e;
    }
    char pop()
    {
        return stack[top--];
    }
    boolean isEmpty()
    {
        return top==-1;
    }
    char peek()
    {
        return stack[top];
    }

}
public class conversion {
    static int getpriority(char op)
    {
        switch (op) {
            case '^':
            case '$':
                     return 3;
           
            case '%':
            case '/':
            case '*':
                        return 2;
            
            case '+':
            case '-':
                        return 1;
        
        }
        return 0;
    }
    static boolean isoperator(char ch)
    {
        if(ch=='('||ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%'||ch=='^'||ch=='$')
            return true;
        return false;
    }

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a infix expression");
        String infix=sc.nextLine();
        Stack stack=new Stack(20);
        String postfix="";
        int i=0;
        while(i<infix.length())
        {
            char current=infix.charAt(i);
            if(isoperator(current))
            {
                if(stack.isEmpty()||current=='('||stack.peek()=='(')
                    stack.push(current);
                else
                {
                    if(getpriority(current)>=getpriority(stack.peek()))
                        stack.push(current);
                    else
                    {
                        while(!stack.isEmpty() && stack.peek()!='(' && getpriority(stack.peek())>=getpriority(current))
                                postfix=postfix+stack.pop();
                        stack.push(current);
                    }
                }
            }
            else if(current == ')')
            {
                while (stack.peek()!='(') 
                {
                    postfix=postfix+stack.pop();    
                }
                stack.pop();  // (
            }
            else  //operand
            {
                postfix=postfix+current;
            }
            i++;
        }
        while(!stack.isEmpty())
        {
            postfix=postfix+stack.pop();
        }
        System.out.println("postfix ="+postfix);

    }
}
