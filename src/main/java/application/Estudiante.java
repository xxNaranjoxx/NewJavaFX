package application;

public class Estudiante {

    private String nombreApellidos;//encapsulamiento
    private int carne;//encapsulamiento
    private String correo;//encapsulamiento
    private int telefono;//encapsulamiento
    private String nickName;//encapsulamiento
    private String tipoEstudiante;//encapsulamiento}
    private  int promedioExamenes;
    private int promedioQuices;
    private int promedioTareas;
    private int promedioProyectos;
    private int promedioEvaluaciones;
    private int promedioFinal;

    public Estudiante(String nombreApellidos, int carne, String correo, int telefono, String nickName, String tipoEstudiante, int promedioExamenes, int promedioQuices, int promedioTareas, int promedioProyectos, int promedioEvaluaciones, int promedioFinal) {
        this.nombreApellidos = nombreApellidos;
        this.carne = carne;
        this.correo = correo;
        this.telefono = telefono;
        this.nickName = nickName;
        this.tipoEstudiante = tipoEstudiante;
        this.promedioExamenes = promedioExamenes;
        this.promedioQuices = promedioQuices;
        this.promedioTareas = promedioTareas;
        this.promedioProyectos = promedioProyectos;
        this.promedioEvaluaciones = promedioEvaluaciones;
        this.promedioFinal = promedioFinal;


    }//constructor

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    public void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }

    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
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

    public int getPromedioExamenes() {
        return promedioExamenes;
    }

    public void setPromedioExamenes(int promedioExamenes) {
        this.promedioExamenes = promedioExamenes;
    }

    public int getPromedioQuices() {
        return promedioQuices;
    }

    public void setPromedioQuices(int promedioQuices) {
        this.promedioQuices = promedioQuices;
    }

    public int getPromedioTareas() {
        return promedioTareas;
    }

    public void setPromedioTareas(int promedioTareas) {
        this.promedioTareas = promedioTareas;
    }

    public int getPromedioProyectos() {
        return promedioProyectos;
    }

    public void setPromedioProyectos(int promedioProyectos) {
        this.promedioProyectos = promedioProyectos;
    }

    public int getPromedioEvaluaciones() {
        return promedioEvaluaciones;
    }

    public void setPromedioEvaluaciones(int promedioEvaluaciones) {
        this.promedioEvaluaciones = promedioEvaluaciones;
    }

    public int getPromedioFinal() {
        return promedioFinal;
    }

    public void setPromedioFinal(int promedioFinal) {
        this.promedioFinal = promedioFinal;
    }

    public String llamarArchivoCSV(){
        return this.nombreApellidos + "," + this.carne + "," + this.correo + "," + this.telefono + "," + this.nickName + "," + this.tipoEstudiante;
    }//llamarArchivoCSV

}//fin clase
