package CoreJavaExercisesOOP.Hotel;

public class HabitacionDoble extends Habitacion{

    private boolean tieneNevera;
    private boolean tieneComedor;
    private boolean tieneCocina;
    private boolean tieneJacuzzi;
    private String tipoCama;
    private final int precio = 60;

    public HabitacionDoble(int numCamas, boolean tieneWiFi, boolean tieneTelevisor, int capacidadPersonas, boolean tieneNevera, boolean tieneComedor, boolean tieneCocina, boolean tieneJacuzzi, String tipoCama) {
        super(numCamas, tieneWiFi, tieneTelevisor, capacidadPersonas);
        this.tieneNevera = tieneNevera;
        this.tieneComedor = tieneComedor;
        this.tieneCocina = tieneCocina;
        this.tieneJacuzzi = tieneJacuzzi;
        this.tipoCama = tipoCama;
    }

    public int verPrecio (){
        return precio;
    }

}
