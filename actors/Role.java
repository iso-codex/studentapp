package studentapp.actors;


public class Role {
	public enum Roles {
		student, faculty, system_Admin
	}
	// Instance Variable
	Roles role;
	
	
	// Constructor
	public Role(Roles role) {
		this.role = role;
	}
	
	public void giveAccessRole() {
		switch(role) {
		case student:
			System.out.println("User is a Student...");
			break;
			
		case faculty:
			System.out.println("User is a Faculty memeber...");
			break;
			
		case system_Admin: 
			System.out.println("User is an Admin...");
			break;
			
		default:
			System.out.println("User has no role...");
			break;
		}
	}
	
	
}
