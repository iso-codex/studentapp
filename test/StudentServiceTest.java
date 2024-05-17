package studentapp.test;

import studentapp.actors.ActorDao;
import studentapp.course.CourseService;
import studentapp.course.EnrollmentDao;
import studentapp.students.StudentService;

public class StudentServiceTest {
	
	
	 public static void main(String[] args) {
		 
		 StudentService svc = new StudentService();
			svc.setActorDao(new ActorDao());
			svc.setEnrollmentDao(new EnrollmentDao());
			
			try {
				svc.setCourseService(new CourseService());
				testInitializeStudents(svc);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	 
	 private static void testInitializeStudents(StudentService svc) throws Exception {
			svc.initializeStudents();
	}
}
