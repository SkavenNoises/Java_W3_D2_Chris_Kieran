package Exercise1;

public class Author {

	private String name;
	private String email;
	private char gender;
	private String instagram;

	public Author(String name, String email, char gender, String instagram) {
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.instagram = instagram;
	}

	@Override
	public String toString() {
		return String.format("Author: %s, Email: %s, Gender: %s, Instagram: %s", this.name, this.email, this.gender, this.instagram);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
}
