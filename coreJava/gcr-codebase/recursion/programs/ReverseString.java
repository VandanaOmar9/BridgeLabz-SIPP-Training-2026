public class ReverseString{
    static void rev(String s){
        if(s.length()==0) return;
        System.out.print(s.charAt(s.length()-1));
        rev(s.substring(0,s.length()-1));
    }

    public static void main(String[] args){
        rev("hello");
    }
}