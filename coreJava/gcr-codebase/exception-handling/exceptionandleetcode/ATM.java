class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String m){ super(m); }
}

public class ATM{
    public static void main(String[] args){
        int bal=5000,amt=8000;

        try{
            if(amt>bal)
                throw new InsufficientBalanceException("Low Balance");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}