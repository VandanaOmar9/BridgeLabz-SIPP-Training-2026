public class PowerOfFour{
    public static void main(String[] args){
        int n=64;

        while(n>1&&n%4==0) n/=4;

        System.out.println(n==1);
    }
}