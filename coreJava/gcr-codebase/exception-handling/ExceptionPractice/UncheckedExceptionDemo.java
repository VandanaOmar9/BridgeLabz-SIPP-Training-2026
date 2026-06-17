import java.util.*;

public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println(sc.nextInt()/sc.nextInt());
        }catch(ArithmeticException e){
            System.out.println("Divide by zero");
        }catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
        sc.close();
    }
}