package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import presenter.LoginP;

public class LoginV {
	
		private LoginP loginPresenter; 
	    private JLabel statusLabel;
	    private JTextField inputField;
	    
	    public LoginV() {
	        createUI();
	    }
	    
	    private void createUI() {
	        statusLabel = new JLabel("Jelszó: ");
	        inputField = new JTextField(20);
	        JButton loginButton = new JButton("Login");
	        
	        loginButton.addActionListener(new ActionListener() {				
				@Override
				public void actionPerformed(ActionEvent e) {
					loginPresenter.login(inputField.getText());
				}
			});
	        
	        Box topBox = Box.createHorizontalBox();
	        topBox.add(statusLabel);
	        topBox.add(Box.createHorizontalStrut(5));
	        topBox.add(inputField);
	        topBox.add(Box.createHorizontalStrut(5));
	        topBox.add(loginButton);
	        
	        JFrame frame = new JFrame("MVP Swing Keret elsõ lépések");
	        ((JPanel)frame.getContentPane()).setBackground(Color.white);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.add(topBox, BorderLayout.NORTH);
	        frame.pack();
	        frame.setVisible(true);
	        frame.setLocationRelativeTo(null);
	    }
	    
	    public void setPresenter(LoginP pres) {
	        loginPresenter = pres;
	    }
	    
	    public void updateStatusLabel(String text) {
	        statusLabel.setText(text);
	    }

	
}
