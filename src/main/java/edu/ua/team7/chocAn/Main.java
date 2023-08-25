package edu.ua.team7.chocAn;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        StorageServer storageServer = new StorageServer();
        VerifyOperator verifyOperator = new VerifyOperator(storageServer);

        boolean isVerified = verifyOperator.verifyOperator("OPER1234"); // Unique ID of the operator
        System.out.println("Operator verification result: " + isVerified);

        // Load login.fxml and create window
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 500);
        stage.setTitle("ChocAn");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
