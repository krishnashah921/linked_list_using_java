import java.util.*;
public class slist
{
    class Node{
        int data;
        Node next;
    }
   // public Node head=null;
    void create(Node head,int da)
    {
        Node newnode=new Node();
        newnode.data=da;
        newnode.next=null;
        if (head==null)
        {
            head=newnode;}
        else 
        {
            Node temp=head;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
        }
        
    }
    void display(Node head)
    {
        Node temp=head;
        if (head==null)
        {
            System.out.println("no data");
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
    public static void main(String args[])
    {
        slist sl=new slist();
        Scanner myobj=new Scanner(System.in);
        Node head=null;
        int ch,da,k=1;
        while(k==1)
        {
            System.out.println("1.create");
            System.out.println("2.display");
            System.out.println("3.exit");
            System.out.println("Enter your choice");
            ch=myobj.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.println("Enter the data you want to enter");
                    da=myobj.nextInt();
                    sl.create(head,da);
                    break;
                }
                case 2:
                {
                    sl.display(head);
                    break;
                }
                case 3:
                {
                   k=2;
                    break;
                }
                default:
                {
                    System.out.println("Wrong choice");
                }
            }
        }
    } }