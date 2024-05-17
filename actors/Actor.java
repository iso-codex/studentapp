package studentapp.actors;

public class Actor {
	private int id;
	private String role;
	private ContactInfo contactInfo;
    private String password;


    public Actor(int id, String role, ContactInfo contactInfo, String password) {
    	this.id = id;
        this.contactInfo = contactInfo;
        this.role = role;
        this.password = password;
    }
    
    public ContactInfo getContactInfo() {
        return this.contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
    public String toString() {
        return "Actor{" +

                ", contactInfo=" + contactInfo +
                ", role=" + role +

                '}';
    }
}
