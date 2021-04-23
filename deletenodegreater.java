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
    Node deletedata(Node start,int data)
    {
        Node current,prev,temp;
        current=start;
        prev=null;
      /*  if (current.data>current.next.data)
        {
            temp=start.next;
            start=temp;
            return start;
        }
        else 
        {*/
        while (current.data!=data && current!=null)
        {
            prev=current;
            current=current.next;
        }
        prev.next=current.next;
        return start;
        //}
    }
    Node deletegreater(Node start)
    {
        Node temp=start,current=start;
        current=start;
        temp=current;
        while (current.data<current.next.data)
        {
            
              current=current.next;
              temp=temp.next;
              start=temp;
             // current=start;
             temp=current;
        }
        while (current.next!=null)
        {
           
            if (current.data<current.next.data)
            {
                start=deletedata(start,current.data);
                current=current.next;
                
            }
            else 
            {
                temp=current;
                current=current.next;
                
            }
        }
        return start;
    }
}
class deletenodegreater
{
    public static void main(String args[])
    {
        slistreverse s1=new slistreverse();
        slistreverse.Node nn=s1.new Node();
        Scanner myobj=new Scanner(System.in);
        int ch=1,choice,data;
        while(ch==1 )
        {
            System.out.println("1.Create\n2.Display\n3.Exit\n4.delete node greater on right side\nEnter your choice");
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
                    
                    nn.start=s1.deletegreater(nn.start);
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
        
    