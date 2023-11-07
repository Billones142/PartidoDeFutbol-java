package ucp.partido;

public abstract class EntradaBase {
    public EntradaBase(Partido partido, String texto, int monto) {
        super();
        setPartido(partido);
        setTextoEntrada(texto);
        setMonto(monto);
    }


    Partido partido;
    String textoEntrada;
    int Monto;

    /********************Comienzo encapsulacion********************/
    protected void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Partido getPartido() {
        return partido;
    }

    protected void setTextoEntrada(String nombreEntrada) {
        this.textoEntrada = nombreEntrada;
    }

    public String getTextoEntrada() {
        return textoEntrada;
    }

    protected void setMonto(int monto) {
        Monto = monto;
    }

    public int getMonto() {
        return Monto;
    }
    /**********************Fin encapsulacion**********************/

    public abstract boolean esVip();

    public abstract String toString();
}
