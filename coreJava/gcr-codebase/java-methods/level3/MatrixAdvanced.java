public class MatrixAdvanced{
    public static void main(String[] args){

        double[][] a={{1,2},{3,4}};

        System.out.println("Transpose");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++)
                System.out.print(a[j][i]+" ");
            System.out.println();
        }

        double det=a[0][0]*a[1][1]-a[0][1]*a[1][0];
        System.out.println("Det="+det);

        System.out.println("Inverse");

        System.out.println(a[1][1]/det+" "+(-a[0][1]/det));
        System.out.println((-a[1][0]/det)+" "+a[0][0]/det);
    }
}