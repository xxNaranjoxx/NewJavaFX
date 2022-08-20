package application;

public class Estudiante_hijo extends Estudiante{ //herencia de la clase padre (Estudiante)
    private int nota1;//encapsulamiento
    private int nota2;//encapsulamiento


    public Estudiante_hijo(String nombreApellidos,double carne, String correo, int telefono, String nickName, String tipoEstudiante, int nota1, int nota2) {
        super(nombreApellidos,carne, correo, telefono, nickName, tipoEstudiante);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }//constructor



    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
}//clase hija
