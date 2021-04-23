import java.util.*;
class singlelinkedlist
{
    class Node
    {
        int data;
        Node next;
        Node start=null;
        Node sorted=null;
    }
    Node create(Node start,int data)
    {
        Node newnode=new Node();
        newnode.data=data;
        newnode.next=null;
        if (start==null)
        {
            start=newnode;
            return start;
        }
        else 
        {
            Node temp=start;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
            return start;
        }
    }
    void display(Node start)
    {
        if (start==null)
        {
            System.out.println("no data");
        }
        else
        {
            Node temp=start;
            while (temp!=null)
            {
            System.out.println(temp.data);
            temp=temp.next;
            }
        }
    }
    Node insertionsort(Node start,Node sorted)
    {
        Node current,nextt;
        current=start;
        while (current!=null)
        {
           nextt=current.next;
           sorted=sorting(sorted,current);
           current=nextt;
        }
        start=sorted;
        return start;
    }
    Node sorting(Node sorted,Node newnode)
    {
        if (sorted==null || sorted.data>newnode.data)
        {
            newnode.next=sorted;
            sorted=newnode;
        }
        else
        {
        Node current=sorted;
        while (current.next!=null && current.next.data<newnode.data)
        {
            current=current.next;
        }
        newnode.next=current.next;
        current.next=newnode;
        }
        return sorted;
    }
    
}
class insertionsort
{
    public static void main(String args[])
    {
        singlelinkedlist sl=new singlelinkedlist();
        singlelinkedlist.Node nn=sl.new Node();
        Scanner myobj=new Scanner(System.in);
        //nn.start=null;
        int ch=1,data,choice;
        while (ch==1)
        {
            System.out.println("1.Create\n2.Display\n3.Exit\n4.Insertion sorting\nEnter your choice");
            choice=myobj.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter any data");
                    data=myobj.nextInt();
                    nn.start=sl.create(nn.start,data);
                    break;
                }
                case 2:
                {
                    sl.display(nn.start);
                    break;
                }
                case 3:
                {
                    ch=0;
                }
                case 4:
                {
                    nn.start=sl.insertionsort(nn.start,nn.sorted);
                    break;
                }
                default:
                {
                    System.out.println("Wrong choice\n");
                }
            }
        }
    }
}
