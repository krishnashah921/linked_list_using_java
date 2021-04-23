class mythreadrunnable implements Runnable
{
    public void run()
    {
        int i=0;
        while(i<100){
        System.out.println("This is first runnable thread");
        i++;
        }
    }
}
class mythreadrunnable2 implements Runnable
{
    public void run()
    {int i=0;
        while (i<100){
        System.out.println("This is second runnable thread");
        i=i+1;
    }
    }
}
class threadrunnable
{
    public static void main(String args[])
    {
        mythreadrunnable insidebrac1=new mythreadrunnable();
        mythreadrunnable2 insidebrac2=new mythreadrunnable2();
        Thread t1=new Thread(insidebrac1);
        Thread t2=new Thread(insidebrac2);
        t1.start();
        t2.start();
    }
}