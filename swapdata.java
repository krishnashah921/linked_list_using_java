import java.util.*;
class swaps
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
    Node swap(Node start , int data1,int data2)
    {
        Node ptr,prev;
        ptr=start;
        prev=null;
        while (ptr!=null &&ptr.data!=data1)
        {
            prev=ptr;
            ptr=ptr.next;
        }
        Node prevx,ptrx;
        prevx=prev;
        ptrx=ptr;
        ptr=start;
        prev=null;
        
        while (ptr!=null && ptr.data!=data2)
        {
            prev=ptr;
            ptr=ptr.next;
        }
        Node prevy=prev,ptry=ptr,temp;
        temp=ptry.next;
        ptry.next=ptrx.next;
        ptrx.next=temp;
        if (prevx==null)
        {
            //ptry=start;
            start=ptry;
            prevy.next=ptrx;
        }
        if (prevy==null)
        {
            //ptrx=start;
            start=ptrx;
            prevx.next=ptry;
        }
        
        if (prevx !=null && prevy!=null)
        {
            prevx.next=ptry;
            prevy.next=ptrx;
            
        }
        System.out.println("you are inside func");
        return start;
    }
}
class swapdata
{
    public static void main(String args[])
    {
        swaps s1=new swaps();
        swaps.Node nn=s1.new Node();
        int ch=1,choice,data,data2;
        Scanner myobj=new Scanner(System.in);
        while(ch==1 )
        {
            System.out.println("1.Create\n2.Display\n3.Exit\n4.Swap\nEnter your choice");
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
                    System.out.println("Enter your data to be swapped");
                    data=myobj.nextInt();
                    System.out.println("Enter your data to be swapped");
                    data2=myobj.nextInt();
                    nn.start=s1.swap(nn.start,data,data2);
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
        