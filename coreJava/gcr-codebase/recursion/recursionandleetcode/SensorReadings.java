public class SensorReadings{
    static boolean check(int[] a,int i){
        if(i==a.length-1) return true;
        return a[i]<a[i+1] && check(a,i+1);
    }

    public static void main(String[] args){
        int[] a={12,15,18,22,30};
        System.out.println(check(a,0));
    }
}