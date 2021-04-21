package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email email = new Email("Jon","Doe");
		email.setmailboxCapacity(4000);
		email.setAlternateEmail("Jasson.Statham@Goo.com");
		System.out.println("Enter your new password\n");
		Scanner in = new Scanner(System.in);
		String password = in.nextLine();
		email.setNewpassword(password);
		System.out.println("New password :"+password);
		
	}

}
