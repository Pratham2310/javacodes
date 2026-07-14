class Node
{
    int data;
    Node next,prev;
    Node(int d)
    {
        data=d;
        next=null;
        prev=null;
    }
};

class DoublyLinkedList
{
    Node head,tail;
    DoublyLinkedList()
    {
        head=tail=null;
    }
    void InsterAtBeg(int d)
    {
        Node newNode = new Node(d);
        if (head==null)
        {
            head=tail=newNode;
        }
        else
        {
            newNode.next=head;
            newNode.prev=null;
            head.prev=newNode;
            head=newNode;
        }
    }
    void InserAtEnd(int d)
    {
        Node newNode = new Node(d);
        if(head==null)
        {
            head=tail=newNode;
        }
        else
        {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    void delAtBeg()
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
        }
        else
        {
            head=head.next;    
            head.prev=null;  
        }
    }
    void DelAtEnd()
    {
        if(head==null)
        {
            System.out.println("Linked List is Empty");
        }
        else
        {
            tail=tail.prev;
            tail.next=null;
        }
    }
    void ShowForward(String msg)
    {
        System.out.print(msg+":");
        for(Node q=head;q!=null;q=q.next)
        {
            System.out.print(q.data+" ");
        }
        System.out.println();
    }
    void ShowBackward(String msg)
    {
        System.out.print(msg+":");
        for(Node q=tail;q!=null;q=q.prev)
        {
            System.out.print(q.data+" ");
        }
        System.out.println();
    }
}

class DoublyLinkedListDemo
{
    public static void main(String args[])
    {
        DoublyLinkedList dll= new DoublyLinkedList();
        dll.InserAtEnd(30);
        dll.InsterAtBeg(20);
        dll.InserAtEnd(40);
        dll.InsterAtBeg(10);
        dll.InserAtEnd(50);
        dll.ShowBackward("Backward list printing");
        dll.ShowForward("Forward list printng");
    }
}