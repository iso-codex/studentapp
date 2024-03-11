package studentapp.actors;

import java.util.ArrayList;
import java.util.List;
import studentapp.course.Course;

public class Student extends Actor {

 

	private List<Course> courses;

//    public Student(ContactInfo contactInfo, Role role) {
//
//        ContactInfo.contactInfo = contactInfo;
//        this.courses = new ArrayList<>();
//    }
	
	   public Student(String contactInfo, String role) {
			super(contactInfo, role);
			// TODO Auto-generated constructor stub
		}

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void registerForCourse(Course course) {
        courses.add(course);
        System.out.println(" registered for the course: " + course.getCourseName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + courses +
                '}';
    }
}
