class Stack<T extends Number> {
    T arr[];
    int top=-1;
    int capacity;
    boolean isFull()
    {
        return top==capacity-1;
    }
    boolean isEmpty()
    {
        return top==-1;
    }
    void push(T ele)
    {
        if(!isFull())
            arr[++top]=ele;
        else
            System.out.println("Stack overflow"+ele);
    }
    T pop()
    {
    
         return  arr[top--];
        
    }
}
public class GenericStackDemo {
    public static void main(String[] args) 
    {
        Stack <Integer>t=new Stack<>();
        for(int i=0;i<=7;i++)
            t.push(i*10);
        for(int i=0;i<=5;i++)
            System.out.println(t.pop());    
    }
}
