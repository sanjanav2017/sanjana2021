package springbeanfactoryDemo;

public class Message {

	//create setter method for this to inject the dependency  has-relationship
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}