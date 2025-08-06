package CoreJavaExercisesOOP.Hotel;

import java.util.List;

public class HuespedVip extends Huesped{
    
    private int numVisitasAcumuladas;
    private int añosAntiguedad;
    double porcentajeDescuento;
    List<String> listaBeneficios;
    
    public HuespedVip(String nombre, int IdDocumento, int numVisitasAcumuladas, int añosAntiguedad, boolean esTitular) {
        super(nombre, IdDocumento, esTitular);
        this.numVisitasAcumuladas = numVisitasAcumuladas;
        this.añosAntiguedad = añosAntiguedad;
        aplicarDescuento();
        aplicarBeneficios();
    }
    
    public int verNumVisitasAcumuladas (){
        return numVisitasAcumuladas;
    }
    
    public int verAntiguedad(){
        return añosAntiguedad;
    }
    
    public void aplicarDescuento(){
        if(numVisitasAcumuladas <= 5){
            porcentajeDescuento = 0.2;
        } else if (numVisitasAcumuladas > 5 && numVisitasAcumuladas <= 8) {
            porcentajeDescuento = 0.3;
        }else if (numVisitasAcumuladas > 8) {
            porcentajeDescuento = 0.4;
        }
    }

    public void aplicarBeneficios (){
        if(numVisitasAcumuladas <= 5 && añosAntiguedad <= 2){
            listaBeneficios.add("1 día & 1 noche extra");
            listaBeneficios.add("1 desayuno gratuito el día que se quiera aplicar el beneficio para cada uno de los huespedes de la reserva");
            listaBeneficios.add("Descuento del 30% para la siguiente reserva");
        } else if (numVisitasAcumuladas > 5 && numVisitasAcumuladas <= 8 && añosAntiguedad > 2 & añosAntiguedad <= 4) {
            listaBeneficios.add("1 día & 1 noche extra");
            listaBeneficios.add("1 desayuno gratuito el día que se quiera aplicar el beneficio para cada uno de los huespedes de la reserva");
            listaBeneficios.add("1 almuerzo gratuito el día que se quiera aplicar el beneficio para cada uno de los huespedes de la reserva");
            listaBeneficios.add("1 comida gratuita el día que se quiera aplicar el beneficio para cada uno de los huespedes de la reserva");
            listaBeneficios.add("Descuento del 50% para la siguiente reserva");
        }
    }
}
