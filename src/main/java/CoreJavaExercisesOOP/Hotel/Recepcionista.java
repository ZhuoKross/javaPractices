package CoreJavaExercisesOOP.Hotel;

import java.util.ArrayList;
import java.util.List;

public class Recepcionista implements Empleado{

    List<String> labores = new ArrayList<>(List.of("Hacer la reserva de nuevos huéspedes", "Registrar la reserva hecha por algún huésped", "Dar indicaciones a los huéspedes"));


    @Override
    public void labor() {
        labores.forEach(System.out::println);
    }
}
