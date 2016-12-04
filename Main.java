package main;
import javax.swing.SwingUtilities;

import model.LoginM;
import presenter.LoginP;
import view.LoginV;


public class Main {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				LoginV loginV = new LoginV();
				LoginP loginP = new LoginP(loginV, new LoginM());
				
			}
		});

	}

}
