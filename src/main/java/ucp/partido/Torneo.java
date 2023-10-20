package ucp.partido;

import java.util.ArrayList;

public class Torneo {
    public Torneo(String nombre) {
        super();
        setNombre(nombre);
    }

    String nombre;
    ArrayList<Equipo> equipos= new ArrayList<>();
    ArrayList<Partido> partidos= new ArrayList<>();
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

    public Equipo getEquipo(int index) {
        return equipos.get(index);
    }

    public Equipo getEquipo(String nombre) {
        Equipo equipo= null;
        for (int i = 0; i < getEquipos().size(); i++) {
            if (getEquipo(i).getName().contains(nombre)) {
                equipo= getEquipo(i);
            }
        }
        return equipo;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }
    /**********************Fin encapsulacion**********************/

    public int equiposCantidad() {
        return getEquipos().size();
    }

    public int partidosCantidad() {
        return getPartidos().size();
    }

    public void agregar(Equipo equipo) {
        getEquipos().add(equipo);
    }

    public void agregar(Partido partido) {
        getPartidos().add(partido);
    }
}