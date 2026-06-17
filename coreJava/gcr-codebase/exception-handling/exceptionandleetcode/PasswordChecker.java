public class PasswordChecker{

    static void checkPassword(String p){

        try{
            if(p==null) throw new NullPointerException();

            if(p.length()<8)
                System.out.println("Short Password");
            else if(!Character.isUpperCase(p.charAt(0)))
                System.out.println("First Letter Capital");
            else if(!Character.isDigit(p.charAt(p.length()-1)))
                System.out.println("Last Must Be Digit");
            else if(!p.matches(".*[@#$%&*].*"))
                System.out.println("Special Char Missing");
            else
                System.out.println("Strong Password");

        }catch(Exception e){
            System.out.println("Invalid Password");
        }
    }

    public static void main(String[] args){
        checkPassword("Java@123");
    }
}