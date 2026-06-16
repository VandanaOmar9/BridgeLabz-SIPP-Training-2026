import java.util.*;

public class NumberFormatDemo {
    public static void main(String[] args){
        try{
            System.out.println(Integer.parseInt(new Scanner(System.in).next()));
        }catch(NumberFormatException e){
            System.out.println("Handled");
        }
    }
}