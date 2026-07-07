interface TextModeration {
    boolean checkOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("Text Policy: Community guidelines forbid hate speech and abuse.");
    }

    static boolean containsRestrictedWords(String post) {
        String[] restrictedWords = {"badword", "offensive", "toxic"};
        for (String word : restrictedWords) {
            if (post.toLowerCase().contains(word)) {
                return true;
            }
        }
        return false;
    }
}

interface SpamDetection {
    boolean checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Spam Policy: Repeated patterns, links, and commercial phishing are banned.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {
    
    @Override
    public boolean checkOffensive(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    @Override
    public boolean checkSpam(String post) {
        return post.toLowerCase().contains("buy now") || post.toLowerCase().contains("free money");
    }

    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }

    public void processPosts(String[] posts) {
        for (String post : posts) {
            System.out.println("Post: \"" + post + "\"");
            boolean isOffensive = checkOffensive(post);
            boolean isSpam = checkSpam(post);

            if (isOffensive && isSpam) {
                System.out.println("Status: REJECTED (Both Offensive and Spam)");
            } else if (isOffensive) {
                System.out.println("Status: REJECTED (Offensive Content)");
            } else if (isSpam) {
                System.out.println("Status: REJECTED (Spam Detected)");
            } else {
                System.out.println("Status: APPROVED (Valid Post)");
            }
            System.out.println();
        }
    }
}

public class ContentModerationSystem {
    public static void main(String[] args) {
        String[] posts = {
            "Hello everyone, have a great day!",
            "Click here to get FREE MONEY instantly!!!",
            "This is a toxic and badword comment.",
            "BUY NOW! Also, you are a toxic person."
        };

        ContentModerator moderator = new ContentModerator();

        System.out.println("--- Platform Moderation Policies ---");
        moderator.displayModerationPolicy();
        System.out.println("\n--- Processing Social Media Posts ---");
        
        moderator.processPosts(posts);
    }
}