import java.util.*;
class singlelinkedlists
{
    class Node
    {
        int data;
        Node next;
        
        Node start1=null;
        Node start2=null;
       Node start3=null;
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
Node addtwonum(Node start1,Node start2,Node start3)
{
    Node t1=start1,t2=start2;
    int temp=0,check=0;
    int da;
    while (t1!=null && t2!=null)
    {
            temp=(t1.data+t2.data);
            if (temp>10)
            {
                da=temp-10;
                t2.next.data=t2.next.data+1;
            }
            else 
            {
                da=temp;
            }
          start3=create(start3,da);
        t1=t1.next;
        t2=t2.next;
    }
    Node t3=start3;
    int sum=0;
    while (t3!=null)
    {
        sum=sum*10+t3.data;
        t3=t3.next;
    }
    int div,rem=0;
    while (sum>0)
    {
        div=sum%10;
        rem=rem*10+div;
        sum=sum/10;
    }
    System.out.println(rem);
    
    return start1;

}
}
class addtwonumber
{
    public static void main(String args[])
    {
        singlelinkedlists s1=new singlelinkedlists();
        singlelinkedlists.Node nn=s1.new Node();
        Scanner myobj=new Scanner(System.in);
        int ch=1,choice,data;
        while(ch==1 )
        {
            System.out.println("1.Create\n2.Display\n3.Exit\n4.Merge the two list\nEnter your choice");
            choice=myobj.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("List 1 or 2");
                    data=myobj.nextInt();
                    if (data==1)
                    {
                        System.out.println("enter your data");
                    data=myobj.nextInt();
                    nn.start1=s1.create(nn.start1,data);
                    }
                    else 
                    {
                        System.out.println("enter your data");
                    data=myobj.nextInt();
                    nn.start2=s1.create(nn.start2,data);
                    }
                    break;
                }
                case 2:
                {
                   System.out.println("1 or 2");
                   data=myobj.nextInt();
                   if (data==1)
                   {
                        s1.display(nn.start1);
                    }
                    else 
                    {
                         s1.display(nn.start2);
                     }
                    break;
                }
                case 3:
                {
                    ch=0;
                    break;
                }
                case 4:
                {
                  nn.start1=s1.addtwonum(nn.start1,nn.start2,nn.start3);
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
        