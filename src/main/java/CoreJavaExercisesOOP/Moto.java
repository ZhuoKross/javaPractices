package CoreJavaExercisesOOP;

public class Moto extends Vehiculo{

    private String tipofreno;

    public Moto(String marca, String modelo, String velocidad, String tipoFreno){
        super(marca, modelo, velocidad);
        this.tipofreno = tipoFreno;
    }


    @Override
    public void frenar(){
        System.out.println("Frenando con el freno: " + tipofreno);
    }

}
