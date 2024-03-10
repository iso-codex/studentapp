package studentapp.actors;

import java.util.ArrayList;
import java.util.List;
import studentapp.course.Course;

public class Actor extends Student {
    private ContactInfo contactInfo;
    private Role role;

    public Actor(String firstName, String lastName, ContactInfo contactInfo, Role role) {
        super(firstName, lastName); // Call the constructor of the superclass (Student)
        this.contactInfo = contactInfo;
        this.role = role;
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

    @Override
    public String toString() {
        return "Actor{" +
                "contactInfo=" + contactInfo +
                ", role=" + role +
                '}';
    }
}
