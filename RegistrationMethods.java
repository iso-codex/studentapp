package studentapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistrationMethods {
    public static void main(String[] args) {
        // Create some courses
        Course[] courses = {
                new Course(1, "Java Programming", 200),
                new Course(2, "Data Structures", 300),
                new Course(3, "Web Development", 420)
        };

        // Prompt the user to enter student details
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        Student student = new Student(studentName);

        // Prompt the user to select courses
        System.out.println("Available Courses:");
        for (Course course : courses) {
            System.out.println(course.getId() + ". " + course.getName());
        }
        System.out.println("Enter course IDs to register (separated by commas):");
        String[] courseIDs = scanner.nextLine().split(",");

        // Register the student for selected courses
        for (String courseID : courseIDs) {
            int id = Integer.parseInt(courseID.trim());
            for (Course course : courses) {
                if (course.getId() == id) {
                    student.registerForCourse(course);
                    break;
                }
            }
        }

        // Print student information
        System.out.println(student);
    }
}
