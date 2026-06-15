package sample;

public class UserInformation {

	private int id;
	private String firstName;
	private String lastName;
	private int experience;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "UserInformation {id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", experience="
				+ experience + "}";
	}
}
