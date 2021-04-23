import java.util.*;
class singlelinkedlists
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
    void count(Node start)
    {
        Node temp=start;
        int cnt=0;
        if (start==null)
        {
            System.out.println("Zero node");
        }
        else 
        {
            while (temp!=null)
            {
                cnt=cnt+1;
                temp=temp.next;
            }
            System.out.println(cnt);
        }
    }
}
class countlist
{
    public static void main(String args[])
    {
        singlelinkedlists s1=new singlelinkedlists();
        singlelinkedlists.Node nn=s1.new Node();
        Scanner myobj=new Scanner(System.in);
        int ch=1,choice,data;
        while(ch==1 )
        {
            System.out.println("1.Create\n2.Display\n3.Exit\n4.Count the node\nEnter your choice");
            choice=myobj.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("enter your data");
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
                    ch=0;
                    break;
                }
                case 4:
                {
                    s1.count(nn.start);
                    break;
                }
                default:
                {
                    System.out.println("Invalid choice");
                    break;
                }
            }
        }
    }
}
        