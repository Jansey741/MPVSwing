package model;

public class LoginM {
	private String password;
	 
	
	public LoginM() {
		this.password = "password";
	}
		     
    public void setPassword(String pass) {
    	this.password = pass;
    }
     
    public String getPassword() {
        return this.password;
    }
}
