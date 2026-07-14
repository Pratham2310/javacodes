/*
import java.util.Scanner;
public class hr1 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<3;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}*/
public class hr1
{
    public static void main(String args[])
    {
        String strs[]={"flower","flow","flat"};
        if(strs.length==0)
            return;
        
        String pre="";
        for(int i=0;i<strs[0].length();i++)
        {
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++)
            {
                if(i>=strs[j].length()||strs[j].charAt(i)!=ch)
                {
                    System.out.println(pre);
                   return;
                }
            }
            pre+=ch;
        }
        System.out.println("common prefix is:"+pre);
    }
}
