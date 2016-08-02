import java.util.ArrayList;

//Part Zero!

public class PhoneBookEntry {
	//defines the attributes of the class
	//State- the attributes/ features..
	private String Fname;
	private String Lname;
	private String Address;
	private String Email;
	private String phoneNumber;
	private String zip;
	
	//Constructor Method- (you need to have a constructor in every class you create)
	//constructors initialize the objects
	//they allow you to create attributes for each class
	//this is the default constructor
	public PhoneBookEntry(){
		
	}
	
	//constructor that takes all of the arguments as attributes
	public PhoneBookEntry(String F, String L, String A, String E, String p, String z) 
	{	
		//constructors
		Fname = F;
		Lname = L;
		Address = A;
		Email = E;
		phoneNumber = p;
		zip = z;}
	
	public PhoneBookEntry(String F, String p)
	{
		Fname = F;
		phoneNumber = p;
	}
		
	//Getters and Setters
	//Getters and Setters - allow you to get and set the attributes of each constructor
	//Creating the getter and setter for int Fname;
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public void printphoneEntry()
	{	
		//print the objects state
		System.out.println("-----" +Fname);
		System.out.println("-----" +Lname); 
		System.out.println("-----" +Address);
		System.out.println("-----"+Email);
		System.out.println("-----"+phoneNumber);
		System.out.println("-----"+zip);
		
	}

}



