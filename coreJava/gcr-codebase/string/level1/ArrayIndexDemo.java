public class ArrayIndexDemo {
    public static void main(String[] args){
        String[] a={"A","B","C"};
        try{
            System.out.println(a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Handled");
        }
    }
}