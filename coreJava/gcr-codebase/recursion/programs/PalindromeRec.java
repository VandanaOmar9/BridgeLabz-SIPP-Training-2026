public class PalindromeRec{
    static boolean check(String s,int l,int r){
        if(l>=r) return true;
        return s.charAt(l)==s.charAt(r)
                && check(s,l+1,r-1);
    }

    public static void main(String[] args){
        System.out.println(
            check("madam",0,4)?
            "Palindrome":"Not Palindrome"
        );
    }
}