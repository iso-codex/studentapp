package studentapp.actors;

import java.util.ArrayList;
import java.util.List;
import studentapp.course.Course;

public class Actor {
    private String firstName;
    private String lastName;
    private String contactInfo;
    private String role;
    private List<Course> courses;

    public Actor(String firstName, String lastName, String contactInfo, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = contactInfo;
        this.role = role;
        this.courses = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void registerForCourse(Course course) {
        courses.add(course);
        System.out.println(firstName + " " + lastName + " registered for the course: " + course.getCourseName());
    }

    @Override
    public String toString() {
        return "Actor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", contactInfo=" + contactInfo +
                ", role=" + role +
                ", courses=" + courses +
                '}';
    }
}
