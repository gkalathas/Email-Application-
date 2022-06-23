package emaiApp;


import java.util.Scanner;


public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength =10;
	private String alternateEmail;
	private String companySuffix = "kalathascompany.com";
	
	
	//Constructor for first name and last name
	public Email(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: "+ this.firstName + " "+this.lastName);
		
		
		
		//method calling for the department
		this.department = setDepartment();
		System.out.println("Department: "+ this.department);
		
		//method returning password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: "+ this.password);
		
		//generating email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department +"." + companySuffix;
		System.out.println("Your email is: "+ email);
		
	}
		
		
	//method asking for the department	
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {return "sales";}
		else if(depChoice==2) {return"dev";}
		else if(depChoice==3) {return "acct";}
		else {return "none";}
	}
	
	private String randomPassword(int length){
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
		int random = (int)(Math.random()* passwordSet.length());
		password[i] = passwordSet.charAt(random);	
		}
		return new String(password);	
	}
	//mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;	
	}
	
	//alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//change password
	public void changePassword(String password) {
		this.password = password;
	}
	//getters
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternatreEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	
	//show information
	public String showInformation() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailboxCapacity  +"mb";
	}	
		
}
	
	
	
	
	
	
	
	
	
	
	
	