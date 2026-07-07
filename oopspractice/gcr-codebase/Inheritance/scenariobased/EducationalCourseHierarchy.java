// Base class
class Course {
    private String courseName;
    private int duration; // in hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public void displayCourseInfo() {
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " hours");
    }
}

// Level 1 subclass
class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public String getPlatform() { return platform; }
    public void setPlatform(String platform) { this.platform = platform; }

    public boolean isRecorded() { return isRecorded; }
    public void setRecorded(boolean recorded) { isRecorded = recorded; }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform    : " + platform);
        System.out.println("Recorded    : " + (isRecorded ? "Yes" : "No"));
    }
}

// Level 2 subclass (multilevel inheritance)
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFee() { return fee; }
    public void setFee(double fee) { this.fee = fee; }

    public double getDiscount() { return discount; }
    public void setDiscount(double discount) { this.discount = discount; }

    public double getFinalPrice() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Fee         : " + fee);
        System.out.println("Discount    : " + discount + "%");
        System.out.println("Final Price : " + getFinalPrice());
        System.out.println("-----------------------------------");
    }
}

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        Course course = new Course("Introduction to Programming", 20);
        OnlineCourse onlineCourse = new OnlineCourse("Data Structures", 30, "Coursera", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Full Stack Development", 60, "Udemy", true, 4999, 20);

        System.out.println("=== Course (Base Level) ===");
        course.displayCourseInfo();
        System.out.println("-----------------------------------");

        System.out.println("=== Online Course ===");
        onlineCourse.displayCourseInfo();
        System.out.println("-----------------------------------");

        System.out.println("=== Paid Online Course ===");
        paidCourse.displayCourseInfo();
    }
}