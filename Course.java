package studentapp;

public class Course {
    private String id;
    private String name;
//    private double courseCost;

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
//        this.courseCost = courseCost;
    }

    public String getId() {
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
