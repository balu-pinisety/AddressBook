package com.AddressBook;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author BALU
 * Creating an Address Book of Persons details for user and can Add, Delete, Edit and Show it
 */
public class AddressBook {
	public int index = 1;
	public HashMap<Integer, PersonDetails> personList = new HashMap<>();
	private static Scanner scan = new Scanner(System.in);
	public static AddressBook addressBook = new AddressBook();// Creating an object of Class AddressBook
	public static void main(String[] args) {
		// TODO display welcome message
		System.out.println("Welcome to Address Book Program");
		// Calling method to add details of the person
		boolean choice=true;
		while (choice) {
			System.out.println("\nChoose the option for person details:\nPress '1' for Add\nPress '2' for Edit\nPress '3' for Delete\nPress '4' for Show\nPress '5' for Exit");
			int option=scan.nextInt();
			switch (option) {
			case 1: addressBook.addDetails();
				break;
			case 2: addressBook.editDetails();
				break;
			case 3: addressBook.deleteDetails();
				break;
			case 4: addressBook.showDetails();
				break;
			case 5: choice=false;
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
		person.setZipCode(scan.next());
		
		System.out.print("Enter Phone Number : ");
		person.setPhoneNumber(scan.next());
		
		System.out.print("Enter E-Mail ID : ");
		person.setEmail(scan.next());
		
		// Adding the details into list
		personList.put(index++,person);
		System.out.println("\nGiven Details are added into the list"+person.getDetails());
	}
		
	/** Asks the user to edit existing details using the name of the person */
	private void editDetails() {
		System.out.print("\nEnter the first name that to be Edit: ");
		String name = scan.next();
		PersonDetails person = new PersonDetails();
		Iterator<Integer> iterator = personList.keySet().iterator();
		while(iterator.hasNext()) {
			int key = iterator.next();
			if (personList.get(key).getFirstName().equals(name)) {
				System.out.println("\nEnter First Name to Edit");
                person.setFirstName(scan.next());
                scan.nextLine();
                System.out.println("Enter Last Name to Edit");
                person.setLastName(scan.next());
                scan.nextLine();
                System.out.println("Enter Address to Edit");
                person.setAddress(scan.next());
                scan.nextLine();
                System.out.println("Enter City to Edit");
                person.setCity(scan.next());
                System.out.println("Enter State to Edit");
                person.setState(scan.next());
                scan.nextLine();
                System.out.println("Enter Zip Code to Edit");
                person.setZipCode(scan.next());
                System.out.println("Enter Phone Number to Edit");
                person.setPhoneNumber(scan.next());
                System.out.println("Enter E-mail to Edit");
                person.setEmail(scan.next());
                personList.put(key, person);
                System.out.println("Contact edited with given first name : " + name);
			}
		}
	}
	
	/** Asks the user to delete existing details using the name of the person */
	private void deleteDetails() {
		System.out.print("\nEnter the first name that to be Delete: ");
		String name = scan.next();
		Iterator<Integer> iterator = personList.keySet().iterator();
		while(iterator.hasNext()) {
			int key = iterator.next();
			if (personList.get(key).getFirstName().equals(name)) {
				personList.remove(key);
				System.out.println("Selected details were deleted from the list");
			}
		}
	}
	
	private void showDetails() {
		System.out.println(personList);
	}
}