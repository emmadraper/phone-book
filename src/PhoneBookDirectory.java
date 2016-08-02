import java.util.Scanner;
import java.util.ArrayList;

public class PhoneBookDirectory {
	private PhoneBookEntry[] PhoneBook = new PhoneBookEntry[10];
	private int count;
	
	public PhoneBookEntry[] getPhoneBook() {
		return PhoneBook;
	}

	public void setPhoneBook(PhoneBookEntry[] phoneBook) {
		PhoneBook = phoneBook;
	}

//---------------------------------------------------Create a method Menu for the user
	public void menu() {
		// Create a  Scanner
		Scanner input = new Scanner(System.in);

			System.out.println("---------MENU-----------");
			System.out.println("0. Add a phone book entry. ");
			System.out.println("1. Print all phone book entries. ");
			System.out.println("2. Search for an entry by last name. ");
			System.out.println("3. Search for an entry by phone number. ");
			System.out.println("4. Edit a phone book entry. ");
			System.out.println("5. Delete a phone book entry. ");
			System.out.println("6. Quit. ");
			System.out.println("Please make a selection from the menu. ");
			// choice comes from the user ..
			int choice= input.nextInt();
			
		if (choice==0)
			this.createPhoneBookEntry();
		if (choice == 1)
				this.printBookEntry();
				System.out.println("Here are all the phone book entries.");
		if (choice == 2)
			System.out.println("Please enter the last name your looking for.");
			String Lname = input.next();
			this.SearchLname(Lname, choice);
		if (choice == 3)
			System.out.println("Please enter the number you're looking for.");
			String phoneNumber = input.next();
			this.SearchPhone(phoneNumber, choice);
		if (choice ==4)
			System.out.println("Please enter the last name of the person you would like to edit. ");
			this.Edit(Lname);
		if (choice==5)
			System.out.println("Please enter the last name of the person you would like to delete from your contacts.");
			this.Remove(Lname);
		if (choice==6)
			return;
		}
	

//-------------------------------------------------------------This method using the last name to find
//-------------------------------------------------------------a specific contact. 
	private PhoneBookEntry SearchLname(String lastName, int count) {
		//could I use linear search here and set the key equal to whatever the user asks for?
		PhoneBookEntry temp = new PhoneBookEntry();
		// Really important line
		for (int i = 0; i < count; i++) {
			if (lastName.equals(PhoneBook[i].getLname())) {
				temp = PhoneBook[i];
				break;
			}
		}
		return temp;
	}
	
//---------------------------------------------------------------Search by Phone Number
	// This method searches through the contact list using the phone number to
	// find a specific contact
	private PhoneBookEntry SearchPhone(String phoneNumber, int count) {
		PhoneBookEntry temp = new PhoneBookEntry();
		// Really important line
		for (int i = 0; i < count; i++) 
		{
			if (phoneNumber.equals(PhoneBook[i].getPhoneNumber())) {
				temp = PhoneBook[i];
				break;
			}
		}
		// temp will be either found or empty -
		return temp;
	}
	
//-----------------------------------------------------------------Print one Entries
	// this method is created to print all of the phone book entries
	private void printBookEntry() {
		for (int i = 0; i < PhoneBook.length; i++) {
			PhoneBook[i].printphoneEntry();
		}
	}
	
//-----------------------------------------------------------------Print ALL Entries in phone book
		// this method is created to print all of the phone book entries
		private void printALLBookEntry(String Fname,String Lname, String Address, String Email, String phoneNumber, String zip) {
			for (int i = 0; i < PhoneBook.length; i++) {
				PhoneBook[i].printphoneEntry();
			}
		}
//-----------------------------------------------------------------Search for edit
	// search that returns the index of the last name your looking for
	private int searchForEdit(String LastName)
	{
		for(int i=0; i<PhoneBook.length;i++)
		{
			if(LastName.equals(PhoneBook[i].getLname()) ==true)
			{
				return i;
			}
		}
		return -1;
	}
//----------------------------------------------------------------Removes something from a contact
	//where string L is the one you want to delete
	private void Remove(String L)
	{
		
		for (int i = 0; i < PhoneBook.length; i++) {
			//how do I remove just one element of the array based on what the user wants to remove
				if(PhoneBook[i].getFname().equals(L)){
					PhoneBook[i].setPhoneNumber("");
					PhoneBook[i].setEmail("");
					PhoneBook[i].setFname("");
					PhoneBook[i].setLname("");
					PhoneBook[i].setZip("");
					
				}
			
		}
		int position = searchForEdit(L);
		
		
	}

//---------------------------------------------------------------------EDIT
	private void Edit(String L){
		String Firstname;
		String Lastname;
		String Address;
		String Email;
		String PhoneNumber;
		String Zip;
		
		Scanner input = new Scanner(System.in);
		
	for(int i = 0; i < PhoneBook.length; i++)
	{
		int position = searchForEdit(L);

		PhoneBookEntry temp = new PhoneBookEntry();
		
		System.out.println("Enter the new first name: ");
		Firstname = input.next();
		
		System.out.println("Enter the new last name: ");
		Lastname = input.next();
		
		System.out.println("Enter the new address: ");
		Address = input.next();
		
		System.out.println("Enter the new phone number: ");
		PhoneNumber = input.next();
		
		System.out.println("Enter the new email: ");
		Email = input.next();
			
		System.out.println("Enter the new zip: ");
		Zip = input.next();
		
			PhoneBook[position].setFname(Firstname);
			PhoneBook[position].setLname(Lastname);
			PhoneBook[position].setAddress(Address);
			PhoneBook[position].setPhoneNumber(PhoneNumber);
			PhoneBook[position].setEmail(Email);
			PhoneBook[position].setZip(Zip);	
		}
	
	}
//---------------------------------------------------------------Create Phone Book Entry
	private void createPhoneBookEntry() {
		Scanner input = new Scanner(System.in);
		int count = 0;
		do {
			System.out.println("Enter the first name: ");
			String Fname = input.nextLine();
			System.out.println("Enter the last name: ");
			String Lname = input.nextLine();
			System.out.println("Enter the address: ");
			String Address = input.nextLine();
			System.out.println("Enter the email address: ");
			String Email = input.nextLine();
			System.out.println("Enter the phone number: ");
			String phoneNumber = input.next();
			System.out.println("Enter the zip code: ");
			String zip = input.next();

			// send to the constructor
			PhoneBook[count] = new PhoneBookEntry(Fname, Lname, Address, Email, phoneNumber, zip);
			count++;

			System.out.println("Would you like to make another entry: Y or N? ");
			String decision = input.next();

			if (decision.equals("N")) 
			{
				break;
			}

		} while (count < 5);
	}
}