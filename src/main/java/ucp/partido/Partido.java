package ucp.partido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
    private Date fecha;

    private Equipo local;
    private Equipo visitante;
    
    private ArrayList<TarjetaBase> tarjetas= new ArrayList<>();
    
    private Estadio estadio;

    Arbitro arbitro;
    Arbitro arbitroAsistente;
    ArrayList<Arbitro> arbitroLinea= new ArrayList<>();



    /********************Comienzo encapsulacion********************/
    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name+" "+getLocal().getAbreviatura()+"x"+getVisitante().getAbreviatura();
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
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

    public String getFechaFormateada() {
        SimpleDateFormat date= new SimpleDateFormat("dd/MM/yyyy");
        return date.format(fecha);
    }
}