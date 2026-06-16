public class PowerOfTwo{
    public static void main(String[] args){
        int n=16;
        System.out.println(n>0&&(n&(n-1))==0);
    }
}