package observer;

import java.util.ArrayList;

public class EmailList implements Observable{
	
	private ArrayList<Email> emails = new ArrayList();
	private String message;
	
	public EmailList() {}

	@Override
	public void addEmail(Email email) {
		emails.add(email);
	}

	@Override
	public void removeEmail(Email email) {
		emails.remove(email);
	}

	@Override
	public void notifyEmails() {
		emails.forEach((email) -> email.update(message));
	}
	
	public void testMessage() {
		emails.forEach((email) -> System.out.println(email.getText()));
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
