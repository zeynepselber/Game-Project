package entities;

import java.util.Date;

public class User {

	private int id ;
	private String firstName ;
	private String lastName ;
	private Date dateOfBirth ;
	private String nationalityId ;
	private String username ;
	private String password ;
	private double money ;
	
	public User() {}
	  
	public User(int id, String firstName, String lastName, Date dateOfBirth , String nationalityId , String username, String password, double money) {
		this.id            = id;
		this.firstName     = firstName;
		this.lastName      = lastName;
		this.dateOfBirth   = dateOfBirth ;
		this.nationalityId = nationalityId ;
		this.username      = username;
		this.password      = password;
		this.money         = money;
	}

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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
}
