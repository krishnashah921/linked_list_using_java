import java.util.*;
class singlelinkedlist
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
        if (start==null)
        {
            System.out.println("no data");
        }
        else
        {
            Node temp=start;
            while (temp!=null)
            {
            System.out.println(temp.data);
            temp=temp.next;
            }
        }
    }
    Node delete(Node start,int m,int n)
    {
        Node prev,current,temp;
        current=start;
        prev=null;
        int skp=0,del=0;
        while (current!=null)
        {
            temp=current;
            while (skp<m && current!=null)
            {
                skp=skp+1;
                current=current.next;
                
            }
            temp=current;
            while(del<n && current!=null)
            {
                del=del+1;
                temp=temp.next;
            }
            current.next=temp.next;
            current=current.next;
            skp=0;
            del=0;
        }
        return start;
    }
}
class deletennodes
{
    public static void main(String args[])
    {
        singlelinkedlist sl=new singlelinkedlist();
        singlelinkedlist.Node nn=sl.new Node();
        Scanner myobj=new Scanner(System.in);
        //nn.start=null;
        int m,n;
        int ch=1,data,choice;
        while (ch==1)
        {
            System.out.println("1.Create\n2.Display\n3.Exit\n4.delete n nodes after m nodesEnter your choice");
            choice=myobj.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter any data");
                    data=myobj.nextInt();
                    nn.start=sl.create(nn.start,data);
                    break;
                }
                case 2:
                {
                    sl.display(nn.start);
                    break;
                }
                case 3:
                {
                    ch=0;
                }
                case 4:
                {
                    System.out.println("How many nodes you want to skip");
                    m=myobj.nextInt();
                    System.out.println("How many nodes you want to delete");
                    n=myobj.nextInt();
                    nn.start=sl.delete(nn.start,m,n);
                    break;
                }
                default:
                {
                    System.out.println("Wrong choice\n");
                }
            }
        }
    }
}
