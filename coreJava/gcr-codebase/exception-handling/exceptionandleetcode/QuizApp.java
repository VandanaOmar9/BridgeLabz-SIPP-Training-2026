public class QuizApp{
    public static void main(String[] args){

        String a[]={"A","B","C","D"};

        for(int i=0;i<=5;i++){
            try{
                System.out.println(a[i].equals("A"));
            }
            catch(Exception e){
                System.out.println("Error");
            }
        }
    }
}