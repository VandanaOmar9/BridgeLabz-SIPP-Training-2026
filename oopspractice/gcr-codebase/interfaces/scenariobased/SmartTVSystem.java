interface StreamingService {
    void streamMovie(String title);
    
    default void showSubscriptionDetails() {
        System.out.println("Streaming Service: Active Premium Plan.");
    }
}

interface GamingService {
    void playGame(String name);
    
    default void showSubscriptionDetails() {
        System.out.println("Gaming Service: Active Ultimate Pass.");
    }
}

class SmartTV implements StreamingService, GamingService {
    private String[] movies = {"Inception", "Interstellar", "The Matrix"};
    private String[] games = {"Cyberpunk 2077", "Elden Ring", "FIFA 26"};

    @Override
    public void streamMovie(String title) {
        System.out.println("Streaming movie: " + title);
    }

    @Override
    public void playGame(String name) {
        System.out.println("Launching game: " + name);
    }

    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }

    public void displayContent() {
        System.out.println("--- Available Movies ---");
        for (String movie : movies) {
            streamMovie(movie);
        }
        System.out.println("\n--- Available Games ---");
        for (String game : games) {
            playGame(game);
        }
    }
}

public class SmartTVSystem {
    public static void main(String[] args) {
        SmartTV myTV = new SmartTV();
        
        System.out.println("--- Subscription Status ---");
        myTV.showSubscriptionDetails();
        System.out.println();
        
        myTV.displayContent();
    }
}