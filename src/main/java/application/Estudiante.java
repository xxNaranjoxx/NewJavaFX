package application;

public class Estudiante {

    private int carne;//encapsulamiento
    private String nombreApellidos;//encapsulamiento
    private String correo;//encapsulamiento
    private int telefono;//encapsulamiento
    private String nickName;//encapsulamiento
    private String tipoEstudiante;//encapsulamiento

    public Estudiante(int carne,String nombreApellidos,String correo, int telefono, String nickName, String tipoEstudiante) {
        this.carne = carne;
        this.nombreApellidos = nombreApellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.nickName = nickName;
        this.tipoEstudiante = tipoEstudiante;
    }//constructor con parametros

    public void llamar(){
        System.out.println("Hola desde" + this.carne+ this.nombreApellidos  + this.correo + this.telefono + this.nickName + this.tipoEstudiante);
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTipoEstudiante() {
        return tipoEstudiante;
    }

    public void setTipoEstudiante(String tipoEstudiante) {
        this.tipoEstudiante = tipoEstudiante;
    }
}//fin clase
