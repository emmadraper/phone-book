import java.util.Scanner;		
public class PhoneBook {

	public static void main(String[] args){
		//create an object called john smith
					
		//class scanner object is input
		Scanner input = new Scanner(System.in);
						
		System.out.println("Enter your First Name: ");
		String Fname = input.nextLine();
						
		System.out.println("Enter your Last Name: ");
		String Lname = input.nextLine();
			
		System.out.println("Enter your email: ");
		String Email = input.nextLine();
		
		//passes his first name last name and phone number to the construct
		PhoneBookEntry Entry1 = new PhoneBookEntry("John", "Smith", "----", "jsmith@gmail.com", "2023334444", "0");
						
		String a = Entry1.getFname();
		Entry1.printphoneEntry();
		
		//create an object of type phone book entry called james
		PhoneBookEntry Entry2 = new PhoneBookEntry("James", "2023443444");
		Entry2.printphoneEntry();
		
		//create an object of type phone book entry called Sarah
		String Entry3 =("Sarah");
		
		//this is how I can change/edit the existing attributes of an object
		//stored in phonebook				
		Entry1.setPhoneNumber("2025555555");
		Entry1.printphoneEntry();
		
		//Assign the Zipcode of John Smith to James’s
		//Do I have to create a method here that actually swaps these two functions? and how do I do that?
		Entry2.setFname(Entry1.getEmail());
		
		//why does it say that it is undefined for type string
		Entry2.setLname("Brown");
		Entry2.printphoneEntry();
						
		}
}

		
		
	
