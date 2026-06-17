public class Library{

    static String b[]={"Java","Python",null,"C++"};

    static int getBookLength(int i){
        try{
            return b[i].length();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
        catch(NullPointerException e){
            System.out.println("Null Book");
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(getBookLength(5));
    }
}