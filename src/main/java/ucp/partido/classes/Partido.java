package ucp.partido.classes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Partido {
    public Partido(Equipo local, Equipo visitante, String fecha) {
        super();
        setFecha(fecha);
        setLocal(local);
        setVisitante(visitante);
    }

    private String name;
    private String fecha;
    private Equipo local;
    private Equipo visitante;
    ArrayList<Tarjeta> tarjetas= new ArrayList<>();

    /********************Comienzo encapsulacion********************/
    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    private void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    private void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getLocal() {
        return local;
    }

    private void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public ArrayList<Tarjeta> getTarjetas() {
        return tarjetas;
    }
    /**********************Fin encapsulacion**********************/
    
    public void agregar(Tarjeta tarjeta) { //TODO
        getTarjetas().add(tarjeta);
    }

    public int tarjetasCantidad() { //TODO
        return getTarjetas().size();
    }
}
