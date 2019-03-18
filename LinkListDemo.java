class Node
{
    int value;
    Node next;
    public Node(int value)
    {
        this.value=value;
        this.next= null;
    }
}

class Lcode
{
    Node head;
    public Node insertBeg(int val, Node head)
    {
        Node newNode = new Node(val);
        if(head==null)
        {
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        return head;
    }
    public void insertEnd(int val, Node head)
    {
        Node tmp=head;
        Node tmpPre=head;
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            while(tmp!=null)
            {
                tmpPre=tmp;
                tmp=tmp.next;
            }
            tmpPre.next=newNode;
            newNode.next=null;
        }
    }
    public void insertPart(int val,int pos, Node head)
    {
        Node tmp=head;
        Node tmpPre=head;
        int posi=0;
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;
        }
        if(pos==0)
        {
            newNode.next=head;
            head=newNode;
        }
        else
        {
            while(posi!=pos)
            {
                tmpPre=tmp;
                tmp=tmp.next;
                posi++;
            }
            if(tmpPre!=null)
            {
                newNode.next=tmpPre.next;
                tmpPre.next=newNode;
            }
            else
            {
                System.out.println("Wrong position entered");
            }
        }    
        
    }
    public void delete(int pos,Node head)
    {
        // implement it urself
    }
    
    public Node reverse(Node head)
    {
        Node prev=null;
        Node nextt;
        Node current=head;
        
        while(current!=null)
        {
            nextt=current.next;
            current.next=prev;
            prev=current;
            current=nextt;
        }
        head=prev;
        return head;
    }
    
    public void display(Node head)
    {
        Node tmp=head;
        while(tmp!=null)
        {
            System.out.println(tmp.value+" ");
            tmp=tmp.next;
        }
    }
}

public class LinkListDemo
{
    public static void main(String args[])
    {
        Lcode l1 = new Lcode();
        l1.head=null;
        l1.head=l1.insertBeg(2,l1.head);
        l1.head=l1.insertBeg(1,l1.head);
        l1.insertEnd(3,l1.head);
        l1.head=l1.insertBeg(0,l1.head);
        l1.insertEnd(4,l1.head);
        l1.insertPart(8,3,l1.head);
        l1.display(l1.head);
        l1.head=l1.reverse(l1.head);
        System.out.println("after reversal");
        l1.display(l1.head);
        
        
    }
}