package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import static application.LectorCSV.listaEstudiantes;
import static java.lang.Integer.parseInt;

public class Main extends Application {
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

        table.getItems().add(new Estudiante("Sebastian Naranjo",2022437585,"naranjomoras@gmail.com",72968521,"Naranjo","A"));
        table.getItems().add(new Estudiante("Luis Barboza",2022754385,"barbozaLuis@gmail.com",84539591,"Luis","B"));
        table.getItems().add(new Estudiante("Wainer Chavarria",2022789345,"ChavarriaWainer@gmail.com",88967024,"Way","B"));
        table.getItems().add(new Estudiante("Daniza Granados",2022123456,"DanizaGranados@gmail.com",83766048,"Dani","A"));
        table.getItems().add(new Estudiante("Steven Jafet",2022863845,"sjnaranjo@gmail.com",87696359,"Steven","B"));


        root.setCenter(table);


        Scene scene = new Scene(root, 920,300);
        primaryStage.setTitle("Registro!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }//start



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> newStudent = listaEstudiantes(sc);
        File arhivoCSV = new File("./ejemplo_TEq.csv");
        try (FileWriter editor = new FileWriter(arhivoCSV);){
            for (Estudiante estudiante : newStudent){
                editor.write(estudiante.llamarArchivoCSV() + "\n");

            }//for

        } catch(Exception e){
            System.out.println("Se produjo un error");

        }//try-catch


        LectorCSV archivo = new LectorCSV();
        archivo.leerArhivocsv("./ejemplo_TEq.csv");
        //launch();
    }//fin main
}//fin clase