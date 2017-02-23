package presenter;

import view.LoginV;
import model.LoginM;

public class LoginP {
	    private LoginV loginV;
	    private LoginM loginM;

	    public LoginP(LoginV loginV, LoginM loginM) {
	        this.loginV = loginV;
	        this.loginM = loginM;
	    }

	    public void login(String pass) {
	        String result = "Helyes v�lasz!";
	        
	        if (loginM.getPassword().equals(pass)) {

	            result = "Ez is helyes v�lasz!";
	        }
	        loginV.updateStatusLabel(result);
	    }


}
