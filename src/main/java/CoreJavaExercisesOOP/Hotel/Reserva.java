package CoreJavaExercisesOOP.Hotel;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Reserva {

    private final LocalDate fechaInicioReserva = LocalDate.now();
    private LocalDate fechaTerminacionReserva;
    private double valorReserva;
    private final int valorPersona = 10;


    public Reserva(LocalDate fechaTerminacionReserva){
        this.fechaTerminacionReserva = fechaTerminacionReserva;
    }


    public <T, U> void calcularValorReserva (T huesped, U habitacion){
        if(huesped instanceof Huesped hu && habitacion instanceof Habitacion hb){
            System.out.println("La reserva es para una sola persona");
            int valorHabitacion = hb.verPrecio();
            System.out.println("El valor de la habitación es: " + valorHabitacion);
            double descuentoPrimeraVez;
            System.out.println("Valor original de la reserva: " + (valorHabitacion + valorPersona));

            if(hu instanceof HuespedRegular huespedRegular){
                valorReserva = valorHabitacion + valorPersona;
                boolean esPrimeraVezReservando = huespedRegular.esPrimeraVezReservando();
                descuentoPrimeraVez = huespedRegular.porcentajeDescuento;
                if(esPrimeraVezReservando){
                    double valorDescuento = valorReserva * descuentoPrimeraVez;
                    valorReserva = valorReserva - valorDescuento;
                    System.out.println("El valor de la reserva es: " + valorReserva + " - " + "valor del descuento: " + valorDescuento);
                }
            }

        }
    }
}
