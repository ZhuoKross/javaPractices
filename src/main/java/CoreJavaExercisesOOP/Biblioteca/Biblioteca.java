package CoreJavaExercisesOOP.Biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Prestamo> prestamos = new ArrayList<>();

    public void agregarPrestamo(Prestamo prestamo) {
        try {
            prestamos.add(prestamo);
            System.out.println("Prestamo agregado correctamente");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void verPrestamos() {
        System.out.println("Prestamos: ");
        prestamos.forEach(System.out::println);
    }

    public void devolverPrestamo(Prestamo prestamo) {
        try {
            LocalDate fechaDevolución = LocalDate.now();

            if (fechaDevolución.isAfter(prestamo.verFechaDevolucion())) {
                System.out.println("Se aplicará una multa");
            } else {
                prestamos.remove(prestamo);
                System.out.println("Libro devuelto correctamente");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
