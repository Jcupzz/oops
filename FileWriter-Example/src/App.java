import java.util.*;
import java.io.*;
public class App 
{
    public static void main(String args[])throws IOException
    {   String s;
        int ch;
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the text to be enterred:");
        s=obj.nextLine();
        FileWriter f=new FileWriter("file.txt"); 
            f.write(s); 
        System.out.println("Writing sucessful");  
        f.close();
        System.out.println("Contents are");
        FileReader fr = new FileReader("file.txt");
        while ((ch=fr.read())!=-1) 
        {
            System.out.print((char)ch);
        }   
        fr.close();
        System.out.println("\nReading sucessful");
        
    }
}

