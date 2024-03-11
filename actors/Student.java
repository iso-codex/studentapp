package studentapp.actors;

import java.util.ArrayList;
import java.util.List;
import studentapp.course.Course;

public class Student extends Actor {
    private List<Course> courses;

    public Student(String firstName, String lastName, String contactInfo, String role) {
        super(firstName, lastName, contactInfo, role);
        this.courses = new ArrayList<>();
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void registerForCourse(Course course) {
        courses.add(course);
        System.out.println(getFirstName() + " " + getLastName() + " registered for the course: " + course.getCourseName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + courses +
                '}';
    }
}
