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
            System.out.print("Ingresa la ciudad de origen: ");
            String ciudadOrigen = control.nextLine();
            System.out.print("Ingresa la ciudad o país de destino: ");
            String destino = control.nextLine();
            System.out.print("Ingresa la hora de inicio del vuelo: ");
            String horaInicio = control.nextLine();
            System.out.print("Ingresa la hora aproximada de la llegada del vuelo: ");
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
            }

            System.out.println();

        }
    }
}