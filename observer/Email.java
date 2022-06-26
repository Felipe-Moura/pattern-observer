package observer;

public class Email implements Observer{
	
	private String text;
	
	public Email() {
		this.text = "Hello";
	}

	@Override
	public void update(String message) {
		this.text = message;
	}

	public String getText() {
		return text;
	}

}
