class mythread1 extends Thread
{
    @Override
    public void run()
    {
        while (true)
        {
            System.out.println("first thread");
            System.out.println("Kumar Shah");
        }
    }
}
class mythread2 extends Thread
{
    @Override
    public void run()
    {
        while (true)
        {
            System.out.println("Second thread");
            System.out.println("Krishna Shah");
        }
    }
}
class firstthread
{
    public static void main(String args[])
    {
        mythread1 t1=new mythread1();
        mythread2 t2=new mythread2();
        t1.start();
    }
}
        