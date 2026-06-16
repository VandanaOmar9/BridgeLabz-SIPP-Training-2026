public class EmployeeSkill{
    static void team(int[] a,int i,int sum,int t,String s){
        if(sum==t){
            System.out.println("["+s+"]");
            return;
        }
        if(i==a.length||sum>t) return;

        team(a,i+1,sum+a[i],t,
             s+(s.isEmpty()?"":",")+a[i]);

        team(a,i+1,sum,t,s);
    }

    public static void main(String[] args){
        int[] a={2,3,5,7};
        team(a,0,0,10,"");
    }
}