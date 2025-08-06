package CoreJavaExercisesOOP.Biblioteca;

import java.time.LocalDate;

public class Prestamo {

    private Usuario usuario;
    private Libro libro;
    private LocalDate fechaPrestamo = LocalDate.now();
    private LocalDate fechaDevolucion;

    public Prestamo(Usuario usuario, Libro libro, LocalDate fechaDevolucion){
        this.usuario = usuario;
        this.libro = libro;
        this.fechaDevolucion = fechaDevolucion;
    }


    @Override
    public String toString(){

        return "usuario: " + usuario.nombre + "\n" + "Libro: " + libro.VerTitulo() + "\n" + "fechaDevolución: " + fechaDevolucion;
    }


    public LocalDate verFechaDevolucion (){
        return this.fechaDevolucion;
    }
}
