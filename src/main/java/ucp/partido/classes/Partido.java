package ucp.partido.classes;

import java.util.ArrayList;

public class Partido {
    public Partido(Equipo local, Equipo visitante, String name) {
        super();
        setLocal(local);
        setVisitante(visitante);
        setName(name);
    }

    public Partido(Estadio estadio, Equipo local, Equipo visitante, String name) {
        super();
        setEstadio(estadio);
        setLocal(local);
        setVisitante(visitante);
        setName(name);
    }

    private String name;
    private String fecha;
    private Equipo local;
    private Equipo visitante;
    private Estadio estadio;
    private ArrayList<TarjetaBase> tarjetas= new ArrayList<>();

    /********************Comienzo encapsulacion********************/
    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name+" "+getLocal().getAbreviatura()+"x"+getVisitante().getAbreviatura();
    }
    public void setFecha(String fecha) {
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

    public ArrayList<TarjetaBase> getTarjetas() {
        return tarjetas;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public Estadio getEstadio() {
        return estadio;
    }
    /**********************Fin encapsulacion**********************/
    
    public void agregar(TarjetaBase tarjeta) {
        getTarjetas().add(tarjeta);
    }

    public void name(TarjetaBase tarjeta) {
        getTarjetas().add(tarjeta);
    }

    public int tarjetasCantidad() {
        return getTarjetas().size();
    }
}
