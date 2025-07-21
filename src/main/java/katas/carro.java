package katas;

public class carro extends vehiculo{
    private int numPuertas;

    public carro (String velocidad, String marca, String modelo, int numPuertas){
        super(velocidad, marca, modelo);
        this.numPuertas = numPuertas;
    }

    public void verNumPuertas(){
        System.out.println("EL carro tiene: " + numPuertas + " puertas");
    }
}
