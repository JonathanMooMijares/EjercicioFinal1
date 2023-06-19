public class Itinerario {
    private String ciudadOrigen;
    private String destino;
    private String horaInicio;
    private String horaFin;
    private Avion avion;
    private Piloto piloto;

    public Itinerario (String ciudadOrigen, String destino, String horaInicio, String horaFin){
        this.ciudadOrigen=ciudadOrigen;
        this.destino=destino;
        this.horaInicio=horaInicio;
        this.horaFin=horaFin;
    }

    public void asignarAvion(Avion avion){
        this.avion=avion;
    }
    public Avion getAvion(){
        return avion;
    }

    public void asignarPiloto(Piloto piloto){
        this.piloto=piloto;
    }

    public Piloto getPiloto(){
        return piloto;
    }
    /*
    public boolean coincidenciasDeHorario(Itinerario otroItinerario){
        int horaInicio1=extraerHora(horaInicio);
        int minutoInicio1=extraerMinuto(horaInicio);
        int horaFin1= extraerHora()

        return false;
    }

     */
    public String toString(){
        return "Itinerario: " + ciudadOrigen + " --> " + destino + ", Hora de inicio: " + horaInicio + ", Hora de fin: " + horaFin +
                ", Avion: " + avion.getModelo() + ", Piloto: " +piloto.getNombre();
    }

}
