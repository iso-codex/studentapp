package studentapp.students;

import java.util.ArrayList;
import java.util.List;

import studentapp.actors.Actor;
import studentapp.actors.ContactInfo;
import studentapp.course.Course;

public class Student extends Actor {
	
	private List<Course> courses;

//    public Student(ContactInfo contactInfo, Role role) {
//
//        ContactInfo.contactInfo = contactInfo;
//        this.courses = new ArrayList<>();
//    }
	
	   public Student(int id, String role, ContactInfo contactInfo, String password) {
			super(id, role, contactInfo, password);
			// TODO Auto-generated constructor stub
		}

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void registerForCourse(Course course) {
    	
    	if(courses == null) {
    		courses = new ArrayList<Course>();
    	}
    	
        courses.add(course);
        System.out.println(" registered for the course: " + course.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + courses +
                '}';
    }
}
