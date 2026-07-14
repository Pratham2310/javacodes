class Stk
{
    int stk[]=new int[10];
    int tos;
    Stk()
    {
        tos=-1;
    }
    boolean is_empty()
    {
        if(tos==-1)
            return true;
        return false;
    }
    void push(int i)
    {
        stk[++tos]=i;
    }
    int  pop()
    {
        if(tos==-1)
        {
            System.out.println("Stack is empty");
        }
        return stk[tos--];
    }
    void Display()
    {
        for(int i=0;i<stk.length;i++)
        {
            if(stk[i]>0)
            {
                System.out.print(stk[i]+"->");
            }
        }
        System.out.println();
    }
}
public class st {
    public static void main(String args[])
    {
        Stk tk= new Stk();
        tk.push(10);
        tk.push(20);
        tk.push(30);
        tk.push(50);
        tk.push(30);
        tk.Display();
        System.out.println("this elemnet is poped"+tk.pop());
        System.out.println("this elemnet is poped"+tk.pop());
        tk.Display();
    }
}
