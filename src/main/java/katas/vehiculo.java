package katas;

public class vehiculo {
    public String velocidad;
    public String marca;
    public String modelo;

    public vehiculo(String velocidad, String marca, String modelo){
        this.velocidad = velocidad;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println("Acelerando...");
    }

    public void frenar(){
        System.out.println("Frenando...");
    }

    public void cambiarMarcha(){
        System.out.println("Cambiando de marcha...");
    }
}


