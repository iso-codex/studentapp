package studentapp.test;

import studentapp.course.Course;
import studentapp.course.CourseService;

public class CourseServiceTest {
	
	
	 public static void main(String[] args) {
		 
		 try {
			 
			CourseService service = new CourseService() ;
			testReturnAllCourses(service);
			testFindByID(service);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 private static void testReturnAllCourses(CourseService svc) throws Exception {
		 System.out.println("Testing Return all courses\n");
		 Course[] courses = svc.returnAllCourses();
		 for(Course c: courses) {
			 System.out.println(c.getId() + " " + c.getCourseName());
			 
		 }
		 
		 
		 
	 }
	 
	 private static boolean testFindByID(CourseService svc) throws Exception {
		 String courseID = "Science";
		 Course foundCourse = null;
		 System.out.println("\n\nTesting CourseService.findByID");
		 
		 foundCourse = svc.findCourseById(courseID);
		
		 if(foundCourse == null) {
			 System.out.println("Test failed" +  " " + courseID + " Course ID not found");
			 return false;
		 }
		 else {
			 System.out.println("Test passed" + " "+ courseID + " Course ID found");
			 return true;
		 }
		 
		 
	 }
}
