package studentapp.actors;

public class ContactInfo {
	// Instance Variable
	private String firstName;
	private String lastName;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private int phone;
	private String email;
	
	// Constructor
	public ContactInfo(String firstName, String lastName, String address1, String address2, String city, String state, String zip, int phone, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
	}

	
	// Getter methods
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress1() {
		return address1;
	}

	public String getAddress2() {
		return address2;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public int getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\n" + "Main Address: " +  address1 +
				"\n" + "Other Address: " + address2 +
				"\n" + "City: " + city +
				"\n" + "State: " + state +
				"\n" + "Zip Code: " + zip +
				"\n" + "Phone Number: " + phone +
				"\n" + "Email: " + email;
	}
	
	
}
