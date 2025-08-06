package CoreJavaExercisesOOP.Biblioteca;

import java.time.LocalDate;
import java.util.Date;

public class Libro {

    private String Titulo;
    private String Autor;
    private LocalDate FechaPublicacion;
    private String Genero;

    public Libro (String Titulo, String Autor, LocalDate FechaPublicacion, String Genero){
        this.Titulo = Titulo;
        this.Autor = Autor;
        this. FechaPublicacion = FechaPublicacion;
        this.Genero = Genero;
    }

    public String VerTitulo () {
        return this.Titulo;
    }
}
