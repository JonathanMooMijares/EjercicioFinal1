import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Locale;
import java.util.Scanner;
public class ControlVuelos {
    public static void main(String[] args) {
        Scanner control = new Scanner(System.in);


        boolean continuar = true;

        while (continuar){
            //Se crea un objeto avión para poder identificarlo
            System.out.print("Ingresa el modelo del avión: ");
            String modeloAvion = control.nextLine();
            Avion avion = new Avion(modeloAvion);

            //Se crea un piloto y se pide el nombre
            System.out.print("Ingresa el nombre del piloto: ");
            String nombrePiloto = control.nextLine();
            Piloto piloto = new Piloto(nombrePiloto);

            //Se imprime y crea un itinerario
            System.out.print("Ingresa la ciudad o país de origen: ");
            String ciudadOrigen = control.nextLine();
            System.out.print("Ingresa la ciudad o país de destino: ");
            String destino = control.nextLine();
            System.out.print("Ingresa la hora de inicio del vuelo (HH:mm): ");
            String horaInicio = control.nextLine();
            System.out.print("Ingresa la hora aproximada de la llegada del vuelo (HH:mm): ");
            String horaFin = control.nextLine();
            Itinerario itinerario = new Itinerario(ciudadOrigen, destino, horaInicio, horaFin);

            boolean disponible = true;
            // ...

            if (disponible) {
                // Asignar avión y piloto al itinerario
                itinerario.asignarAvion(avion);
                itinerario.asignarPiloto(piloto);

                // Mostrar la asignación de vuelos
                System.out.println("Asignación de vuelos:");
                System.out.println(itinerario);
            }

            System.out.print(" Quiere registrar otro vuelo? (S/N): ");
            String opcion = control.nextLine();



            //Compara la cadena de texto contra un objeto ignorando mayúsculas y minúsculas.
            // Devolverá true si las cadenas comparadas son iguales. En caso contrario devolverá false.
            if (opcion.equalsIgnoreCase("N")) {
                continuar = false;
            } else {
                System.out.println();
            }

            LocalTime horaIni = LocalTime.parse(horaInicio);
            LocalTime horaF = LocalTime.parse(horaFin);
            //LocalTime horaIni2 = horaIni;
            //LocalTime horaF2 =horaF;

            LocalTime horaIni2 = LocalTime.parse(horaInicio);
            LocalTime horaF2 = LocalTime.parse(horaFin);



            if (horaIni.compareTo(horaF2) < 0){

                System.out.println("No hay choque de horarios para el piloto " +nombrePiloto);
                if ( horaF.compareTo(horaIni2) > 0){

                }
            } else{
                System.out.println("Hay un choque de horarios para el piloto " +nombrePiloto);
            }
        }


    }
}