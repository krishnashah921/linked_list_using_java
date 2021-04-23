import java.util.*;
class singlelist
{
    class Node 
    {
        int data;
        Node next;
        Node start=null;
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
        Node temp=start;
        if (temp==null)
        {
            System.out.println("Empty");
        }
        else 
        {
            while (temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    void getmiddle(Node start)
    {
        Node slow,fast;
        slow=fast=start;
        while (fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }
    
}
class middle
{
    public static void main(String args[])
    {
        singlelist s1=new singlelist();
        singlelist.Node nn=s1.new Node();
        Scanner myobj=new Scanner(System.in);
        int c=1,ch,data;
        while (c==1)
        {
            System.out.println("1.Create\n2.Display\n3.get Middle\n4.Exit\nEnter your choice");
            ch=myobj.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.println("Enter your data");
                    data=myobj.nextInt();
                    nn.start=s1.create(nn.start,data);
                    break;
                }
                case 2:
                {
                    s1.display(nn.start);
                    break;
                }
                case 3:
                {
                    s1.getmiddle(nn.start);
                    break;
                }
                case 4:
                {
                    c=0;
                    break;
                }
                default:
                {
                    System.out.println("wrong choice");
                    break;
                }
                }
                }
            }
        }