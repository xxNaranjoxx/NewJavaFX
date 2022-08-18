package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        BorderPane root = new BorderPane();

        TableView table = new TableView<Estudiante>();
        TableColumn firstNameColumn = new TableColumn<Estudiante,String>("First Name");
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("firstName"));

        TableColumn lastNameColumn = new TableColumn<Estudiante,String>("Last Name");
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("lastName"));

        TableColumn ageColumn = new TableColumn<Estudiante,String>("Age");
        ageColumn.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("age"));


        table.getColumns().add(firstNameColumn);
        table.getColumns().add(lastNameColumn);
        table.getColumns().add(ageColumn);

        root.setCenter(table);


        Scene scene = new Scene(root, 500,300);
        scene.getStylesheets().add("application/stylesheet.css");
        primaryStage.setTitle("Registro!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}