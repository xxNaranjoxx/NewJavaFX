package application;

public class Estudiante {

    private String nombreApellidos;//encapsulamiento
    private String carne;//encapsulamiento
    private String correo;//encapsulamiento
    private String telefono;//encapsulamiento
    private String nickName;//encapsulamiento
    private String tipoEstudiante;//encapsulamiento

    public Estudiante(String nombreApellidos, String carne, String correo, String telefono, String nickName, String tipoEstudiante) {
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

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
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
