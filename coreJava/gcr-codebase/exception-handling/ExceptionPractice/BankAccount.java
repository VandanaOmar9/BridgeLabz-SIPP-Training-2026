class InsufficientBalanceException extends Exception{}

public class BankAccount {

    static double bal=5000;

    static void withdraw(double amt)
            throws InsufficientBalanceException{

        if(amt<0) throw new IllegalArgumentException();
        if(amt>bal) throw new InsufficientBalanceException();

        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args){

        try{
            withdraw(6000);
        }catch(InsufficientBalanceException e){
            System.out.println("Insufficient balance!");
        }catch(IllegalArgumentException e){
            System.out.println("Invalid amount!");
        }
    }
}