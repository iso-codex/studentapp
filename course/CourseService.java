package studentapp.course;

public class CourseService {
	private Course[] courses = null;
	private CourseDao dao;
	
	public CourseService() throws Exception {
		this.dao = new CourseDao();
		this.intitializeCourses();
	}
	
	public Course findCourseById(int id) throws Exception {
	    // Loop through the courses array
	    for (Course course : courses) {
	        // Check to see if the current course's ID matches the requested ID
	        if (course.getId() == id) {
	            // If so, return the current course
	            return course;
	        }
	    }
	    // If no course with the requested ID is found, return null
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
