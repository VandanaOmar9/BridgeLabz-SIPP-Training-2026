public class Power{
    static int pow(int x,int n){
        return n==0?1:x*pow(x,n-1);
    }

    public static void main(String[] args){
        System.out.println(pow(2,5));
    }
}