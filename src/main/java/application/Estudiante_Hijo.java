package application;

public class Estudiante_Hijo extends Estudiante {//herencia
    private int notaProyecto1;
    private int notaProyecto2;
    private int notaProyecto3;
    private int notaExamen1;
    private int notaExamen2;
    private int notaQuiz1;
    private int notaQuiz2;
    private int notaQuiz3;
    private int notaTarea1;
    private int notaTarea2;
    private int notaTarea3;

    public Estudiante_Hijo(String nombreApellidos, int carne, String correo, int telefono, String nickName, String tipoEstudiante, int notaProyecto1, int notaProyecto2, int notaProyecto3, int promedioExamenes, int promedioQuices, int promedioTareas,
                           int notaExamen1,int notaExamen2,int notaQuiz1,int notaQuiz2,int notaQuiz3,int notaTarea1,int notaTarea2,int notaTarea3,int promedioProyectos, int promedioEvaluaciones, int promedioFinal) {
        super(nombreApellidos, carne, correo, telefono, nickName, tipoEstudiante, promedioExamenes, promedioQuices, promedioTareas, promedioProyectos, promedioEvaluaciones, promedioFinal);
        this.notaProyecto1 = notaProyecto1;
        this.notaProyecto2 = notaProyecto2;
        this.notaProyecto3 = notaProyecto3;
        this.notaExamen1 = notaExamen1;
        this.notaExamen2 = notaExamen2;
        this.notaQuiz1 = notaQuiz1;
        this.notaQuiz2 = notaQuiz2;
        this.notaQuiz3 = notaQuiz3;
        this.notaTarea1 = notaTarea1;
        this.notaTarea2 = notaTarea2;
        this.notaTarea3 = notaTarea3;

    }


    public int promedioExamenes(){
        return (this.notaExamen1 + this.notaExamen2)/2;
    }//promedioExamenes

    public int promedioQuices(){
        return (this.notaQuiz1 + this.notaQuiz2 + this.notaQuiz3)/3;
    }//promedioQuices

    public int promedioTareas(){
        return (this.notaTarea1 + this.notaTarea1 + this.notaTarea1)/3;
    }//promedioTareas


    public int notaPromedioEvaluaciones(){
        return (promedioExamenes() + promedioQuices() + promedioTareas())/3;
    }//notaPromedio

    public int notaPromedioFinal(){
        return (promedioExamenes() + promedioQuices() + promedioTareas())/3;
    }//notaPromedio

    public int notaPromedioProyecto(){
        return (this.notaProyecto1 + this.notaProyecto2 + this.notaProyecto3)/3;
    }

    public int getNotaExamen1() {
        return notaExamen1;
    }

    public void setNotaExamen1(int notaExamen1) {
        this.notaExamen1 = notaExamen1;
    }

    public int getNotaExamen2() {
        return notaExamen2;
    }

    public void setNotaExamen2(int notaExamen2) {
        this.notaExamen2 = notaExamen2;
    }

    public int getNotaQuiz1() {
        return notaQuiz1;
    }

    public void setNotaQuiz1(int notaQuiz1) {
        this.notaQuiz1 = notaQuiz1;
    }

    public int getNotaQuiz2() {
        return notaQuiz2;
    }

    public void setNotaQuiz2(int notaQuiz2) {
        this.notaQuiz2 = notaQuiz2;
    }

    public int getNotaQuiz3() {
        return notaQuiz3;
    }

    public void setNotaQuiz3(int notaQuiz3) {
        this.notaQuiz3 = notaQuiz3;
    }

    public int getNotaTarea1() {
        return notaTarea1;
    }

    public void setNotaTarea1(int notaTarea1) {
        this.notaTarea1 = notaTarea1;
    }

    public int getNotaTarea2() {
        return notaTarea2;
    }

    public void setNotaTarea2(int notaTarea2) {
        this.notaTarea2 = notaTarea2;
    }

    public int getNotaTarea3() {
        return notaTarea3;
    }

    public void setNotaTarea3(int notaTarea3) {
        this.notaTarea3 = notaTarea3;
    }
}//fin clase
