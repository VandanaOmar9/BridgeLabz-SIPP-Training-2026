public class EmployeeBonus{
    public static void main(String[] args){
        double oldSum=0,newSum=0,bonusSum=0;

        for(int i=1;i<=10;i++){
            double sal=(int)(Math.random()*90000)+10000;
            int yrs=(int)(Math.random()*10)+1;

            double bonus=sal*(yrs>5?0.05:0.02);
            double newsal=sal+bonus;

            oldSum+=sal;
            newSum+=newsal;
            bonusSum+=bonus;

            System.out.println(i+" "+sal+" "+yrs+" "+bonus+" "+newsal);
        }

        System.out.println("Old Salary="+oldSum);
        System.out.println("New Salary="+newSum);
        System.out.println("Bonus="+bonusSum);
    }
}