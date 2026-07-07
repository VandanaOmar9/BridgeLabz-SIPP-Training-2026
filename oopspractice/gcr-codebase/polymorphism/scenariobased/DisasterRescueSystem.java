class RescueTeam {
    String id, loc;
    RescueTeam(String id, String loc) { this.id = id; this.loc = loc; }
    void performDuty() { System.out.println("Generic rescue duty."); }
}
class MedicalTeam extends RescueTeam { MedicalTeam(String i, String l) { super(i, l); } void performDuty() { System.out.println(id + " providing medical aid."); } }
class FireRescueTeam extends RescueTeam { FireRescueTeam(String i, String l) { super(i, l); } void performDuty() { System.out.println(id + " clearing debris and fires."); } }
class FoodSupplyTeam extends RescueTeam { FoodSupplyTeam(String i, String l) { super(i, l); } void performDuty() { System.out.println(id + " distributing food packs."); } }

public class DisasterRescueSystem {
    public static void main(String[] args) {
        RescueTeam[] teams = { new MedicalTeam("MED-1", "Zone-A"), new FireRescueTeam("FIRE-1", "Zone-B"), new FoodSupplyTeam("FOOD-1", "Zone-A"), new MedicalTeam("MED-2", "Zone-C") };
        int m = 0, f = 0, fd = 0;

        for (RescueTeam t : teams) {
            t.performDuty();
            if (t instanceof MedicalTeam) m++; else if (t instanceof FireRescueTeam) f++; else if (t instanceof FoodSupplyTeam) fd++;
        }

        System.out.println("\nCounts -> Medical: " + m + ", Fire: " + f + ", Food: " + fd);
        
        // Max deployments
        String maxCat = "Medical"; int max = m;
        if (f > max) { max = f; maxCat = "Fire Rescue"; }
        if (fd > max) { maxCat = "Food Supply"; }
        System.out.println("Max Deployments: " + maxCat + " Platform");

        // Search by location
        String searchLoc = "Zone-A";
        System.out.println("\nTeams in " + searchLoc + ":");
        for (RescueTeam t : teams) if (t.loc.equals(searchLoc)) System.out.println("- " + t.id);

        // Filter by prefix
        String prefix = "MED";
        System.out.println("\nTeams starting with '" + prefix + "':");
        for (RescueTeam t : teams) if (t.id.startsWith(prefix)) System.out.println("- " + t.id + " (" + t.loc + ")");
    }
}