package studentapp.course;

public class Enrollment {
	private int studentID;
	private int courseID;
	
	public Enrollment(int studentID, Course id) {
		this.studentID = studentID;
		this.courseID = courseID;
	}

	public int getStudentID() {
		return studentID;
	}

	public int getCourseID() {
		return courseID;
	}
	
	 @Override
	    public String toString() {
	        return null;
	    }
}
