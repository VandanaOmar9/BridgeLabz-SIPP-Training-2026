public class OTP{
    public static void main(String[] args){
        int[] a=new int[10];

        for(int i=0;i<10;i++){
            a[i]=(int)(Math.random()*900000)+100000;
            System.out.println(a[i]);
        }
        
    }
}