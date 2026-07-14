import java.util.Scanner;
public class magic {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size of magic square");
        int n=sc.nextInt();
        int magicsq[][]=new int[n][];
        int cr,cc,pr,pc,k=1;
        for(int i=0;i<magicsq.length;i++)
            magicsq[i]=new int[n];
        magicsq[0][n/2]=k++;
        cr=0;
        cc=n/2;
        while(k<=n*n)
        {
            pr=cr;
            pc=cc;
            cc++;
            if(cc==n)
               cc=0;
            cr--;
            if(cr==-1)
               cr=n-1;
            if(magicsq[cr][cc]!=0)
            {
                cr=pr+1;
                cc=pc;
            }
            magicsq[cc][cr]=k++;
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=magicsq[i][0];
            for(int j=0;j<n;j++)
                System.out.printf("%0d",magicsq[i][j]);
            System.out.println();
        }
        System.out.println("sum of each column diagonal is"+sum);
        sc.close();
    }
}
