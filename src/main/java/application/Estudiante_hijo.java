package application;

public class Estudiante_hijo extends Estudiante{ //herencia de la clase padre (Estudiante)
    private int nota1;//encapsulamiento
    private int nota2;//encapsulamiento


    public Estudiante_hijo(int carne, String nombreApellidos, String correo, int telefono, String nickName, String tipoEstudiante, int nota1, int nota2) {
        super(carne, nombreApellidos, correo, telefono, nickName, tipoEstudiante);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }//constructor

    @Override
    public void llamar() {
        System.out.println("Adios desde " + "" + this.getCarne() + "" + this.getNombreApellidos() + "" + this.getCorreo() + "" + this.getTelefono() + "" + this.getNickName() + "" + this.getTipoEstudiante() + "" + this.nota1 + " " + this.nota2);
    }

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
