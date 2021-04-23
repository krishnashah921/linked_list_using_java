import java.io.File;
import java.io.IOException;
public class create
{
    public static void main(String args[])
    {
        try
        {
            File myobj=new File("file1.txt");
            if (myobj.createNewFile())
            {
                System.out.println("file created: "+myobj.getName());
            }
            else
            {
                System.out.printf("file exist");
            }
            
        }
        catch (IOException e)
        {
            System.out.println("an error occured ");
            e.printStackTrace();
        }
    }
}