public class AddDigits{
    public static void main(String[] args){
        int n=38;

        while(n>9){
            int s=0;
            while(n>0){
                s+=n%10;
                n/=10;
            }
            n=s;
        }

        System.out.println(n);
    }
}