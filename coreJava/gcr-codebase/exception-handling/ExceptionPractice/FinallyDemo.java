import java.util.*;

public class FinallyDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try{
            System.out.println(sc.nextInt()/sc.nextInt());
        }catch(Exception e){
            System.out.println("Cannot divide by zero");
        }finally{
            System.out.println("Operation completed");
            sc.close();
        }
    }
}