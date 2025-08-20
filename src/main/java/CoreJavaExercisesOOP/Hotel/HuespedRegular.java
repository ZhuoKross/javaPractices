package CoreJavaExercisesOOP.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HuespedRegular extends Huesped{

    private boolean primeraVez;
    double porcentajeDescuento;
    List<String> listaBeneficios = new ArrayList<>();


    public HuespedRegular(String nombre, int IdDocumento, boolean primeraVez, boolean esTitular) {
        super(nombre, IdDocumento, esTitular);
        this.primeraVez = primeraVez;
        aplicarDescuento();
    }

    public boolean esPrimeraVezReservando (){
        return primeraVez;
    }

    public void aplicarDescuento (){
        if(primeraVez){
            porcentajeDescuento = 0.2;
            listaBeneficios.add("10% de descuento para la próxima reserva");
            listaBeneficios.add("1 desayuno gratuito el día que se quiera aplicar el beneficio para cada uno de los huespedes de la reserva");
        }else {
            porcentajeDescuento = 0.0;
        }
    }
}