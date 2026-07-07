class Subscription {
    String subscriberName, subscriptionId;
    Subscription(String name, String id) {
        this.subscriberName = name;
        this.subscriptionId = id;
    }
    double calculateMonthlyCharge() { return 0.0; }
}

class BasicPlan extends Subscription {
    BasicPlan(String name, String id) { super(name, id); }
    double calculateMonthlyCharge() { return 9.99; }
}

class PremiumPlan extends Subscription {
    PremiumPlan(String name, String id) { super(name, id); }
    double calculateMonthlyCharge() { return 14.99; }
}

class FamilyPlan extends Subscription {
    FamilyPlan(String name, String id) { super(name, id); }
    double calculateMonthlyCharge() { return 19.99; }
}

public class SubscriptionAnalyzer {

    static void searchById(Subscription[] subs, String id) {
        for (Subscription s : subs) {
            if (s.subscriptionId.equalsIgnoreCase(id)) {
                System.out.println("Found: " + s.subscriberName + " | Charge: $" + s.calculateMonthlyCharge());
                return;
            }
        }
        System.out.println("Subscription ID " + id + " not found.");
    }

    static void displayByLetter(Subscription[] subs, char letter) {
        char upper = Character.toUpperCase(letter);
        System.out.println("Subscribers starting with '" + upper + "':");
        for (Subscription s : subs) {
            if (s.subscriberName.toUpperCase().startsWith(String.valueOf(upper))) {
                System.out.println("- " + s.subscriberName + " (" + s.subscriptionId + ")");
            }
        }
    }

    static double calculateTotalRevenue(Subscription[] subs) {
        double total = 0;
        for (Subscription s : subs) total += s.calculateMonthlyCharge();
        return total;
    }

    static void displayMostExpensive(Subscription[] subs) {
        if (subs.length == 0) return;
        Subscription max = subs[0];
        for (Subscription s : subs) {
            if (s.calculateMonthlyCharge() > max.calculateMonthlyCharge()) max = s;
        }
        System.out.println("Most Expensive: " + max.subscriberName + " ($" + max.calculateMonthlyCharge() + ")");
    }

    public static void main(String[] args) {
        Subscription[] subs = {
            new BasicPlan("Alice", "SUB101"),
            new PremiumPlan("Bob", "SUB202"),
            new FamilyPlan("Charlie", "SUB303"),
            new BasicPlan("Anna", "SUB102")
        };

        System.out.println("Total Revenue: $" + calculateTotalRevenue(subs));
        displayMostExpensive(subs);
        System.out.println();
        
        searchById(subs, "SUB202");
        System.out.println();
        
        displayByLetter(subs, 'a');
    }
}