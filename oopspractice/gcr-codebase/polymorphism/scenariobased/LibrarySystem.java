class LibraryMember {
    String name, id;
    LibraryMember(String name, String id) { this.name = name; this.id = id; }
    
    double calculateFine(int days) { return days * 1.0; }
    
    void printDetails() { System.out.println("ID: " + id + " | Name: " + name); }
}

class StudentMember extends LibraryMember {
    StudentMember(String name, String id) { super(name, id); }
    @Override
    double calculateFine(int days) { return days * 0.5; }
}

class FacultyMember extends LibraryMember {
    FacultyMember(String name, String id) { super(name, id); }
    @Override
    double calculateFine(int days) { return 0.0; }
}

class GuestMember extends LibraryMember {
    GuestMember(String name, String id) { super(name, id); }
    @Override
    double calculateFine(int days) { return days * 2.0; }
}

public class LibrarySystem {
    static void findMember(LibraryMember[] members, String targetId) {
        for (LibraryMember m : members) {
            if (m.id.equalsIgnoreCase(targetId)) {
                System.out.print("Found Member -> ");
                m.printDetails();
                return;
            }
        }
        System.out.println("Member with ID " + targetId + " not found.");
    }

    public static void main(String[] args) {
        LibraryMember[] shelf = {
            new StudentMember("Alice", "S101"),
            new FacultyMember("Dr. Smith", "F202"),
            new GuestMember("Bob", "G303")
        };

        for (LibraryMember m : shelf) {
            m.printDetails();
            System.out.println("Fine for 5 overdue days: $" + m.calculateFine(5) + "\n");
        }

        findMember(shelf, "F202");
    }
}