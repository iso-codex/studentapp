package studentapp.students;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import studentapp.actors.Actor;
import studentapp.actors.ActorDao;
import studentapp.course.Course;
import studentapp.course.CourseService;
import studentapp.course.EnrollmentDao;

public class StudentService {
	
	private ActorDao actorDao;
	private CourseService courseService;
	private EnrollmentDao enrollmentDao;
	
	private List<Student> students = new ArrayList<>();
	
	public void initializeStudents() throws Exception{
		
		Map<Integer, Integer> enrollments = enrollmentDao.readEnrollments();
		List<Actor> actors = actorDao.readActors();
		
		for(Actor actor : actors) {
			if(actor.getRole().equals("STUDENT")) {
				
				Course course = null;
				
				Integer courseId = enrollments.get(actor.getId());
				if(courseId != null) {
					course = courseService.findCourseById(courseId); 
				}
				
				if(course != null) {
					
					Student student = new Student(actor.getId(), actor.getRole(), actor.getContactInfo(), actor.getPassword());
					student.registerForCourse(course);
					students.add(student);
			
				}
			}
		}
		
	}
	
	public ActorDao getActorDao() {
		return actorDao;
	}
	public void setActorDao(ActorDao actorDao) {
		this.actorDao = actorDao;
	}
	public EnrollmentDao getEnrollmentDao() {
		return enrollmentDao;
	}
	public void setEnrollmentDao(EnrollmentDao enrollmentDao) {
		this.enrollmentDao = enrollmentDao;
	}

	public CourseService getCourseService() {
		return courseService;
	}

	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}
	
}
