
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
    void push(char ele)
    {
        stck[++top]=ele;
    }
    char pop()
    {
        System.out.println("element poped is "+stck[top]);
        return stck[top--];
    }
    char peek()
    {
        return stck[top]; 
    }
    boolean isEmpty()
    {
        return top== -1;
    }
}
public class InfixToPostfix 
{
    static int getPriority(char op)
    {
        switch(op)
        {
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
    static boolean isOperator(char op)
    {
        if(op=='(' || op==')' || op=='^'||op=='$'||op=='*'||op=='/'||op=='%'||op=='+'||op=='-')
            return true;
        return false;
    }
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a expression");
        String infix=sc.nextLine();
        Stack stack =new Stack(50);
        sc.close();
        String postfix="";
        int i=0;
        while(i<infix.length())
        {
            char current=infix.charAt(i);
            if(isOperator(current))
            {
                    if(stack.isEmpty() || current=='('||stack.peek()=='(')
                    {
                        stack.push(current);
                    }
                    else
                    {
                        if (getPriority(current)>getPriority(stack.peek()))
                            stack.push(current);
                        else
                        {
                            while(!stack.isEmpty() && stack.peek()!='(' && getPriority(stack.peek())>=getPriority(current))
                            {
                                postfix=postfix+stack.pop();
                            }
                            stack.push(current);
                        }
                    }
            }
            else if(current ==')')
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
        System.out.println("postfix="+postfix);
    }

}
/* 
import java.util.Scanner;

class MyStack {
    char stck[];
    int top;

    MyStack(int n) {
        stck = new char[n];
        top = -1;
    }

    void push(char ele) {
        stck[++top] = ele;
    }

    char pop() {
        System.out.println("element popped is " + stck[top]);
        return stck[top--];
    }

    char peek() {
        return stck[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class InfixToPostfix {
    static int getPriority(char op) {
        switch (op) {
            case '^':
            case '$':
                return 3;
            case '*':
            case '/':
            case '%':
                return 2;
            case '+':
            case '-':
                return 1;
        }
        return 0;
    }

    static boolean isOperator(char op) {
        return op == '^' || op == '$' || op == '*' || op == '/' || op == '%' || op == '+' || op == '-';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an expression:");
        String infix = sc.nextLine();
        MyStack stack = new MyStack(50);
        sc.close();

        String postfix = "";
        int i = 0;
        while (i < infix.length()) {
            char current = infix.charAt(i);

            if (Character.isLetterOrDigit(current)) {
                postfix = postfix + current;
            } else if (current == '(') {
                stack.push(current);
            } else if (current == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix = postfix + stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop(); // discard '('
                }
            } else if (isOperator(current)) {
                while (!stack.isEmpty() && stack.peek() != '(' && getPriority(stack.peek()) >= getPriority(current)) {
                    postfix = postfix + stack.pop();
                }
                stack.push(current);
            }

            i++;
        }

        while (!stack.isEmpty()) {
            postfix = postfix + stack.pop();
        }

        System.out.println("postfix = " + postfix);
    }
}
*/