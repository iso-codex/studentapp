package studentapp.actors;

import java.util.ArrayList;
import java.util.List;
import studentapp.course.Course;

public class Actor {
    private String contactInfo;
    private String role;


    public Actor(String contactInfo, String role) {
        this.contactInfo = contactInfo;
        this.role = role;
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

    @Override
    public String toString() {
        return "Actor{" +

                ", contactInfo=" + contactInfo +
                ", role=" + role +

                '}';
    }
}
