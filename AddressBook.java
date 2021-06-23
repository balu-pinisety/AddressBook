package com.AddressBook;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author BALU
 * Creating an Address Book of Persons details for user and can Add, Delete, Edit and Show it
 */
public class AddressBook {

	List<PersonDetails> personList = new ArrayList<>();
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO display welcome message
		System.out.println("Welcome to Address Book Program");
		// Creating an object of Class AddressBook
		AddressBook addressBook = new AddressBook();
		// Calling method to add details of the person
		boolean choice=true;
		while (choice) {
			System.out.println("\nChoose the option:\nPress '1' for Add\nPress '2' for Exit");
			int option=scan.nextInt();
			switch (option) {
			case 1: addressBook.addDetails();
				break;
			case 2: choice=false;
				System.out.println("Exited out of AddressBook");
				break;
			default: 
				System.out.println("Please enter valid input");
			}
		}
	}
	
	/** Asks the user for details of the person and storing in person List */
	private void addDetails() {
		PersonDetails person = new PersonDetails();
		
		System.out.print("\nEnter First name : ");
		person.setFirstName(scan.next());
		
		System.out.print("Enter Last name : ");
		person.setLastName(scan.next());
		
		System.out.print("Enter Address : ");
		person.setAddress(scan.next());
		
		System.out.print("Enter City name : ");
		person.setCity(scan.next());
		
		System.out.print("Enter State name : ");
		person.setState(scan.next());
		
		System.out.print("Enter ZIP Code : ");
		person.setZipCode(scan.nextInt());
		
		System.out.print("Enter Phone Number : ");
		person.setPhoneNumber(scan.nextLong());
		
		System.out.print("Enter E-Mail ID : ");
		person.setEmail(scan.next());
		
		// Adding the details into list
		personList.add(person);
		
		System.out.println("\nGiven Details are added into the list"+person.getDetails());
	}
	
}