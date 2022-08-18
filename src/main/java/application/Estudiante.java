package application;

public class Estudiante {
    private String firstName;
    private String lastName;
    private int age;

    public Estudiante() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
    }//constructor sin parametros

    public Estudiante(String firstName,String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }//constructor con parametros

}//fin clase
