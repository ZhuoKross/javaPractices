import CoreJavaExercisesOOP.Carro;
import CoreJavaExercisesOOP.ListOperations;
import CoreJavaExercisesOOP.Moto;
import Excel_Implementation.WriteFile;
import katas.KataExercises;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        KataExercises kataClass = new KataExercises();

        //ReadFile reader = new ReadFile();
        //reader.readExcel();

        WriteFile writer = new WriteFile();
        writer.writeFile();

        // CLASSES EXAMPLES
        String velocidad = "20km/h";
        String marca = "Wolkwaven";
        String modelo = "titan 2001";
        int numeroPuertas = 4;

        Carro Volkswaven = new Carro(velocidad, marca, modelo, numeroPuertas);

        Volkswaven.verNumPuertas();
        Volkswaven.acelerar(); // method overrided
        Volkswaven.cambiarMarcha();
        Volkswaven.frenar();


        String velocidadMoto = "50km/h";
        String marcaMoto = "Honda";
        String modeloMoto = "NX 190";
        String tipoFreno = "delantero";

        Moto HondaMoto = new Moto(marcaMoto, modeloMoto, velocidadMoto,tipoFreno);

        HondaMoto.frenar();


        // Overload Example
//        double areaCirculo = new Calculadora().calcularArea(5.0);
//        double areaRectangulo = new Calculadora().calcularArea(4,5);
//        double areaTriangulo = new Calculadora().calcularArea(6,8, "triangulo");
//        double areaCuadrado = new Calculadora().calcularArea(9, "Cuadrado");
//
//
//        System.out.println("El area del circulo es: " + areaCirculo);
//        System.out.println("El area de un rectangulo es: " + areaRectangulo);
//        System.out.println("El area de un triangulo es: " + areaTriangulo);
//        System.out.println("El area de un cuadrado es: " + areaCuadrado);


        //OPERATIONS WITH LIST
        ListOperations operations = new ListOperations();
        List<String> listExample = new ArrayList<>(List.of("itemA", "itemB", "itemC", "itemD"));
        List<String> listExample02 = new ArrayList<>(List.of("itemE", "itemF", "itemG"));

        String cadena = "hola".concat("mundo");

        operations.campareList(listExample, listExample02);
        operations.iterateList(listExample);
        operations.deleteItem(listExample, 0);
        operations.replaceItem(listExample, 2, "itemReplaced");
        operations.returnNumOfItems(listExample);
        operations.exitsElement(listExample02, "item4");

    }
}
