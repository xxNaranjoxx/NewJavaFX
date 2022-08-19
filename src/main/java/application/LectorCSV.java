package application;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;

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
        for (int i = 0; i < partes.length; i++){
            System.out.print(partes[i]+"  |  ");
        }//for
    }//imprimirLinea
}//clase
