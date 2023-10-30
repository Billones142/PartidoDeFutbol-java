package ucp.partido;

public abstract class IntegranteDelVar extends ArbitroBase {
    String tipoDeAsistente;

    /********************Comienzo encapsulacion********************/
    public void setTipoDeAsistente(String tipoDeAsistente) {
        this.tipoDeAsistente = tipoDeAsistente;
    }

    public String getTipoDeAsistente() {
        return tipoDeAsistente;
    }
    /********************Fin encapsulacion********************/
}
