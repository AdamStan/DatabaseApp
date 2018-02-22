package application.view;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainWindowController {
	@FXML
	private TextField usernameField;
	@FXML
	private TextField passwordField;
	@FXML
	public void handleExit(){
		System.exit(0);
	}
	public void handleLogin(){

	}
}
