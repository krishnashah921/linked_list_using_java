interface FIRST
{
    public void first();
}
interface SECOND
{
    public void second();
}
class combine implements FIRST
{
    public void first()
    {
        System.out.println("this is mine first part of the interface");
    }
    
}
class combines implements SECOND
{
    public void second()
    {
        System.out.println("this is second part of the interface");
    }
}
class multitest{
    public static void main(String args[])
    {
        combine cc=new combine();
        combines c=new combines();
        cc.first();
        c.second();
    }
}
    