module edu.ua.team7.chocAn {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens edu.ua.team7.chocAn to javafx.fxml;
    exports edu.ua.team7.chocAn;
}
