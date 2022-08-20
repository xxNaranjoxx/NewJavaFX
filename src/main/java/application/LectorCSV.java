package application;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class LectorCSV {
    private BufferedReader lector;
    private String linea;
    private String partes[] = null;

    public void leerArhivocsv(String nombreArchivo){
        try{
            lector = new BufferedReader(new FileReader(nombreArchivo));
            while ((linea = lector.readLine()) != null){
                partes = linea.split(",");
                imprimirLinea();
                System.out.println();

            }//while
        }//try
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

    }//leerArhivocsv

    public void imprimirLinea(){
        for (int i = 1; i < partes.length; i++){
            System.out.print(partes[i]+"  |  ");
        }//for
    }//imprimirLinea

    public static ArrayList<Estudiante> listaEstudiantes(Scanner sc){
        ArrayList<Estudiante> newStudent = new ArrayList<Estudiante>();
        String nombreApellidos;
        double carne;
        String correo;
        double telefono;
        String nickName;
        String tipoEstudiante;
        Estudiante e;
        do {
            System.out.print("Nombre y Apellidos");
            nombreApellidos= sc.nextLine();
            if (!nombreApellidos.equalsIgnoreCase("FIN")){
                System.out.print("Carné");
                carne = Double.parseDouble(sc.nextLine());
                System.out.print("Correo");
                correo= sc.nextLine();
                System.out.print("Telefono");
                telefono= Integer.parseInt(sc.nextLine());
                System.out.print("NickName");
                nickName= sc.nextLine();
                System.out.print("Tipo de Estudiante");
                tipoEstudiante= sc.nextLine();
                e = new Estudiante(nombreApellidos,carne,correo,telefono,nickName,tipoEstudiante);
                newStudent.add(e);
            }//if

        } while (!nombreApellidos.equalsIgnoreCase("FIN"));{
            return newStudent;
        }//do while

    }//Arraylist
}//clase
