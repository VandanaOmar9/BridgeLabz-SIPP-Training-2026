class InsufficientFundsException extends Exception{
    InsufficientFundsException(String m){ super(m); }
}

public class HospitalBilling{
    public static void main(String[] args){

        try{ System.out.println(10/0); }
        catch(Exception e){ System.out.println("Division Error"); }

        try{
            int a[]={1,2};
            System.out.println(a[5]);
        }
        catch(Exception e){ System.out.println("Invalid Index"); }

        try{ Integer.parseInt("abc"); }
        catch(Exception e){ System.out.println("Bad Input"); }
    }
}