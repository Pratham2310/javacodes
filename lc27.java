// public class lc27 {
//     public static void main(String args[])
//     {
//         int arr1[]={3,2,2,3};
//         int val=3;
//         int i=0,j=0;
//         while(i<arr1.length)
//         {
//             j=i;
//             if(arr1[i]==val)
//             {
//                 while(j<arr1.length-1)
//                 {
//                     arr1[j]=arr1[j+1];
//                     j++;
//                 }
//             }
//             i++;
//         }
//         for(int k=0;k<arr1.length;k++)
//         {
//             System.out.print(arr1[k]+",");valid ones)
       
//         }
//     }
// }
public class lc27 {
    public static void main(String args[]) {
        int arr1[] = {3, 2, 2, 3};
        int val = 3;
        int k = 0; // Points to the position to overwrite

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != val) {
                arr1[k] = arr1[i];
                k++;
            }
        }
         for (int i = 0; i < k; i++) {
        // Print only the first k elements (
            System.out.print(arr1[i] + ",");
        }

        System.out.println("\nNew length: " + k);
    }

    //need to understand this code
}
