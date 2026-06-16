public class Permutations{
    static void perm(String s,String ans){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<s.length();i++)
            perm(
                s.substring(0,i)+s.substring(i+1),
                ans+s.charAt(i)
            );
    }

    public static void main(String[] args){
        perm("ABC","");
    }
}