package CoreJavaExercisesOOP;

public class Carro extends Vehiculo {
    private int numPuertas;

    public Carro(String velocidad, String marca, String modelo, int numPuertas){
        super(velocidad, marca, modelo);
        this.numPuertas = numPuertas;
    }

    public void verNumPuertas(){
        System.out.println("EL carro tiene: " + numPuertas + " puertas");
    }

    @Override
    public void acelerar(){
        System.out.println("Acelerando a " + velocidad);
        Vehiculo v = new Vehiculo("100km/h", "mazda", "2001");
    }


}
