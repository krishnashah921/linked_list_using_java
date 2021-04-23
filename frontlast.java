import java.util.*;
class element
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
    Node frontlas(Node start)
    {
        Node first,last,temp,prev=null;
        first=last=start;
        while (last.next!=null)
        {
            prev=last;
            last=last.next;
        }
        prev.next=first;
        last.next=first.next;;
        start=last;
        //temp=first.next;
        first.next=null;
        
        return start;
    }
}
class frontlast
{
    public static void main(String args[])
    {
        element s1=new element();
        element.Node nn=s1.new Node();
        int ch=1,choice,data,data2;
        Scanner myobj=new Scanner(System.in);
        while(ch==1 )
        {
            System.out.println("1.Create\n2.Display\n3.Exit\n4.Move first to last and last to front\nEnter your choice");
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
                    nn.start=s1.frontlas(nn.start);
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
        