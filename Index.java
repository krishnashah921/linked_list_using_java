import java.util.*;
class singlelinkedlistsearch
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
    void search(Node start,int data)
    {
        int pos=0,k=0;
        Node temp=start;
        while (temp!=null)
        {
            pos=pos+1;
            if (data==temp.data)
            {
                k=1;
                break;
            }
            temp=temp.next;
        }
        if (k==1)
        {
            System.out.println("Your search valued is find in location: "+pos);
        }
        else 
        {
            System.out.println("Not found");
        }
    }
    void getindex(Node start,int index)
    {
        Node temp=start;
        int pos=0;
        while (pos<index && temp!=null)
        {
            pos++;
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    
    
}
class Index
{
    public static void main(String args[])
    {
        singlelinkedlistsearch s1=new singlelinkedlistsearch();
        singlelinkedlistsearch.Node nn=s1.new Node();
        Scanner myobj=new Scanner(System.in);
        int ch=1,choice,data;
        while(ch==1 )
        {
            System.out.println("1.Create\n2.Display\n3.Exit\n4.Search\n5.Display Index node\nEnter your choice");
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
                    System.out.println("Enter your data to be searched");
                    data=myobj.nextInt();
                    s1.search(nn.start,data);
                    break;
                }
                case 5:
                {
                    System.out.println("Enter the index number");
                    data=myobj.nextInt();
                    s1.getindex(nn.start,data);
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
        