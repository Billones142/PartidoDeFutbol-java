package ucp.partido;

public class Entrada extends EntradaBase{
    public Entrada(Partido partido, String texto, int monto) {
        super(partido, texto, monto);
    }

    public boolean esVip() {
        return false;
    }

    public String toString() {
        String abreviaturaLocal= getPartido().getLocal().getAbreviatura();
        String abreviaturaVisitante= getPartido().getVisitante().getAbreviatura();
        return "[Entrada] " + "Partido " + abreviaturaLocal + " vs. " 
        + abreviaturaVisitante + " el " + getPartido().getFechaFormateada();
    }
}
