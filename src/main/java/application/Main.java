package application;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

        table.getItems().add(new Estudiante("Sebastian Naranjo","2022437585","naranjomoras@gmail.com","72968521","Naranjo","A"));
        table.getItems().add(new Estudiante("Luis Barboza","2022754385","barbozaLuis@gmail.com","84539591","Luis","B"));
        table.getItems().add(new Estudiante("Wainer Chavarria","2022789345","ChavarriaWainer@gmail.com","88967024","Way","B"));
        table.getItems().add(new Estudiante("Daniza Granados","2022123456","DanizaGranados@gmail.com","83766048","Dani","A"));
        table.getItems().add(new Estudiante("Steven Jafet","2022863845","sjnaranjo@gmail.com","87696359","Steven","B"));


        root.setCenter(table);


        Scene scene = new Scene(root, 920,300);
        primaryStage.setTitle("Registro!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }//start

    public static  void ExportarCSV(List<Estudiante> estudiantes) {
        String salidaArchivo = "Estudiantes.csv";
        boolean existe = new File(salidaArchivo).exists();

        if (existe){
            File archivoEstudiantes = new File(salidaArchivo);
            archivoEstudiantes.delete();

        }//if

        try{
            CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true), ',');
            salidaCSV.write("Nombre y apellidos");
            salidaCSV.write("Carne");
            salidaCSV.write("Correo");
            salidaCSV.write("Telefono");
            salidaCSV.write("NickName");
            salidaCSV.write("Tipo de Estudiante");

            salidaCSV.endRecord();

            for (Estudiante est : estudiantes){
                salidaCSV.write(est.getNombreApellidos());
                salidaCSV.write(est.getCarne());
                salidaCSV.write(est.getCorreo());
                salidaCSV.write(est.getTelefono());
                salidaCSV.write(est.getNickName());
                salidaCSV.write(est.getTipoEstudiante());

                salidaCSV.endRecord();

            }//for

            salidaCSV.close();
        }catch(IOException e){
            e.printStackTrace();

        }//try-catch

    }//exportarCSV

    public static void  ImportarDatos(){
        try{
            List<Estudiante> estudiantes = new ArrayList<Estudiante>();
            CsvReader leerEstudiantes = new CsvReader("Estudiantes.csv");
            leerEstudiantes.readHeaders();

            while(leerEstudiantes.readRecord()){
                String nombreApellidos = leerEstudiantes.get(0);
                String carne = leerEstudiantes.get(1);
                String correo = leerEstudiantes.get(2);
                String telefono = leerEstudiantes.get(3);
                String nickName = leerEstudiantes.get(4);
                String tipoEstudiante = leerEstudiantes.get(5);

                estudiantes.add(new Estudiante(nombreApellidos,carne,correo,telefono,nickName,tipoEstudiante));


            }//while

            leerEstudiantes.close();

            for (Estudiante est2 : estudiantes){
                System.out.println(est2.getNombreApellidos() + " , " + est2.getCarne() + " , " +
                        est2.getCorreo() + " , " + est2.getTelefono() + " , " +
                        est2.getNickName() + " , " + est2.getTipoEstudiante());

            }


        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();

        }//try-catch
    }//ImportarDatos



    public static void main(String[] args) {

        List<Estudiante> estudiantes = new ArrayList<Estudiante>();

        estudiantes.add(new Estudiante("Sebastian Naranjo","2022437585","naranjomoras@gmail.com","72968521","Naranjo","A"));
        estudiantes.add(new Estudiante("Luis Barboza","2022754385","barbozaLuis@gmail.com","84539591","Luis","B"));
        estudiantes.add(new Estudiante("Wainer Chavarria","2022789345","ChavarriaWainer@gmail.com","88967024","Way","B"));
        estudiantes.add(new Estudiante("Daniza Granados","2022123456","DanizaGranados@gmail.com","83766048","Dani","A"));
        estudiantes.add(new Estudiante("Steven Jafet","2022863845","sjnaranjo@gmail.com","87696359","Steven","B"));

                ExportarCSV(estudiantes);
                ImportarDatos();

        /*
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
         */
        //launch();
    }//fin main
}//fin clase