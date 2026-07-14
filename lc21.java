class listnode
{
    int val;
    listnode next;
    listnode(int val)
    {
        this.val=val;
    }
}
class listmerge
{
    listnode summing(listnode l1, listnode l2)
    {
        listnode dummynode =new listnode(0);
        listnode curr =dummynode;
        while(l1!= null && l2!=null)
        {
            if(l1.val <= l2.val)
            {
                curr.next=l1;
                l1= l1.next;
            }
            else{
                curr.next=l2;
                l2=l2.next;
            }
            curr= curr.next;
        }
        if(l1!=null)
        {
            curr.next=l1;
        }
        else{
            curr.next=l2;
        }
        return dummynode.next;
    }
}
public class lc21 {
    public static void main(String args[])
    {

    }
}
