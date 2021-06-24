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
		person.setZipCode(scan.nextInt());
		
		System.out.print("Enter Phone Number : ");
		person.setPhoneNumber(scan.nextLong());
		
		System.out.print("Enter E-Mail ID : ");
		person.setEmail(scan.next());
		
		// Adding the details into list
		personList.add(person);
		
		System.out.println("\nGiven Details are added into the list"+person.getDetails());
	}
	
	/** To display the names of persons that are added */
	private void displayContacts() {
		System.out.println("\nContacts in AddessBook:");
		for (int i = 0; i < personList.size(); i++) {
			String first=personList.get(i).getFirstName();
			String last=personList.get(i).getLastName();
			System.out.println((i+1)+") "+first+" "+last);
		}
	}
		
	/** Asks the user to edit existing details using the name of the person */
	private void editDetails() {
		addressBook.displayContacts();//To display contacts
		System.out.print("Choose the number from above list that to be Edit: ");
		int number = scan.nextInt();
		PersonDetails details = personList.get(number-1);
		System.out.println(details.getDetails());
		System.out.println("\nEnter slot number that to be edit from above");
		int slotnumber = scan.nextInt();
		while(slotnumber<10) {
			switch (slotnumber) {
			case 0: slotnumber=10;
				break;
			case 1: System.out.print("\nEnter First name : ");
				details.setFirstName(scan.next());
				System.out.println("\nEnter other slot number to Edit or Press'0' to Exit");
				slotnumber=scan.nextInt();
				break;
			case 2: System.out.print("\nEnter Last name : ");
				details.setLastName(scan.next());
				System.out.println("\nEnter other slot number to Edit or Press'0' to Exit");
				slotnumber=scan.nextInt();
				break;
			case 3: System.out.print("Enter Address : ");
				details.setAddress(scan.next());
				System.out.println("\nEnter other slot number to Edit or Press'0' to Exit");
				slotnumber=scan.nextInt();
				break;
			case 4: System.out.print("Enter City name : ");
				details.setCity(scan.next());
				System.out.println("\nEnter other slot number to Edit or Press'0' to Exit");
				slotnumber=scan.nextInt();
				break;
			case 5: System.out.println("Enter State name : ");
				details.setState(scan.next());
				System.out.println("\nEnter other slot number to Edit or Press'0' to Exit");
				slotnumber=scan.nextInt();
				break;
			case 6: System.out.println("Enter ZIP Code : ");
				details.setZipCode(scan.nextInt());
				System.out.println("\nEnter other slot number to Edit or Press'0' to Exit");
				slotnumber=scan.nextInt();
				break;
			case 7: System.out.print("Enter Phone Number : ");
				details.setPhoneNumber(scan.nextLong());
				System.out.println("\nEnter other slot number to Edit or Press'0' to Exit");
				slotnumber=scan.nextInt();
				break;
			case 8:	System.out.print("Enter E-Mail ID : ");
				details.setEmail(scan.next());
				System.out.println("\nEnter other slot number to Edit or Press'0' to Exit");
				slotnumber=scan.nextInt();
				break;
			default: System.out.println("Enter valid input");
			}
		}
		System.out.println("After Updating"+details.getDetails());
	}
	
	/** Asks the user to delete existing details using the name of the person */
	private void deleteDetails() {
		addressBook.displayContacts();//To display contacts
		System.out.print("\nChoose the number from above list that to be Delete: ");
		int number = scan.nextInt();
		personList.remove(number-1);
		System.out.println("Selected details were deleted from the list");
	}
	
	private void showDetails() {
		addressBook.displayContacts();//To display contacts
		System.out.print("Choose the number from above list to see details: ");
		int number = scan.nextInt();
		PersonDetails details = personList.get(number-1);
		System.out.println(details.getDetails());
	}
}