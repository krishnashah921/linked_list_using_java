import java.util.*;
class slistreverse
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
    Node reverse(Node start,int size)
    {
        Node net=null,current,prev;
        current=start;
        prev=null;
        int count=0;
        while (current!=null && count<size)
        {
            net=current.next;//first fourth line is for reverse condition..
            current.next=prev;
            prev=current;
            current=net;
            count=count+1;
        }
        count=0;
        if (start!=null)
        {
            start.next=current;
        }
        while (count<size-1 && current!=null)
        { 
            count=count+1;
            current=current.next;
          
        }
        if (current!=null)
        {
            current.next=reverse(current.next,size);
        }
        return prev;
    }
}
class reversealternateknode

{
    public static void main(String args[])
    {
        slistreverse s1=new slistreverse();
        slistreverse.Node nn=s1.new Node();
        Scanner myobj=new Scanner(System.in);
        int ch=1,choice,data;
        while(ch==1 )
        {
            System.out.println("1.Create\n2.Display\n3.Exit\n4.Reverse alternate group of k node\nEnter your choice");
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
                    System.out.println("Enter the group size");
                    data=myobj.nextInt();
                    nn.start=s1.reverse(nn.start,data);
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
        
    