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
<<<<<<< HEAD
	            result = "Helyes jelszó!";
=======
	            result = "Talán Helyes jelszó";
>>>>>>> b3500107c1258a9dbe360091941e8bf75ca7e93e
	        }
	        loginV.updateStatusLabel(result);
	    }


}
