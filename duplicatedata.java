import java.util.*;
class duplicatedata
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
    Node delete(Node start,int data)
    {
        Node prev,current=start;
        prev=null;
        while (current!=null && current.data!=data)
        {
            prev=current;
            current=current.next;
        }
        prev.next=current.next;
        return start;
    }
}
class remove
{
    public static void main(String args[])
    {
        duplicatedata s1=new duplicatedata();
        duplicatedata.Node nn=s1.new Node();
        int ch=1,choice,data,data2;
        Scanner myobj=new Scanner(System.in);
        while(ch==1 )
        {
            System.out.println("1.Create\n2.Display\n3.Exit\n4.Delete\nEnter your choice");
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
                     System.out.println("enter your data");
                    data=myobj.nextInt();
                    nn.start=s1.delete(nn.start,data);
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
        