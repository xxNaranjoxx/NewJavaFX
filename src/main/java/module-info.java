module application.newjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javacsv;


    opens application to javafx.fxml;
    exports application;
}