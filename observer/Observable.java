package observer;

public interface Observable {
	
	public void addEmail(Email email);
	
	public void removeEmail(Email email);
	
	public void notifyEmails();

}
