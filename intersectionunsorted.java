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
     int count(Node start)
    {
        Node temp=start;
        int cnt=0;
        if (start==null)
        {
            System.out.println("Zero node");
        }
        else 
        {
            while (temp!=null)
            {
                cnt=cnt+1;
                temp=temp.next;
            }
           
        }
         return (cnt);
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
Node intersection(Node start1,Node start2,Node start3)
{
    Node t1=start1,t2=start2,temp=start2;
   int l1,l2,fin,i=0;
   l1=count(start1);
   l2=count(start2);
   if (l1>l2)
   {
       fin=l1-l2;
       while (i<fin && t1!=null)
       {
           i++;
           t1=t1.next;
           
        }
   }
   else if (l2>l1)
   {
       fin=l2-l1;
       i=0;
       while (i<fin && t2!=null)
       {
           i++;
           t2=t2.next;
           //System.out.println(t2.data);
        }
    }
    
   
    return start3;
}
}
class intersectionunsorted
{
    public static void main(String args[])
    {
        singlelinkedlists s1=new singlelinkedlists();
        singlelinkedlists.Node nn=s1.new Node();
        Scanner myobj=new Scanner(System.in);
        int ch=1,choice,data;
        while(ch==1 )
        {
            System.out.println("1.Create\n2.Display\n3.Exit\n4.Intersection of  the two unsorted list\nEnter your choice");
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
                  nn.start3=s1.intersection(nn.start1,nn.start2,nn.start3);
                   s1.display(nn.start3);
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
        