package CoreJavaExercisesOOP.Hotel;

import java.time.LocalDate;
import java.util.List;

public class Reserva <T,T2> {

    private T listaHuespedes;
    private T2 habitaciones;
    private final LocalDate fechaInicioReserva = LocalDate.now();
    private LocalDate fechaTerminacionReserva;
    private double valorReserva;
    private final int valorPersona = 10;

    public Reserva(LocalDate fechaTerminacionReserva){
        this.fechaTerminacionReserva = fechaTerminacionReserva;
    }

    public void calcularValorReserva (){
        if(listaHuespedes instanceof Huesped && habitaciones instanceof Habitacion){
            int valorHabitacion = ((Habitacion) habitaciones).verPrecio();
            HuespedRegular huespedRegular = ((HuespedRegular) listaHuespedes);
            double descuentoPrimeraVez;
            System.out.println("La reserva es para una sola persona");
            System.out.println("El valor de la habitación es: " + valorHabitacion);
            valorReserva = valorHabitacion + valorPersona;

            if(listaHuespedes instanceof HuespedRegular){
                boolean esPrimeraVezReservando = huespedRegular.esPriveraVezReservando();
                if(esPrimeraVezReservando){
                    descuentoPrimeraVez = huespedRegular.porcentajeDescuento;
                    double valorDescuento = valorReserva * descuentoPrimeraVez;
                    valorReserva = valorReserva - valorDescuento;
                }else {
                    descuentoPrimeraVez = huespedRegular.porcentajeDescuento;
                }
            }
        }
    }

}
