class GameCharacter {
    String name;
    GameCharacter(String name) { this.name = name; }
    void performAttack() { System.out.println(name + " performs a basic attack."); }
}

class Warrior extends GameCharacter {
    Warrior(String name) { super(name); }
    void performAttack() { System.out.println(name + " slashes with a heavy sword!"); }
}

class Mage extends GameCharacter {
    Mage(String name) { super(name); }
    void performAttack() { System.out.println(name + " casts a fiery meteor spell!"); }
}

class Archer extends GameCharacter {
    Archer(String name) { super(name); }
    void performAttack() { System.out.println(name + " shoots a piercing arrow!"); }
}

public class AdventureGame {
    static void startBattle(GameCharacter[] characters) {
        int w = 0, m = 0, a = 0;
        for (GameCharacter c : characters) {
            c.performAttack();
            if (c instanceof Warrior) w++;
            else if (c instanceof Mage) m++;
            else if (c instanceof Archer) a++;
        }
        System.out.println("\nParticipants -> Warriors: " + w + ", Mages: " + m + ", Archers: " + a);
    }

    public static void main(String[] args) {
        GameCharacter[] team = {
            new Warrior("Thorin"),
            new Mage("Gandalf"),
            new Archer("Legolas"),
            new Mage("Merlin")
        };
        startBattle(team);
    }
}