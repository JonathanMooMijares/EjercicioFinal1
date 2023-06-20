import java.time.LocalTime;
import java.util.Scanner;
public class ControlVuelos {
    public static void main(String[] args) {
        Scanner control = new Scanner(System.in);

        LocalTime horaIni2=null;
        LocalTime horaF2=null;

        boolean continuar = true; //banderas

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
            boolean disponible = true; //banderas

            LocalTime horaIni = LocalTime.parse(horaInicio);
            LocalTime horaF = LocalTime.parse(horaFin);

            if (horaIni2 != null && horaF2 != null) {
                if (horaIni.compareTo(horaF2) <= 0 && horaF.compareTo(horaIni2) >= 0) {

                    System.out.println("Hay choque de horarios para el piloto " + nombrePiloto);
                    continuar=false;
                } else {
                    System.out.println("No hay un choque de horarios para el piloto " + nombrePiloto);
                }
            }
            horaIni2 = horaIni;
            horaF2 = horaF;

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


        }
    }
}