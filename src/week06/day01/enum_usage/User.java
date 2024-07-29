package week06.day01.enum_usage;

public class User {
	private String username;
	private String password;
	
	private ERole role;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public ERole getRole() {
		return role;
	}
	
	public void setRole(ERole role) {
		this.role = role;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "User{" + "password='" + getPassword() + '\'' + ", username='" + getUsername() + '\'' + ", role=" + getRole() + '}';
	}
}