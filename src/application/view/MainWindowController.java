package application.view;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MainWindowController {
	@FXML
	private TextField usernameField;
	@FXML
	private PasswordField passwordField;
	@FXML
	public void handleExit(){
		System.exit(0);
	}
	public void handleLogin(){
		String login = usernameField.getText();
		String password = passwordField.getText();

		//we have to search table of user...
		//check theirs roles
		//load new view
	}
}
