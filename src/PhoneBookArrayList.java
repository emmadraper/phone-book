//dynamic data structure so it can be used when there is no upper bound on the number of elements.
import java.util.ArrayList;
import java.util.Scanner;

//Professor Bari has helped me throughout this assignment 
public class PhoneBookArrayList {
	static ArrayList <PhoneBookEntry> mylist = new ArrayList <PhoneBookEntry>();

	public void PhoneBookEntry(String name, String Lastname, String phoneNumber, String Address, String Email, String Zip) {
		   
	    this.name = name;
	    this.Lastname = Lastname;
	    this.phoneNumber = phoneNumber;
	    this.Address = Address;
	    this.Email = Email;
	    this.Zip = Zip;
		}
	
	public void PhoneBookEntry(){
		
	}
	
	public void PhoneBookEntry(String name, String phoneNumber) {
   
    this.name = name;
    this.phoneNumber = phoneNumber;
	}

	private String name;
	private String Lastname;
	private String phoneNumber;
	private String Address;
	private String Email;
	private String Zip;
	
	//getters
	public String getName() {
		return name;
		}
	public String getLastname(){
		return Lastname;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return phoneNumber;
	}
	
	public String getEmail() {
		return phoneNumber;
	}
	
	public String getZip(){
		return Zip;
	}
	
	public void setAddress(String Address) {
		this.Address = Address;
		}
	
	public void setName(String name) {
		this.name = name;
		}
	
	public void setLastname(String Lastname) {
		this.Lastname = Lastname;
		}
	public void setphoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		}
	
	public void setEmail(String Email) {
		this.Email = Email;
		}
	
	public void setZip(String Zip) {
		this.Zip = Zip;
		}

	//this method deletes a particular phone book entry
	public static int delete(String A){
		int found = -1;
		for(int i=0; i< mylist.size(); i++){
			if(mylist.get(i).getFname().equals(A) == true){
				mylist.remove(i);
				return i;
			}
		}
		return found;
	}
	//this is a method that searches the phone book for an entry
	public static int search(String A){
		int found = -1;
		for(int i=0; i< mylist.size(); i++){	
			if(mylist.get(i).getFname().equals(A) == true){
				return i;}	
			}return found;
		}
	
	//this is a method that edits a partilar phone book entry for the user
	private void Edit(String L){
		
		Scanner input = new Scanner(System.in);
		
	for(int i = 0; i < 10; i++)
	{
		int position = search(L);
			PhoneBookEntry temp = new PhoneBookEntry();
		
			System.out.println("Enter the new first name: ");
			name = input.next();
			
			if(mylist.get(i).getFname().equals(L) == true)
			{
				System.out.println("Please enter in the new information ");
				
				System.out.println("Enter the new last name: ");
				Lastname = input.next();
		
				System.out.println("Enter the new address: ");
				Address = input.next();
		
				System.out.println("Enter the new phone number: ");
				phoneNumber = input.next();
		
				System.out.println("Enter the new email: ");
				Email = input.next();
			
				System.out.println("Enter the new zip: ");
				Zip = input.next();
		
			mylist.get(i).setFname(name);
			mylist.get(i).setLname(Lastname);
			mylist.get(i).setAddress(Address);
			mylist.get(i).setPhoneNumber(phoneNumber);
			mylist.get(i).setEmail(Email);
			mylist.get(i).setZip(Zip);
			}
			input.close();
		}
	}
	
	//Chapter 11 has an example of print all
	//create a method that prints all of the entries
	private static void printAll() {
		for (int i = 0; i < mylist.size(); i++) {
			mylist.get(i).printphoneEntry();
		}
	}
	

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
    for (int i = 0; i<10; i++){
			System.out.println("Enter your first name: ");
			String name = input.nextLine();
			System.out.println("Enter the last name: ");
			String Lastname = input.nextLine();
			System.out.println("Enter your address: ");
			String Address = input.nextLine();
			System.out.println("Enter the email: ");
			String Email = input.nextLine();
			System.out.println("Enter the phone number: ");
			String phoneNumber = input.next();
			System.out.println("Enter the zip code: ");
			String zip = input.next();
			
			PhoneBookEntry temp = new PhoneBookEntry(name, Lastname, Address, phoneNumber, Email, zip);
		 	mylist.add(temp);
			
			//The index field denotes the position of the element that we requested for.
			//The Size field denotes the size of the matrix.
			//An ArrayList with a size of 2 has valid indices in the interval [0, 1].
			mylist.get(i).setFname(name);
			mylist.get(i).setLname(Lastname);
			mylist.get(i).setAddress(Address);
			mylist.get(i).setPhoneNumber(phoneNumber);
			mylist.get(i).setEmail(Email);
			mylist.get(i).setZip(zip);
			i++;

			System.out.println("Would you like to make another entry: Y or N? ");
			String decision = input.next();

			if (decision.equals("N")) 
			{
				break;
			}
		} 
			input.close();
			printAll();
   		}
}

/*This is what we did in class Together, I kept it to reference back to and help me through the homework
 * 
 * import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookEntryArrayList {
	//can I use super(); and somehow link this to my existing directory?
	//super();
	Scanner input = new Scanner(System.in);
	private String s;
	private String p;
	
	ArrayList <PhoneBookEntry> mylist = new ArrayList<PhoneBookEntry>();
	
	PhoneBookEntry a = new PhoneBookEntry();
	
	myList.add(a);
	
	System.out.println("Enter in your contact: ");
	S = input.next();
	
	System.out.println("Enter in a second contact: ");
	P = input.next();
	
	 for (int i=0;i<10; i++);
	 	PhoneBookEntry temp = new PhoneBookEntry(S, P);
	 	myList.add(temp);

	 
	 //define these methods in Phone Book directory
	 myPhoneBook.printall();

	 myPhoneBook.Edit(lastname);
	}
}
*/