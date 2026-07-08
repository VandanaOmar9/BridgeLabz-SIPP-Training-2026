import java.util.*;

abstract class JobRole { String applicant; JobRole(String app) { applicant = app; } }
class SoftwareEngineer extends JobRole { SoftwareEngineer(String app) { super(app); } }
class DataScientist extends JobRole { DataScientist(String app) { super(app); } }

class Resume<T extends JobRole> {
    T role;
    Resume(T role) { this.role = role; }
    T getRole() { return role; }
}

public class ResumeScreening {
    static void processPipeline(List<? extends Resume<? extends JobRole>> pipeline) {
        for (Resume<? extends JobRole> r : pipeline) {
            System.out.println("Screened candidate: " + r.getRole().applicant);
        }
    }

    public static void main(String[] args) {
        List<Resume<SoftwareEngineer>> sweList = new ArrayList<>();
        sweList.add(new Resume<>(new SoftwareEngineer("Alice")));
        sweList.add(new Resume<>(new SoftwareEngineer("Bob")));

        System.out.println("--- Screening Pipeline ---");
        processPipeline(sweList);
    }
}