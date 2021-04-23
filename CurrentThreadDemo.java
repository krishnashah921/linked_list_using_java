class CurrentThreadDemo
{
    public static void main(String args[])
    {
        Thread t=Thread.currentThread();
        //System.out.println("Current thread:"+t);
        //System.out.println("After name change of thread:"+t);
        try
        {
            for (int n=3;n>0;n--)
            {
                System.out.println(n);
              Thread.sleep(1500);
            }}
            catch (InterruptedException e)
            {
                System.out.println("Main thread interrupted:");
            }
            System.out.println("GoodNight");
    
}
}
 