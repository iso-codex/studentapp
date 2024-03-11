package studentapp.actors;


public class Role {
	public enum Roles {
		STUDENT, FACULTY, SYSTEM_ADMIN
	}
	// Instance Variable
	Roles role;
	
	
	// Constructor
	public Role(Roles role) {
		this.role = role;
	}
	
	public void giveAccessRole() {
		switch(role) {
		case STUDENT:
			System.out.println("User is a Student...");
			break;
			
		case FACULTY:
			System.out.println("User is a Faculty memeber...");
			break;
			
		case SYSTEM_ADMIN: 
			System.out.println("User is an Admin...");
			break;
			
		default:
			System.out.println("User has no role...");
			break;
		}
	}
	
	
}
