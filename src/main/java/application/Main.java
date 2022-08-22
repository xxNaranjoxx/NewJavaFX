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
        System.out.println("star 1");
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

        TableColumn promedioExamenesColumn = new TableColumn<Estudiante,String>("Promedio de Examenes");
        promedioExamenesColumn.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("promedioExamenes"));

        TableColumn promedioQuicesColumn = new TableColumn<Estudiante,String>("Promedio Quices");
        promedioQuicesColumn.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("promedioQuices"));

        TableColumn promedioTareasColumn = new TableColumn<Estudiante,String>("Promedio Tareas");
        promedioTareasColumn.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("promedioTareas"));



        table.getColumns().add(carneColumn);
        table.getColumns().add(nombreApellidosColumn);
        table.getColumns().add(correoColumn);
        table.getColumns().add(telefonoColumn);
        table.getColumns().add(nicknameColumn);
        table.getColumns().add(tipoEstudianteColumn);
        table.getColumns().add(promedioExamenesColumn);
        table.getColumns().add(promedioQuicesColumn);
        table.getColumns().add(promedioTareasColumn);

        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        System.out.println("star 2");


        List<Estudiante> estudiantes = ImportarDatos();

        for (Estudiante est2 : estudiantes){
            table.getItems().add(new Estudiante(est2.getNombreApellidos(), est2.getCarne(), est2.getCorreo(),est2.getTelefono(),est2.getNickName(), est2.getTipoEstudiante(),est2.getPromedioExamenes(),est2.getPromedioQuices(),est2.getPromedioTareas()));

            System.out.println(est2.getNombreApellidos() + " , " + est2.getCarne() + " , " +
                    est2.getCorreo() + " , " + est2.getTelefono() + " , " +
                    est2.getNickName() + " , " + est2.getTipoEstudiante() + " , " + est2.getPromedioExamenes()+
                    " , " + est2.getPromedioQuices() + " , " + est2.getPromedioTareas());

        }//for
        System.out.println("star 3");

//        table.getItems().add(new Estudiante("Sebastian","2022437585", "naranjomoras@gmail.com","72968521","Naranjo", "A","90","70","80"));
//        table.getItems().add(new Estudiante("Luis Barboza","2022754385","barbozaLuis@gmail.com","84539591","Luis","B","90","70","80"));
//        table.getItems().add(new Estudiante("Wainer Chavarria","2022789345","ChavarriaWainer@gmail.com","88967024","Way","B","90","70","80"));
//        table.getItems().add(new Estudiante( "Daniza Granados","2022123456","DanizaGranados@gmail.com","83766048","Dani","A","90","70","80"));
//        table.getItems().add(new Estudiante("Steven Jafet","2022863845","sjnaranjo@gmail.com","87696359","Steven","B","90","70","80"));
//        System.out.println("star 4");


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
            salidaCSV.write("Promedio de Examenes");
            salidaCSV.write("Promedio Quices");
            salidaCSV.write("Promedio Tareas");

            salidaCSV.endRecord();

            for (Estudiante est : estudiantes){
                salidaCSV.write(est.getNombreApellidos());
                salidaCSV.write(est.getCarne());
                salidaCSV.write(est.getCorreo());
                salidaCSV.write(est.getTelefono());
                salidaCSV.write(est.getNickName());
                salidaCSV.write(est.getTipoEstudiante());
                salidaCSV.write(est.getPromedioExamenes());
                salidaCSV.write(est.getPromedioQuices());
                salidaCSV.write(est.getPromedioTareas());

                salidaCSV.endRecord();

            }//for

            salidaCSV.close();
        }catch(IOException e){
            e.printStackTrace();

        }//try-catch

    }//exportarCSV

    public static List<Estudiante> ImportarDatos(){

        List<Estudiante> estudiantes = new ArrayList<Estudiante>();
        try{
            CsvReader leerEstudiantes = new CsvReader("Estudiantes.csv");
            leerEstudiantes.readHeaders();

            while(leerEstudiantes.readRecord()){
                String nombreApellidos = leerEstudiantes.get(0);
                String carne = leerEstudiantes.get(1);
                String correo = leerEstudiantes.get(2);
                String telefono = leerEstudiantes.get(3);
                String nickName = leerEstudiantes.get(4);
                String tipoEstudiante = leerEstudiantes.get(5);
                String promedioExamenes = leerEstudiantes.get(6);
                String promedioQuices = leerEstudiantes.get(7);
                String promedioTareas = leerEstudiantes.get(8);

                estudiantes.add(new Estudiante(nombreApellidos,carne,correo,telefono,nickName,tipoEstudiante,promedioExamenes,promedioQuices,promedioTareas));


            }//while

            leerEstudiantes.close();

//            for (Estudiante est2 : estudiantes){
//                System.out.println(est2.getNombreApellidos() + " , " + est2.getCarne() + " , " +
//                        est2.getCorreo() + " , " + est2.getTelefono() + " , " +
//                        est2.getNickName() + " , " + est2.getTipoEstudiante() + " , " + est2.getPromedioExamenes()+
//                        " , " + est2.getPromedioQuices() + " , " + est2.getPromedioTareas());
//
//            }//for

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();

        }//try-catch
        return estudiantes;
    }//ImportarDatos



    public static void main(String[] args) {

        List<Estudiante> estudiantes = new ArrayList<Estudiante>();

        estudiantes.add(new Estudiante("Sebastian Naranjo","2022437585","naranjomoras@gmail.com","72968521","Naranjo","A","90","70","80"));
        estudiantes.add(new Estudiante("Luis Barboza","2022754385","barbozaLuis@gmail.com","84539591","Luis","B","90","70","80"));
        estudiantes.add(new Estudiante("Wainer Chavarria","2022789345","ChavarriaWainer@gmail.com","88967024","Way","B","90","70","80"));
        estudiantes.add(new Estudiante("Daniza Granados","2022123456","DanizaGranados@gmail.com","83766048","Dani","A","90","70","80"));
        estudiantes.add(new Estudiante("Steven Jafet","2022863845","sjnaranjo@gmail.com","87696359","Steven","B","90","70","80"));
        estudiantes.add(new Estudiante("Maria Eugenia Mora Garro","2022936587","eugemoga@gmail.com","89459498","Maru","A","90","70","80"));
        estudiantes.add(new Estudiante("Wallter Guillermo Naranjo Umaña","2022145748","wgnu@gmail.com","87318048","Memo","B","80","40","70"));

        ExportarCSV(estudiantes);
        //ImportarDatos();

        launch();
    }//fin main
}//fin clase