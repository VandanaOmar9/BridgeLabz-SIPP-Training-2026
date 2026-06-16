public class UsernameValidator{
    static boolean valid(String s,int i){
        if(i==s.length()) return true;
        return Character.isLowerCase(s.charAt(i))
                && valid(s,i+1);
    }

    public static void main(String[] args){
        System.out.println(valid("abcdxyz",0));
    }
}