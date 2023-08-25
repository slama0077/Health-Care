package edu.ua.team7.chocAn;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ComboBox;

public class Controller {
    @FXML
    private TextField usernameTextField;
    private PasswordField passwordField;
    private Label errorLoginText;
    private Button loginButton;
    public void loginButtonOnAction(ActionEvent e) {
        errorLoginText.setText("Login failed, incorrect credentials");
    }

    @FXML
    private ComboBox<String> userTypeDropdown;
    private String userType;
    public void dropdownUserSelect(ActionEvent e) {
        userType = userTypeDropdown.getValue();
    }

}