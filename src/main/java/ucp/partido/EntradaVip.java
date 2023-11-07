package ucp.partido;

public class EntradaVip extends EntradaBase{
    public EntradaVip(Partido partido, String texto, int monto) {
        super(partido, texto, monto);
    }

    public boolean esVip() {
        return true;
    }

    public String toString() {
        String abreviaturaLocal= getPartido().getLocal().getAbreviatura();
        String abreviaturaVisitante= getPartido().getVisitante().getAbreviatura();
        return "[Entrada VIP] " + "Partido " + abreviaturaLocal + " vs. " 
        + abreviaturaVisitante + " el " + getPartido().getFechaFormateada();
    }
}