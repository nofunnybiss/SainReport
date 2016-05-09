package view;

import java.util.EventObject;

public class LoginButtonEvent extends EventObject {

	private String user;
	private String password;

	public LoginButtonEvent(Object source, String user, String password) {
		super(source);
		this.user = user;
		this.password = password;
	}

	public LoginButtonEvent(Object source) {
		super(source);
	}


	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}
}