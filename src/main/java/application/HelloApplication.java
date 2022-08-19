package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
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
        nicknameColumn.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("nickName"));

        TableColumn tipoEstudianteColumn = new TableColumn<Estudiante,String>("Tipo Estudiante");
        tipoEstudianteColumn.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("tipoEstudiante"));


        table.getColumns().add(carneColumn);
        table.getColumns().add(nombreApellidosColumn);
        table.getColumns().add(correoColumn);
        table.getColumns().add(telefonoColumn);
        table.getColumns().add(nicknameColumn);
        table.getColumns().add(tipoEstudianteColumn);

        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        table.getItems().add(new Estudiante(2022437585,"Sebastian Naranjo","naranjomoras@gmail.com",72968521,"Naranjo","A"));
        table.getItems().add(new Estudiante(2022754385,"Luis Barboza","barbozaLuis@gmail.com",84539591,"Luis","B"));
        table.getItems().add(new Estudiante(2022789345,"Wainer Chavarria","ChavarriaWainer@gmail.com",88967024,"Way","B"));
        table.getItems().add(new Estudiante(2022123456,"Daniza Granados","DanizaGranados@gmail.com",83766048,"Dani","A"));
        table.getItems().add(new Estudiante(2022863845,"Steven Jafet","sjnaranjo@gmail.com",87696359,"Steven","B"));


        root.setCenter(table);


        Scene scene = new Scene(root, 920,300);
        primaryStage.setTitle("Registro!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        LectorCSV archivo = new LectorCSV();
        archivo.leerArhivocsv("C:\\Users\\Dani2\\OneDrive\\Escritorio\\Amor\\ejemplo_TEq.csv");
        launch();
    }
}