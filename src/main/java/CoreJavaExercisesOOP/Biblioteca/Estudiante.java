package CoreJavaExercisesOOP.Biblioteca;

public class Estudiante extends Usuario{

    private int semestre;
    private String carrera;
    private final int numLibros = 1;

    public Estudiante(String nombre, String facultad, int semestre, String carrera) {
        super(nombre, facultad);
        this.semestre = semestre;
        this.carrera = carrera;
    }
}
