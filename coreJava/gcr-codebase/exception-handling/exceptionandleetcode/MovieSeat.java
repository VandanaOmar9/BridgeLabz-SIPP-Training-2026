public class MovieSeat{

    static int seats[]={101,102,103,104,105};

    static int getSeat(int i){
        try{ return seats[i]; }
        catch(Exception e){
            System.out.println("Invalid Seat");
            return -1;
        }
    }

    public static void main(String[] args){
        System.out.println(getSeat(8));
    }
}