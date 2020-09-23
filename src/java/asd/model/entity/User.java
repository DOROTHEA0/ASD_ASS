package asd.model.entity;

public class User {
	
	private String id;
	private String FirstName;
	private String LastName;
	private String DOB;
	private String Email;
	private String PhoneNumber;
	private String Password;
	private Boolean IsAdmin;
        private Boolean IsActive;
	
	public User() {
		super();
	}

	public User(String id, String firstName, String lastName, String dOB,
			String email, String phoneNumber, String password, Boolean isAdmin, Boolean isActive) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		DOB = dOB;
		Email = email;
		PhoneNumber = phoneNumber;
		Password = password;
		IsAdmin = isAdmin;
                IsActive = isActive;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Boolean getIsAdmin() {
		return IsAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		IsAdmin = isAdmin;
	}
        
        public Boolean getIsActive() {
		return IsActive;
	}

	public void setIsActive(Boolean isAdmin) {
		IsActive = IsActive;
	}
}
