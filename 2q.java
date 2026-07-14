import java.util.*;
/*class array{
     
   1} public static void main(String []args)
    {
        int arr[];
        arr= new int[5];
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }

2} public static void main(String []args)
    {
        int arr[]={23,12,34,21};
        for(int i:arr)
        {
            if(i%3==0)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String []args){
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++)        {
            System.out.print("enter a array element");
            Scanner sc=new Scanner(System.in);
            arr[i] ṣxxxx= sc.nextInt(arr[i]);

        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }

}


//Array of reference
public class array {

    public static void main(String []args){
        int mat[][]=new int[5][];
        mat[0]=new int[5];
        mat[1]=new int[5];
        mat[2]=new int[5];
        mat[3]=new int[5];
        mat[4]=new int[5];
        for(int i=0;i< mat.length;i++)
              mat[i]=new int[5];
        for(int row[]:mat);
        {
           for(int ele: row)
            
                System.out.print(i+" ");
            System.out.println();
        }
        for(int i=0;i < mat.length ;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}

//Dynamic array mattrix
public class array {

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("how many rows and columns");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int mat[][]=new int[rows][];
        for(int i=0;i<mat.length;i++)
        {
            mat[i]=new int[cols];
        }
        System.out.println("enter "+rows*cols+"columns");
        for(int i=0;i< mat.length;i++)
        {
            for(int j=0;j< mat[i].length;j++)
                mat[i][j]=sc.nextInt();
        }
        System.out.println("matrix of size"+rows+"*"+cols);
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
}


public class array {

    public static void main(String []args)
    {
        int month_days[];
        month_days= new int[12];
        month_days[0]=31;
        month_days[1]=28;
        month_days[2]=31;
   
        month_days[3]=30;
        month_days[4]=31;
        month_days[5]=30;
        month_days[6]=31;
        month_days[7]=31;
        month_days[8]=30;
        month_days[9]=31;
        month_days[10]=30;
        month_days[11]=31;
        System.out.println("April has :"+month_days[3]+"days");
    }
}
    
    public class array {
    
        public static void main(String []args)
        {
            int twoD[][]=new int[4][5];
            int k=1;
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<5;j++)
                {
                    twoD[i][j]=k;
                    k++;
                }
            }
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<5;j++)
                {
                    System.out.print(twoD[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

    
//manually declaring second dimension size to the matrix
public class array {

    public static void main(String []args)
    {
        int twoD[][]=new int[4][];
        int k=1; 
        twoD[0]=new int[1];
         twoD[1]=new int[2];
         twoD[2]=new int[3];
         twoD[3]=new int[4];
         for(int i=0;i<3;i++)
         {
            for(int j=0;j<=i;j++)
            {
                twoD[i][j]=k;
                k++;
            }
         }
         for(int i=0;i<3;i++)
         {
            for(int j=0;j<=i;j++)
            {
                System.out.print(twoD[i][j]+" ");
            }
            System.out.println();

        }
    }
}

//Three dimensional array
public class array {

    public static void main(String []args)
    {
        int threeD[][][]=new int[3][4][5];
        int k=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(k=0;k<5;k++)
                {
                    threeD[i][j][k]=i*j*k;
                }
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(k=0;k<5;k++)
                {
                   System.out.print(threeD[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
*/