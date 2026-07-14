import java.io.*;
public class pritwriterdemo {
    public static void main(String args[])
    {
        PrintWriter pw = new PrintWriter(System.out,true);
        pw.println("THis is a test line");
        int i=10;
        pw.println(i);
    }
}
