package CoreJavaExercisesOOP.Hotel;

public abstract class Habitacion {

    private int numCamas;
    private boolean tieneWiFi;
    private boolean tieneTelevisor;
    private int precio = 0;
    private int capacidadPersonas;

    public Habitacion(int numCamas, boolean tieneWiFi, boolean tieneTelevisor, int capacidadPersonas){
        this.numCamas = numCamas;
        this.tieneTelevisor = tieneTelevisor;
        this.tieneWiFi = tieneWiFi;
        this.capacidadPersonas = capacidadPersonas;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public boolean TieneTelevisor() {
        return tieneTelevisor;
    }

    public boolean TieneWiFi() {
        return tieneWiFi;
    }

    public int verPrecio(){
        return precio;
    }

    public int verCapacidadPersonas (){
        return capacidadPersonas;
    }
}
