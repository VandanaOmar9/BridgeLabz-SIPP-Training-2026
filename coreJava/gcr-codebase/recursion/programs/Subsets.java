public class Subsets{
    static void sub(String s,String ans){
        if(s.isEmpty()){
            System.out.println("["+ans+"]");
            return;
        }

        sub(s.substring(1),ans);
        sub(s.substring(1),
            ans+(ans.isEmpty()?"":",")+s.charAt(0));
    }

    public static void main(String[] args){
        sub("12","");
    }
}