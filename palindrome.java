import java.util.*;
class sslist
{
    class Node
    {
        int data;
        Node next;
        
        Node start=null;
    }
    Node reverse(Node start)
    {
        Node net=null,current,prev;
        current=start;
        prev=null;
        while (current!=null)
        {
            net=current.next;
            current.next=prev;
            prev=current;
            current=net;
        }
        start=prev;
        return start;
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
    void palindrome(Node start)
    {
        Node head,slow,fast;
        slow=start;
        fast=start;
        head=null;
        int ch=1,i=1;
        System.out.println("out of loop:"+slow.data);
        while (ch==1 )
        {
            
            fast=fast.next.next;
            if (fast.next==null)//odd condition
            {
                //head=start;
                head=slow.next.next;                
                //ch=0;
                break;
            }
            if (fast!= null)
            {
                head=slow.next;
                //ch=0;
                break;
            }
            slow=slow.next;
           System.out.println(i);
           i=i+1;
        }
       
        slow.next=null;
        //two linked list is prepared from single start..
        //start & head
        //start=reverse(start);
        Node temp=start,hh=head;
        int check=0;
        //System.out.println("start value:"+start.data);
        //System.out.println("head value"+hh.data);
        //System.out.println("head second value"+head.next.data);
        while (temp!=null && hh!=null)
        {
            if (temp.data!=hh.data)
            {
                check=1;
            }
            temp=temp.next;
            hh=hh.next;
        }
        if (check==1)
        {
            System.out.println("Not palindrome");
        }
        else 
        {
            System.out.println("palindrome");
        }
    }
}
class palindrome
{
    public static void main(String args[])
    {
        sslist s1=new sslist();
        sslist.Node nn=s1.new Node();
        Scanner myobj=new Scanner(System.in);
        int ch=1,choice,data;
        while(ch==1 )
        {
            System.out.println("1.Create\n2.Display\n3.Exit\n4.Palindrom\nEnter your choice");
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
                    s1.palindrome(nn.start);
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
        