import java.util.*;
class singlelinkedlists
{
    class Node
    {
        int data;
        Node next;
        
        Node start1=null;
        Node start2=null;
       
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
Node merge(Node start1,Node start2)
{
    Node t1=start1,t2=start2;
    while (t1.next!=null)
    {
        t1=t1.next;
    }
    t1.next=t2;
    return start1;
}
}
class merge
{
    public static void main(String args[])
    {
        singlelinkedlists s1=new singlelinkedlists();
        singlelinkedlists.Node nn=s1.new Node();
        Scanner myobj=new Scanner(System.in);
        int ch=1,choice,data;
        while(ch==1 )
        {
            System.out.println("1.Create\n2.Display\n3.Exit\n4.Merge the two list\nEnter your choice");
            choice=myobj.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("List 1 or 2");
                    data=myobj.nextInt();
                    if (data==1)
                    {
                        System.out.println("enter your data");
                    data=myobj.nextInt();
                    nn.start1=s1.create(nn.start1,data);
                    }
                    else 
                    {
                        System.out.println("enter your data");
                    data=myobj.nextInt();
                    nn.start2=s1.create(nn.start2,data);
                    }
                    break;
                }
                case 2:
                {
                   System.out.println("1 or 2");
                   data=myobj.nextInt();
                   if (data==1)
                   {
                        s1.display(nn.start1);
                    }
                    else 
                    {
                         s1.display(nn.start2);
                     }
                    break;
                }
                case 3:
                {
                    ch=0;
                    break;
                }
                case 4:
                {
                  nn.start1=s1.merge(nn.start1,nn.start2);
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
        