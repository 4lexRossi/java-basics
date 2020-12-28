package basicJava1;

public class SuperUser {
	private String login;
	private String password;
	String name;
	
	public SuperUser(final String login, final String password) {
		this.login = login;
		this.password = password;	
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getPassword() {
		return password;
	}
}
