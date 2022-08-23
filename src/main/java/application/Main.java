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

        TableColumn promedioExamenesColumn = new TableColumn<Estudiante,String>("Promedio de Examenes");
        promedioExamenesColumn.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("promedioExamenes"));

        TableColumn promedioQuicesColumn = new TableColumn<Estudiante,String>("Promedio Quices");
        promedioQuicesColumn.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("promedioQuices"));

        TableColumn promedioTareasColumn = new TableColumn<Estudiante,String>("Promedio Tareas");
        promedioTareasColumn.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("promedioTareas"));

        TableColumn promedioProyectosColumn = new TableColumn<Estudiante,String>("Promedio Proyectos");
        promedioProyectosColumn.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("promedioProyectos"));

        TableColumn promedioEvaluacionesColumn = new TableColumn<Estudiante,String>("Promedio Evaluaciones");
        promedioEvaluacionesColumn.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("promedioEvaluaciones"));

        TableColumn promedioFinalColumn = new TableColumn<Estudiante,String>("Promedio Final");
        promedioFinalColumn.setCellValueFactory(new PropertyValueFactory<Estudiante,String>("promedioFinal"));



        table.getColumns().add(carneColumn);
        table.getColumns().add(nombreApellidosColumn);
        table.getColumns().add(correoColumn);
        table.getColumns().add(telefonoColumn);
        table.getColumns().add(nicknameColumn);
        table.getColumns().add(tipoEstudianteColumn);
        table.getColumns().add(promedioExamenesColumn);
        table.getColumns().add(promedioQuicesColumn);
        table.getColumns().add(promedioTareasColumn);
        table.getColumns().add(promedioProyectosColumn);
        table.getColumns().add(promedioEvaluacionesColumn);
        table.getColumns().add(promedioFinalColumn);


        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);


        List<Estudiante> estudiantes = ImportarDatos();

        for (Estudiante est2 : estudiantes){
            table.getItems().add(new Estudiante(est2.getNombreApellidos(), est2.getCarne(), est2.getCorreo(),est2.getTelefono(),est2.getNickName(), est2.getTipoEstudiante(),
                     est2.getPromedioExamenes(),est2.getPromedioQuices(),est2.getPromedioTareas(), est2.getPromedioProyectos(), est2.getPromedioEvaluaciones(),est2.getPromedioFinal()));

            System.out.println(est2.getNombreApellidos() + " , " + est2.getCarne() + " , " +
                    est2.getCorreo() + " , " + est2.getTelefono() + " , " +
                    est2.getNickName() + " , " + est2.getTipoEstudiante() + " , " + est2.getPromedioExamenes()+
                    " , " + est2.getPromedioQuices() + " , " + est2.getPromedioTareas() + " , " + est2.getPromedioProyectos() + " , " +
                    est2.getPromedioEvaluaciones() + " , " + est2.getPromedioFinal());

        }//for

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
            salidaCSV.write("Promedio Proyectos");
            salidaCSV.write("Promedio Evaluaciones");
            salidaCSV.write("Promedio Final");

            salidaCSV.endRecord();

            for (Estudiante est : estudiantes){
                salidaCSV.write(est.getNombreApellidos());
                salidaCSV.write(String.valueOf(est.getCarne()));
                salidaCSV.write(est.getCorreo());
                salidaCSV.write(String.valueOf(est.getTelefono()));
                salidaCSV.write(est.getNickName());
                salidaCSV.write(est.getTipoEstudiante());
                salidaCSV.write(String.valueOf(est.getPromedioExamenes()));
                salidaCSV.write(String.valueOf(est.getPromedioQuices()));
                salidaCSV.write(String.valueOf(est.getPromedioTareas()));
                salidaCSV.write(String.valueOf(est.getPromedioProyectos()));
                salidaCSV.write(String.valueOf(est.getPromedioEvaluaciones()));
                salidaCSV.write(String.valueOf(est.getPromedioFinal()));

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
                String promedioProyectos = leerEstudiantes.get(9);
                String promedioEvaluaciones = leerEstudiantes.get(10);
                String promedioFinal = leerEstudiantes.get(11);

                estudiantes.add(new Estudiante(nombreApellidos,Integer.parseInt(carne),correo,Integer.parseInt(telefono),nickName,tipoEstudiante,Integer.parseInt(promedioExamenes),Integer.parseInt(promedioQuices),Integer.parseInt(promedioTareas),Integer.parseInt(promedioProyectos),Integer.parseInt(promedioEvaluaciones),Integer.parseInt(promedioFinal)));


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


        Estudiante_Hijo promedioEstudiante1 = new Estudiante_Hijo("Sebastian Naranjo",2022437585,"naranjomoras@gmail.com",72968521,"Naranjo","A",90,70,80,0,0,0,70,50,40,50,100,30,90,50,0,0,0);
        int nota_promedioExamenes = promedioEstudiante1.promedioExamenes();
        int nota_promedioQuices = promedioEstudiante1.promedioQuices();
        int nota_promedioTareas = promedioEstudiante1.promedioTareas();
        int nota_promedioProyecto = promedioEstudiante1.notaPromedioProyecto();
        int nota_promedioEvaluaciones = promedioEstudiante1.notaPromedioEvaluaciones();
        int nota_promedioFinal = promedioEstudiante1.notaPromedioFinal();


        Estudiante_Hijo promedioEstudiante2 = new Estudiante_Hijo("Luis Barboza",2022754385,"barbozaLuis@gmail.com",84539591,"Luis","B",90,70,80,80,40,80,100,95,85,75,60,100,100,98,0,0,0);
        int nota_promedioExamenes2 = promedioEstudiante2.promedioExamenes();
        int nota_promedioQuices2 = promedioEstudiante2.promedioQuices();
        int nota_promedioTareas2 = promedioEstudiante2.promedioTareas();
        int nota_promedioProyecto2 = promedioEstudiante2.notaPromedioProyecto();
        int nota_promedioEvaluaciones2 = promedioEstudiante2.notaPromedioEvaluaciones();
        int nota_promedioFinal2 = promedioEstudiante2.notaPromedioFinal();


        Estudiante_Hijo promedioEstudiante3 = new Estudiante_Hijo("Wainer Chavarria",2022789345,"ChavarriaWainer@gmail.com",88967024,"Way","B",90,70,80,70,90,50,50,85,85,30,90,100,75,90,0,0,0);
        int nota_promedioExamenes3 = promedioEstudiante3.promedioExamenes();
        int nota_promedioQuices3 = promedioEstudiante3.promedioQuices();
        int nota_promedioTareas3 = promedioEstudiante3.promedioTareas();
        int nota_promedioProyecto3 = promedioEstudiante3.notaPromedioProyecto();
        int nota_promedioEvaluaciones3 = promedioEstudiante3.notaPromedioEvaluaciones();
        int nota_promedioFinal3 = promedioEstudiante3.notaPromedioFinal();


        Estudiante_Hijo promedioEstudiante4 = new Estudiante_Hijo("Daniza Granados",2022123456,"DanizaGranados@gmail.com",83766048,"Dani","A",90,70,80,90,80,100,60,75,80,60,40,90,75,70,80,90,70);
        int nota_promedioExamenes4 = promedioEstudiante4.promedioExamenes();
        int nota_promedioQuices4 = promedioEstudiante4.promedioQuices();
        int nota_promedioTareas4 = promedioEstudiante4.promedioTareas();
        int nota_promedioProyecto4 = promedioEstudiante4.notaPromedioProyecto();
        int nota_promedioEvaluaciones4 = promedioEstudiante4.notaPromedioEvaluaciones();
        int nota_promedioFinal4 = promedioEstudiante4.notaPromedioFinal();

        Estudiante_Hijo promedioEstudiante5 = new Estudiante_Hijo("Maria Eugenia Mora Garro",2022936587,"eugemoga@gmail.com",89459498,"Maru","A",90,70,80,90,80,100,85,65,85,65,45,90,70,100,20,40,50);
        int nota_promedioExamenes5 = promedioEstudiante5.promedioExamenes();
        int nota_promedioQuices5 = promedioEstudiante5.promedioQuices();
        int nota_promedioTareas5 = promedioEstudiante5.promedioTareas();
        int nota_promedioProyecto5 = promedioEstudiante5.notaPromedioProyecto();
        int nota_promedioEvaluaciones5 = promedioEstudiante5.notaPromedioEvaluaciones();
        int nota_promedioFinal5 = promedioEstudiante5.notaPromedioFinal();


        Estudiante_Hijo promedioEstudiante6 = new Estudiante_Hijo("Wallter Guillermo Naranjo Umaña",2022145748,"wgnu@gmail.com",87318048,"Memo","B",0,0,0,90,80,100,75,100,75,55,90,45,80,60,50,80,90);
        int nota_promedioExamenes6 = promedioEstudiante6.promedioExamenes();
        int nota_promedioQuices6 = promedioEstudiante6.promedioQuices();
        int nota_promedioTareas6 = promedioEstudiante6.promedioTareas();
        int nota_promedioProyecto6 = promedioEstudiante6.notaPromedioProyecto();
        int nota_promedioEvaluaciones6 = promedioEstudiante6.notaPromedioEvaluaciones();
        int nota_promedioFinal6 = promedioEstudiante6.notaPromedioFinal();





        List<Estudiante> estudiantes = new ArrayList<Estudiante>();

        estudiantes.add(new Estudiante("Sebastian Naranjo",2022437585,"naranjomoras@gmail.com",72968521,"Naranjo","A",nota_promedioExamenes,nota_promedioQuices,nota_promedioTareas,nota_promedioProyecto,nota_promedioEvaluaciones,nota_promedioFinal));
        estudiantes.add(new Estudiante("Luis Barboza",2022754385,"barbozaLuis@gmail.com",84539591,"Luis","B",nota_promedioExamenes2,nota_promedioQuices2,nota_promedioTareas2,nota_promedioProyecto2,nota_promedioEvaluaciones2,nota_promedioFinal2));
        estudiantes.add(new Estudiante("Wainer Chavarria",2022789345,"ChavarriaWainer@gmail.com",88967024,"Way","B",nota_promedioExamenes3,nota_promedioQuices3,nota_promedioTareas3,nota_promedioProyecto3,nota_promedioEvaluaciones3,nota_promedioFinal3));
        estudiantes.add(new Estudiante("Daniza Granados",2022123456,"DanizaGranados@gmail.com",83766048,"Dani","A",nota_promedioExamenes4,nota_promedioQuices4,nota_promedioTareas4,nota_promedioProyecto4,nota_promedioEvaluaciones4,nota_promedioFinal4));
        estudiantes.add(new Estudiante("Maria Eugenia Mora Garro",2022936587,"eugemoga@gmail.com",89459498,"Maru","A",nota_promedioExamenes5,nota_promedioQuices5,nota_promedioTareas5,nota_promedioProyecto5,nota_promedioEvaluaciones5,nota_promedioFinal5));
        estudiantes.add(new Estudiante("Wallter Guillermo Naranjo Umaña",2022145748,"wgnu@gmail.com",87318048,"Memo","B",nota_promedioExamenes6,nota_promedioQuices6,nota_promedioTareas6,nota_promedioProyecto6,nota_promedioEvaluaciones6,nota_promedioFinal6));

        ExportarCSV(estudiantes);

        launch();


    }//fin main
}//fin clase