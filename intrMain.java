interface Animal
{
    public void animalsound();
    public void animalsleep();
}
class pig implements Animal
{
    public void animalsound()
    {
        System.out.println("wee-wee");
    }
     public void animalsleep()
    {
        System.out.println("zee-zee");
    }
    public void krishna()
    {
        System.out.println("krishna");
    }
}   
class intrMain
{
    public static void main(String args[])
    {
        pig pg=new pig();
        pg.animalsound();
       // pg.animalsleep();
        pg.krishna();
    }
}
