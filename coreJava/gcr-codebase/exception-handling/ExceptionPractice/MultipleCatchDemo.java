public class MultipleCatchDemo {
    public static void main(String[] args) {
        Integer arr[]=null;

        try{
            System.out.println(arr[2]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index!");
        }catch(NullPointerException e){
            System.out.println("Array is not initialized!");
        }
    }
}