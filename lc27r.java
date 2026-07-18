public class lc27r {
    public static void main(String args[])
    {
        int []arr1={3,2,2,3};
        int val =3;
        int k=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=val)
            {
                arr1[k]=arr1[i];
                k++;
            }
        }
        System.out.println("new length:"+k);
    }
}
