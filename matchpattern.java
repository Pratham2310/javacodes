import java.util.Scanner;
class reverseString{
    void reverseSt(String s,String patt)
    {
        boolean found= false;
        
        for(int i=0;i<=s.length()-patt.length();i++)
        {
            int j=i;
            String sd="";
            while(j<i+patt.length())
            {
                sd+=s.charAt(j);
                j++;
            }
            if(sd.equals(patt))
            {
                found=true;
                break;
            }
            
        }
        if(found)
        {
            System.out.println("pattern found in string");
        }
        else
        {
            System.out.println("pattern not found in string");
        }
    }   
}
public class matchpattern {
    public static void main(String args[])
    {
        reverseString s11=new reverseString();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s1=sc.nextLine();
        System.out.println("enter a pattern to find in the string");
        String pat=sc.nextLine();
        s11.reverseSt(s1, pat);
    }
}
