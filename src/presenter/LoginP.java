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
	        String result = Constants.C_HELYES_VALASZ;
	        
	        if ( pass.equals(loginM.getPassword())  ) {
	            result = Constants.C_EZ_IS_HELYES_VALASZ;
	        }
	        loginV.updateStatusLabel(result);
	    }


}
