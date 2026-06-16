import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wt\tHt\tBMI\tStatus");

        for(int i=0;i<10;i++){
            double w=sc.nextDouble();
            double h=sc.nextDouble()/100;

            double bmi=Math.round((w/(h*h))*100.0)/100.0;

            String s=bmi<18.5?"Underweight":
                     bmi<25?"Normal":
                     bmi<30?"Overweight":"Obese";

            System.out.println(w+"\t"+(h*100)+"\t"+bmi+"\t"+s);
        }
        sc.close();
    }
}