package CoreJavaExercisesOOP.Hotel;

public class HabitacionSuite extends Habitacion{

    private boolean tieneNevera;
    private boolean tieneComedor;
    private boolean tieneCocina;
    private boolean tieneSalaDeEstar;
    private boolean tieneJacuzzi;
    private String tipoCama;
    private final int precio = 100;

    public HabitacionSuite(int numCamas, boolean tieneWiFi, boolean tieneTelevisor, int capacidadPersonas, boolean tieneNevera, boolean tieneComedor, boolean tieneCocina, boolean tieneSalaDeEstar, boolean tieneJacuzzi, String tipoCama) {
        super(numCamas, tieneWiFi, tieneTelevisor, capacidadPersonas);
        this.tieneNevera = tieneNevera;
        this.tieneComedor = tieneComedor;
        this.tieneCocina = tieneCocina;
        this.tieneSalaDeEstar = tieneSalaDeEstar;
        this.tieneJacuzzi = tieneJacuzzi;
        this.tipoCama = tipoCama;
    }

    public boolean TieneNevera() {
        return tieneNevera;
    }

    public boolean TieneJacuzzi() {
        return tieneJacuzzi;
    }

    public boolean TieneCocina() {
        return tieneCocina;
    }

    public boolean TieneSalaDeEstar() {
        return tieneSalaDeEstar;
    }

    public boolean TieneComedor() {
        return tieneComedor;
    }

    public int verPrecio(){
        return precio;
    }
}
