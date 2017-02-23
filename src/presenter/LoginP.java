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
	        String result = "Helyestelen jelszó";
	        
	        if (loginM.getPassword().equals(pass)) {
	            result = "Talán Helyes jelszó";
	        }
	        loginV.updateStatusLabel(result);
	    }


}
