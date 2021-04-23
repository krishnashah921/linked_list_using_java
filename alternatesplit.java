import java.util.*;
class slistreverse
{
    class Node
    {
        int data;
        Node next;
        Node start2=null;
        Node start3=null;
        Node start1=null;
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
    Node alternatesplit(Node start1,Node start2,Node start3)
    {
     Node odd,even;
     start2=odd=start1;
     start3=even=start1.next;
     while (even!=null && even.next!=null)
     {
         odd.next=even.next;
         odd=odd.next;
         even.next=odd.next;
         even=even.next;
     }
   
     odd.next=null;
     
     display(start2);
     display(start3);
     return start1;
    }
}
class alternatesplit
{
    public static void main(String args[])
    {
        slistreverse s1=new slistreverse();
        slistreverse.Node nn=s1.new Node();
        Scanner myobj=new Scanner(System.in);
        int ch=1,choice,data;
        while(ch==1 )
        {
            System.out.println("1.Create\n2.Display\n3.Exit\n4.Alternate split  node\nEnter your choice");
            choice=myobj.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("enter your data");
                    data=myobj.nextInt();
                    nn.start1=s1.create(nn.start1,data);
                    break;
                }
                case 2:
                {
                    s1.display(nn.start1);
                    break;
                }
                case 3:
                {
                    ch=0;
                    break;
                }
                case 4:
                {
                    nn.start1=s1.alternatesplit(nn.start1,nn.start2,nn.start3);
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
        
    