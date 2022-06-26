import observer.Email;
import observer.EmailList;

public class Main {

	public static void main(String[] args) {
		
		EmailList myEmails = new EmailList();
		
		for(int i = 0; i < 3; i++) {
			myEmails.addEmail(new Email());
		}
		
		myEmails.testMessage();
		
		myEmails.setMessage("New message");
		myEmails.notifyEmails();
		
		System.out.println("--------------------------------");
		
		myEmails.testMessage();

	}

}
