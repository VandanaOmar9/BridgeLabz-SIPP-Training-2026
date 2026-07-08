import java.util.LinkedList;

public class MusicPlaylistEngine {
    private LinkedList<String> history = new LinkedList<>();

    // 1, 2 & 3. Add song to the top and maintain a max size of 10
    public void playSong(String song) {
        // If song is already in the list, remove it to bring it back to the top
        history.remove(song); 
        
        history.addFirst(song);
        if (history.size() > 10) {
            history.removeLast();
        }
        System.out.println("Playing: " + song);
    }

    // 4. Search for a song
    public void searchSong(String song) {
        if (history.contains(song)) {
            System.out.println("Result: '" + song + "' is in your recent history.");
        } else {
            System.out.println("Result: '" + song + "' is not in your recent history.");
        }
    }

    // 5. Display the complete list
    public void displayHistory() {
        System.out.println("\n--- Recently Played (Top 10) ---");
        for (int i = 0; i < history.size(); i++) {
            System.out.println((i + 1) + ". " + history.get(i));
        }
        System.out.println("Total tracks stored: " + history.size());
    }

    public static void main(String[] args) {
        MusicPlaylistEngine engine = new MusicPlaylistEngine();

        // Simulating playing 11 unique songs
        for (int i = 1; i <= 11; i++) {
            engine.playSong("Song " + i);
        }

        engine.displayHistory(); // "Song 1" (the oldest) should be automatically removed

        System.out.println();
        engine.searchSong("Song 11"); // Should be found
        engine.searchSong("Song 1");  // Should not be found (evicted)
    }
}