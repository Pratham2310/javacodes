import java.util.Scanner;
class Matrix{
    int mat[][];
    int rows,cols;
    int nonzeros=0;
    public Matrix(int rows,int cols)
    {
        this.rows=rows;
        this.cols=cols;
        mat=new int[rows][];
        for(int i=0;i<rows;i++)
            mat[i]=new int[cols];
    }
    void inputMatrix(Scanner sc)
    {
        System.out.println("enter"+rows*cols+"elements");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                mat[i][j]=sc.nextInt();
                if(mat[i][j]!=0)
                    nonzeros++;
            }
        }
    }
    boolean checkmat()
    {
        if(nonzeros*3>rows*cols)
            return false;
        return true;
    }
    Matrix createSparseMatrix()
    {
        int k=0;
        Matrix SparseMatrix=new Matrix(nonzeros,3);
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(mat[i][j]!=0)
                {
                    SparseMatrix.mat[k][0]=i;
                    SparseMatrix.mat[k][1]=j;
                    SparseMatrix.mat[k][2]=mat[i][j];
                    k++;
                }
            }
        }
        return SparseMatrix;
    }
    void show()
    {
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.printf("%8d",mat[i][j]);
            }
            System.out.println();
        }
    }
}
public class PareseMatrix {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows=sc.nextInt();
        System.out.println("Enter number of columns:");
        int cols=sc.nextInt();
        Matrix origMatrix=new Matrix(rows,cols);
        origMatrix.inputMatrix(sc);
        System.out.println("Sparse matrix is feasible="+origMatrix.checkmat());
        System.out.println("original Matrix=");
        origMatrix.show();
        Matrix SparseMatrix=origMatrix.createSparseMatrix();
        System.out.println("Sparse Matrix=");
        System.out.printf("%8s%8s%8s\n","rows","Cols","Values");
        SparseMatrix.show();       
    }
}