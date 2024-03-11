package studentapp.actors;

import java.util.ArrayList;
import java.util.List;
import studentapp.course.Course;

public class Actor {
    private String firstName;
    private String lastName;
    private ContactInfo contactInfo;
    private Role role;
    private List<Course> courses;

    public Actor(String firstName, String lastName, ContactInfo contactInfo, Role role) {
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

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
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
