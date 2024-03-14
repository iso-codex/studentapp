package studentapp.course;

public class Course {
    private int id;
    private String name;
//    private double courseCost;

    public Course(String row, String name) {
        this.id = row;
        this.name = name;
//        this.courseCost = courseCost;
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return name;
    }
    
//    public double courseCost() {
//    	return courseCost;
//    }
    @Override
    public String toString() {
        return name; // Return course name instead of memory reference
    }
}
