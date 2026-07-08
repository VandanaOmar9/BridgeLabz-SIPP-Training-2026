import java.util.*;

abstract class CourseType { String title; CourseType(String t) { title = t; } }
class ExamCourse extends CourseType { ExamCourse(String t) { super(t); } }
class ResearchCourse extends CourseType { ResearchCourse(String t) { super(t); } }

class Course<T extends CourseType> {
    List<T> list = new ArrayList<>();
    void enroll(T c) { list.add(c); }
    List<T> getList() { return list; }
}

public class CourseManagement {
    static void printCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) System.out.println("Course: " + c.title);
    }

    public static void main(String[] args) {
        Course<ResearchCourse> dept = new Course<>();
        dept.enroll(new ResearchCourse("AI ML Thesis"));
        printCourses(dept.getList());
    }
}