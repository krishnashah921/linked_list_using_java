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
        Node temp=start;
        if (start==null)
        {
            System.out.println("empty");
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
    Node insertatbeg(Node start,int data)
    {
        Node newnode=new Node();
        newnode.data=data;
        Node temp=start;
        newnode.next=temp;
        start=newnode;
        return start;
    }
    Node insertatend(Node start,int data)
    {
        Node newnode=new Node();
        Node temp=start;
        newnode.data=data;
        newnode.next=null;
        while (temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
        return start;
    }
    Node deleteatbegin(Node start)
    {
        Node temp=start;
        temp=start.next;
        start=temp;
        
        return start;
    }
    Node deleteatend(Node start)
    {
        Node temp=start,prev=start;
        while (temp.next!=null)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        return start;
    }
    Node deleteatanypos(Node start,int pos)
    {
        Node temp=start,prev=start;
        int i=1;//assuming index start from 1
        while (temp!=null && i<pos)
        {
            prev=temp;
            temp=temp.next;
            i=i+1;
        }
        prev.next=temp.next;
        return start;
        
    }
    Node insertatanypos(Node start,int pos,int data)
    {
        Node newnode=new Node();
        newnode.data=data;
        Node temp=start;
        int i=1;
        while(temp!=null && i+1<pos)
        {
            temp=temp.next;
            i=i+1;
        }
        
        newnode.next=temp.next;
        temp.next=newnode;
        return start;
        
    }
}
        
class MainList
{
    public static void main(String args[])
    {
        singlelinkedlist sl=new singlelinkedlist();
        singlelinkedlist.Node nn=sl.new Node();
        Scanner myobj=new Scanner(System.in);
        int data,ch,choice,pos;
        ch=1;
        while (ch==1)
        {
            System.out.println("Enter your choice\n1.create\n2.Display\n3.exit\n4.Insertion at beginning\n5.Insertion at end\n6.Deletion at begin");
            System.out.println("7.Deletion at end\n8.Delete at any pos\n9.Insert at any pos");
            choice=myobj.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("enter your data");
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
                    break;
                }
                case 4:
                {
                    System.out.println("enter the data");
                    data=myobj.nextInt();
                    nn.start=sl.insertatbeg(nn.start,data);
                    break;
                }
                case 5:
                {
                    System.out.println("enter any data");
                    data=myobj.nextInt();
                    nn.start=sl.insertatend(nn.start,data);
                    break;
                }
                case 6:
                {
                    nn.start=sl.deleteatbegin(nn.start);
                    break;
                }
                case 7:
                {
                    nn.start=sl.deleteatend(nn.start);
                    break;
                }
                case 8:
                {
                    System.out.println("enter the position to be deleted");
                    data=myobj.nextInt();
                    nn.start=sl.deleteatanypos(nn.start,data);
                    break;
                }
                case 9:
                {
                    System.out.println("Enter your position to be insert and data respectively");
                    pos=myobj.nextInt();
                    data=myobj.nextInt();
                    nn.start=sl.insertatanypos(nn.start,pos,data);
                    break;
                }
                
                default:
                {
                    System.out.println("wrong choice");
                    break;
                }
            }
        }
    }
}