package studentapp.actors;

import java.util.ArrayList;
import java.util.List;

import studentapp.course.Course;

public class Student {
    private String firstName;
    private String lastName;
    private List<Course> courses;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void registerForCourse(Course course) {
        courses.add(course);
        System.out.println(firstName + " " + lastName + " registered for the course: " + course.getCourseName());
    }

    @Override
    public String toString() {
        return "Student - " +
                "name= " + firstName + ' ' + lastName + ' ' +
                ", courses= " + courses;
    }
}
