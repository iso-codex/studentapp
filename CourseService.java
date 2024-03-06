package studentapp;

public class CourseService {
	private Course[] courses = null;
	private CourseDao dao;
	
	public CourseService() throws Exception {
		this.dao = new CourseDao();
		this.intitializeCourses();
	}
	
	public Course findCourseById(String id) throws Exception {
		// Loop through the courses array
		
		// Check to see if the current course's ID matches the requested ID
		
		// If so return current course
		return null;
	}
	
	public Course[] returnAllCourses() throws Exception {
		return dao.readCourses();
	}
	
	private void intitializeCourses() throws Exception {
		if(this.courses == null) {
			this.courses = this.returnAllCourses();
		}
	}
}
