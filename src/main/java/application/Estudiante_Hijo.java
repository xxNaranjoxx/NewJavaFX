package application;

public class Estudiante_Hijo extends Estudiante {
    private String notaExamen1;
    private String notaExamen2;
    private String notaQuiz1;
    private String notaQuiz2;
    private String notaQuiz3;
    private String notaTarea1;
    private String notaTarea2;
    private String notaTarea3;

    public Estudiante_Hijo(String nombreApellidos, String carne, String correo, String telefono, String nickName, String tipoEstudiante, String promedioExamenes, String promedioQuices, String promedioTareas) {
        super(nombreApellidos, carne, correo, telefono, nickName, tipoEstudiante, promedioExamenes, promedioQuices, promedioTareas);
        this.notaExamen1 = notaExamen1;
        this.notaExamen2 = notaExamen2;
        this.notaQuiz1 = notaQuiz1;
        this.notaQuiz2 = notaQuiz2;
        this.notaQuiz3 = notaQuiz3;
        this.notaTarea1 = notaTarea1;
        this.notaTarea2 = notaTarea2;
        this.notaTarea3 = notaTarea3;

    }

    public String getNotaExamen1() {
        return notaExamen1;
    }

    public void setNotaExamen1(String notaExamen1) {
        this.notaExamen1 = notaExamen1;
    }

    public String getNotaExamen2() {
        return notaExamen2;
    }

    public void setNotaExamen2(String notaExamen2) {
        this.notaExamen2 = notaExamen2;
    }

    public String getNotaQuiz1() {
        return notaQuiz1;
    }

    public void setNotaQuiz1(String notaQuiz1) {
        this.notaQuiz1 = notaQuiz1;
    }

    public String getNotaQuiz2() {
        return notaQuiz2;
    }

    public void setNotaQuiz2(String notaQuiz2) {
        this.notaQuiz2 = notaQuiz2;
    }

    public String getNotaQuiz3() {
        return notaQuiz3;
    }

    public void setNotaQuiz3(String notaQuiz3) {
        this.notaQuiz3 = notaQuiz3;
    }

    public String getNotaTarea1() {
        return notaTarea1;
    }

    public void setNotaTarea1(String notaTarea1) {
        this.notaTarea1 = notaTarea1;
    }

    public String getNotaTarea2() {
        return notaTarea2;
    }

    public void setNotaTarea2(String notaTarea2) {
        this.notaTarea2 = notaTarea2;
    }

    public String getNotaTarea3() {
        return notaTarea3;
    }

    public void setNotaTarea3(String notaTarea3) {
        this.notaTarea3 = notaTarea3;
    }



    @Override
    public String toString() {
        return "Estudiante_Hijo{" +
                "notaExamen1='" + notaExamen1 + '\'' +
                ", notaExamen2='" + notaExamen2 + '\'' +
                ", notaQuiz1='" + notaQuiz1 + '\'' +
                ", notaQuiz2='" + notaQuiz2 + '\'' +
                ", notaQuiz3='" + notaQuiz3 + '\'' +
                ", notaTarea1='" + notaTarea1 + '\'' +
                ", notaTarea2='" + notaTarea2 + '\'' +
                ", notaTarea3='" + notaTarea3 + '\'' +
                '}';
    }
}//fin clase
