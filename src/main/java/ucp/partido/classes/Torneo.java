package ucp.partido.classes;

import java.util.ArrayList;

public class Torneo {
    public Torneo(String nombre) {
        super();
        setNombre(nombre);
    }

    String nombre;
    ArrayList<Equipo> equipos;
    Equipo ganador;

    /********************Comienzo encapsulacion********************/
    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo getGanador() {
        return ganador;
    }

    public void setGanador(Equipo ganador) {
        this.ganador = ganador;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public Equipo getEquipo(int index) { //TODO
        return equipos.get(index);
    }

    public Equipo getEquipo(String nombre) { //TODO
        Equipo equipo= null;
        for (int i = 0; i < getEquipos().size(); i++) {
            if (getEquipo(i).getNombre().contains(nombre)) {
                equipo= getEquipo(i);
            }
        }
        return equipo;
    }
    /**********************Fin encapsulacion**********************/
}