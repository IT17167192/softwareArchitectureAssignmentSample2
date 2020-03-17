package osgi.mtit.auth;

public class AdminAuthorization {
	String username = "admin";
	String password = "admin";
	int invalidCounter = 0;
	
	public boolean authorizeAdmin(String un, String pass) {
		
		if(un.trim().equals(username) && pass.trim().equals(password)) {
			return true;
		}else {
			++invalidCounter;
			return false;
		}
	}
	
	public int getInvalidCounter() {
		return invalidCounter;
	}
}
