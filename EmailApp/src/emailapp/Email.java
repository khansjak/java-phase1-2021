package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int capacity=500;
	private int mailboxCapacity=500;
	private int defaultPasswordLength = 10;
	private int passwordLength = 10;
	private String alternateEmail;
	private String companySuffix="bharatbiotech.com";
	Scanner in = new Scanner(System.in);
	
	
	//Constructor to receive first name and last name 
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created : "+this.firstName+" "+this.lastName);
		this.department=setDepartment();
		System.out.println("Department :"+this.department);
		this.password= randomPassword(passwordLength);
		System.out.println("Password :"+this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		System.out.println("Email "+email);

	}


	//Set department 
	private String setDepartment() {
		// TODO Auto-generated method stub
		System.out.println("Enter the department\n1-->Sales\n2-->Development\n3-->Accounting\n4-->none");
		
		int dep = in.nextInt();
		if(dep ==1)
			return "Sales";
		else if( dep==2)
			return "Developement";
		else if(dep==3)
			return "Accounts";
		else
		return null;
	}
	
	
	//Generate a random password
	String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%ˆ&*()_+";
		char[] password = new char[length];
		for(int i=0 ; i<length; i++) {
			int rand = (int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
	
	//Set the mailbox capacity 
	
	public void setmailboxCapacity(int capacity) {
		// TODO Auto-generated method stub
		this.mailboxCapacity = capacity;
		System.out.println("Mailbox capacity :"+capacity);
		
	}
	//Set the alternate email
	
	public void setAlternateEmail(String email2) {
		this.alternateEmail=email2;
		System.out.println("Alternate email :"+email2);
	}
	
	//Change the password 
	public void setNewpassword(String password2) {
		
		this.password=password2;
		
	}
	
	

}
