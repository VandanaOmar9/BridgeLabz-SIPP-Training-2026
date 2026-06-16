import java.util.*;
public class BMI{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<10;i++){
            double w=sc.nextDouble();
            double h=sc.nextDouble()/100;

            double bmi=w/(h*h);

            String s=bmi<18.5?"Under":
                     bmi<25?"Normal":
                     bmi<30?"Over":"Obese";

            System.out.println(bmi+" "+s);
        }

        sc.close();
    }
}