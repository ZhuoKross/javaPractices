package CoreJavaExercisesOOP.Hotel;

import java.util.ArrayList;
import java.util.List;

public class Limpieza implements Empleado{

    List<String> labores = new ArrayList<>(List.of("Limpiar habitaciones", "Limpiar Baños de las habitaciones", "Tender camas", "Barrer"));

    @Override
    public void labor() {
        labores.forEach(System.out::println);
    }
}
