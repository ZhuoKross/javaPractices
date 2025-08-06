package CoreJavaExercisesOOP.Biblioteca;

public class Profesor extends Usuario{

    private String carrera;

    public Profesor(String nombre, String facultad, String carrera) {
        super(nombre, facultad);
        this.carrera = carrera;
    }
}
