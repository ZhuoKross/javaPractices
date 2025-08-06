package CoreJavaExercisesOOP.Hotel;

public class HabitacionIndividual extends Habitacion {

    private boolean tieneNevera;
    private boolean tieneComedor;
    private final int precio = 30;


    public HabitacionIndividual(int numCamas, boolean tieneTelevisor, boolean tieneWiFi, boolean tieneNevera, boolean tieneComedor, int capacidadPersonas) {
        super(numCamas, tieneTelevisor, tieneWiFi, capacidadPersonas);
        this.tieneComedor = tieneComedor;
        this.tieneNevera = tieneNevera;
    }


    public boolean TieneNevera() {
        return tieneNevera;
    }

    public boolean TieneComedor() {
        return tieneComedor;
    }

    public int verPrecio(){
        return precio;
    }
}
