package com.AddressBook;

/**
 * @author BALU
 * Creates and edit details of a person in Address Book 
 */
public class PersonDetails {
	//Variables
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String email;
    private int zipCode;
    private long phoneNumber;

	/** Gets the data from User and Setting it to variables */
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	/** @return Person details which was given  by user */
	public String getDetails(){
        return "\nPerson Details - "+firstName+" "+lastName+"\n"+
        		"  First Name   : "+firstName+"\n"+
        		"  Last Name    : "+lastName+"\n"+
                "  Address      : "+address+"\n"+
                "  City         : "+city+"\n"+
                "  State        : "+state+"\n"+
                "  Zip Code     : "+zipCode+"\n"+
                "  Phone Number : "+phoneNumber+"\n"+
                "  E-mail ID    : "+email+"\n";
	}
	
}
