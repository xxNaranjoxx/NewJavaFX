package application;

public class Estudiante_hijo extends Estudiante{
    int nota1;
    int nota2;


    public Estudiante_hijo(int carne, String nombreApellidos, String correo, int telefono, String nickName, String tipoEstudiante, int nota1, int nota2) {
        super(carne, nombreApellidos, correo, telefono, nickName, tipoEstudiante);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }//constructor

    @Override
    public void llamar() {
        System.out.println("Adios desde " + "" +this.carne+ "" + this.nombreApellidos + "" + this.correo + "" + this.telefono + "" + this.nickName + "" + this.tipoEstudiante + "" + this.nota1 + " " + this.nota2);
    }
}//clase hija
