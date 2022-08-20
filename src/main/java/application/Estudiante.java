package application;

public class Estudiante {

    private String nombreApellidos;//encapsulamiento
    private double carne;//encapsulamiento
    private String correo;//encapsulamiento
    private double telefono;//encapsulamiento
    private String nickName;//encapsulamiento
    private String tipoEstudiante;//encapsulamiento

    public Estudiante(String nombreApellidos, double carne, String correo, double telefono, String nickName, String tipoEstudiante) {
        this.nombreApellidos = nombreApellidos;
        this.carne = carne;
        this.correo = correo;
        this.telefono = telefono;
        this.nickName = nickName;
        this.tipoEstudiante = tipoEstudiante;
    }//constructor con parametros

    public String llamarArchivoCSV(){
        return this.nombreApellidos + "," + this.carne + "," + this.correo + "," + this.telefono + "," + this.nickName + "," + this.tipoEstudiante;
    }//llamarArchivoCSV

    public double getCarne() {
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

    public double getTelefono() {
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
