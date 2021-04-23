interface FIRST
{
    public void first();
}
interface SECOND
{
    public void second();
}
class combine implements FIRST,SECOND
{
    public void first()
    {
        System.out.println("this is mine first part of the interface");
    }
    public void second()
    {
        System.out.println("this is second part of the interface");
    }
}
class multimain
{
    public static void main(String args[])
    {
        combine cc=new combine();
        cc.first();
        cc.second();
    }
}
    