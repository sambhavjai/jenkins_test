import java.io.*;
public class test{
    public static void main(String args[]) throws Exception
    {
        PrintStream o=new PrintStream(new File("output.txt"));
        System.setOut(o);
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
        }
        System.out.println("Hello World");
    }
}