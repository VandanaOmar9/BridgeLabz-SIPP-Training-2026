public class MatrixOperations{
    public static void main(String[] args){
        int[][] a={{1,2},{3,4}};
        int[][] b={{5,6},{7,8}};

        System.out.println("Addition");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++)
                System.out.print(a[i][j]+b[i][j]+" ");
            System.out.println();
        }

        System.out.println("Subtraction");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++)
                System.out.print((a[i][j]-b[i][j])+" ");
            System.out.println();
        }

        System.out.println("Multiplication");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++)
                System.out.print((a[i][0]*b[0][j]+a[i][1]*b[1][j])+" ");
            System.out.println();
        }
    }
}