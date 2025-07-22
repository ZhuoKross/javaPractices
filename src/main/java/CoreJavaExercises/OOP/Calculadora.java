package CoreJavaExercises.OOP;

public class Calculadora {

    public double calcularArea(double radio){
        double pi = 3.14;

        return pi * (Math.pow(radio, 2));
    }


    public double calcularArea(double base, double altura){
        return base * altura;
    }

    public double calcularArea(double base, double altura, String tipoFigura){
        //System.out.println(base * altura / 2);
        return base * altura / 2;
    }

    public double calcularArea(double lado, String tipoFigura){
        //System.out.println(Math.pow(lado, 2));
        return Math.pow(lado, 2);
    }

}
