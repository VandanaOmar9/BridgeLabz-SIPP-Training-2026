class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void displayTicket() {
        System.out.println("Movie : " + movieName);
        System.out.println("Seat : " + seatNumber);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();

        ticket.bookTicket("Avengers", "A10", 350);

        ticket.displayTicket();
    }
}