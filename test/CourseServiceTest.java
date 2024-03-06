package studentapp.test;

import studentapp.Course;
import studentapp.CourseService;

public class CourseServiceTest {
	
	
	 public static void main(String[] args) {
		 
		 try {
			 
			CourseService service = new CourseService() ;
			testReturnAllCourses(service);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 private static void testReturnAllCourses(CourseService svc) throws Exception {
		 Course[] courses = svc.returnAllCourses();
		 for(Course c: courses) {
			 System.out.println(c.getId() + " " + c.getCourseName());
			 
		 }
		 
		 
	 }
}
