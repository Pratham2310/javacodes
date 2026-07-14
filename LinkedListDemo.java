class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;
        next=null;
    }
};

class SinglyLinkedList
{

    Node head,tail;
    SinglyLinkedList()
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
        }
    }
    void DelAtEnd()
    {
        Node q;
        if(head==null)
        {
            System.out.println("Linked List is Empty");
        }
        else
        {
            for(q=head;q.next.next!=null;q=q.next);
            tail=q;
            tail.next=null;
        }
    }
    void show(String msg)
    {
        System.out.print(msg+":");
        for(Node q=head;q!=null;q=q.next)
        {
            System.out.print(q.data+" ");
        }
        System.out.println();
    }
}

class SinglyLinkedListDemo
{
    public static void main(String args[])
    {
        SinglyLinkedList sll= new SinglyLinkedList();
        for(int i=1;i<=5;i++)
        {
            sll.InsterAtBeg(i*10);
        }
        sll.show("Befor Inset At End");
        sll.InserAtEnd(60);
        sll.InserAtEnd(70);
        sll.InserAtEnd(80);
        sll.show("after Insert at End");
        for(int i=1;i<=3;i++)
        {
            sll.DelAtEnd();
        }
        sll.show("Linked List");
    }
}