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
        TableColumn carneColumn = new TableColumn<Estudiante,String>("Carné");
        carneColumn.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("carne"));

        TableColumn nombreApellidosColumn = new TableColumn<Estudiante,String>("Nombre y Apellidos");
        nombreApellidosColumn.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("nombreApellidos"));

        TableColumn correoColumn = new TableColumn<Estudiante,String>("Correo");
        correoColumn.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("correo"));

        TableColumn telefonoColumn = new TableColumn<Estudiante,String>("Telefono");
        telefonoColumn.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("telefono"));

        TableColumn nicknameColumn = new TableColumn<Estudiante,String>("NickName");
        nicknameColumn.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("nickname"));

        TableColumn tipoEstudianteColumn = new TableColumn<Estudiante,String>("Tipo Estudiante");
        tipoEstudianteColumn.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("tipoEstudiante"));


        table.getColumns().add(carneColumn);
        table.getColumns().add(nombreApellidosColumn);
        table.getColumns().add(correoColumn);
        table.getColumns().add(telefonoColumn);
        table.getColumns().add(nicknameColumn);
        table.getColumns().add(tipoEstudianteColumn);

        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        table.getItems().add(new Estudiante_hijo(2022437585," Sebastian Naranjo Mora ", " naranjomoras@gmail.com ",  72968521 ," Hola "," A ",70,80));

        root.setCenter(table);


        Scene scene = new Scene(root, 850,300);
        primaryStage.setTitle("Registro!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Estudiante_hijo est3 = new Estudiante_hijo(2022437585," Sebastian Naranjo Mora ", " naranjomoras@gmail.com ",  72968521 ," Naranjo "," A ",70,80);
        est3.llamar();
        launch();
    }
}