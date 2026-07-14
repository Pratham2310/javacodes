/*class pattern{
  public static void main(String []args)
{1]
  for(int i=1;i<=5;i++)
  {
     for(int j=1;j<=i;j++)
     {
         System.out.print(j+" ");
     }
     System.out.println();
  }

   2]  int n=1;
   for(int i=n;i<=5;i++)
   {
      for(int j=1;j<=i;j++)
      {
        System.out.print(n);
        n++;
      }
      System.out.println();
   }

 3]int n=4;
 for(int i=1;i<=n;i++)
 {
    for(int j=1;j<=n-i;j++)
    {
       System.out.print(" ");
    }
    for(int k=1;k<=i;k++)
    {
       System.out.print("*"+" ");
    }
    System.out.println();
 }

 3] int n=5;
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=(n-i)*2;j++)
    {
      System.out.print(" ");
    }
    for(int k=1;k<=i*2-1;k++)
    {
       System.out.print("*"+" ");
    }
    System.out.println();
  }

 int n=5;
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=(n-i)*2;j++)
    {
      System.out.print(" ");
    }
  
  for(int k=1;k<=i*2-1;k++)
    {
       System.out.print("*"+" ");
    }
    System.out.println();
  }
  for(int i=n-1;i<=1;i--)
  {
    for(int j=1;j<=(n-i)*2;j++)
    {
      System.out.print(" ");
    }
    for(int k=1;k<=i*2-1;k++)
    {
       System.out.print("*"+" ");
    }
    System.out.println();
  }

}
}


public class diamond {
    public static void main(String[] args) {
        int n = 5; // Size of the diamond

        // Top part of the diamond (increasing stars)
        for (int i = 1; i <= n; i++) {
            // Printing spaces before stars
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }

            // Printing stars with spaces between them
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("* ");
            }

            // Moving to the next line after each row
            System.out.println();
        }

        // Bottom part of the diamond (decreasing stars)
        for (int i = n - 1; i >= 1; i--) {
            // Printing spaces before stars
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }

            // Printing stars with spaces between them
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("* ");
            }

            // Moving to the next line after each row
            System.out.println();
        }
    }
}


class butterfly
{
  public static void main(String []args)
  {
    int n=5;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
         System.out.print(j+" ");
      }
      System.out.print("\b");
      for(int k=1;k<=(4*(n-i));k++)
      {
         System.out.print(" ");
      }
      System.out.print("\b");
      for(int l=i;l>=1;l--)
      {
          System.out.print(l+" ");
      }
      System.out.println();
    }
    for(int i=n-1;i>=1;i--)
    {
       for(int j=1;j<=i;j++)
       {
         System.out.print(j+" ");
       }
       for(int k=1;k<=((n-i)*4)-2;k++)
       {
          System.out.print(" ");
       }
       for(int l=i;l>=1;l--)
       {
          System.out.print(l+" ");
       }
       System.out.println();
    }
    
    


}
}
*/
/*
1               1
1 2           2 1
1 2 3       3 2 1
1 2 3 4   4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4   4 3 2 1
1 2 3       3 2 1
1 2           2 1
1               1
*/