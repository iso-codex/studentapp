package studentapp;

public class Course {
    private int id;
    private String name;
    private int courseCost;

    public Course(int id, String name, int courseCost) {
        this.id = id;
        this.name = name;
        this.courseCost = courseCost;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public int courseCost() {
    	return courseCost;
    }
}
