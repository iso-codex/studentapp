package studentapp.course;

public class Course {
    private int id;
    private String name;
    private String details;
    private int credits;
    private int duration;
    
    public Course(int row, String name, String details, int credits, int duration) {
        this.id = row;
        this.name = name;
        this.details = details;
        this.credits = credits;
        this.duration = duration;
    }

    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}


	public int getCredits() {
		return credits;
	}


	public void setCredits(int credits) {
		this.credits = credits;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	@Override
    public String toString() {
        return name; // Return course name instead of memory reference
    }
}
