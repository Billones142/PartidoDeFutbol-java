package ucp.partido;

import ucp.partido.interfaces.IImprimible;

public class Estadio implements IImprimible{
    public Estadio(String name, String ciudad, String pais) {
        super();
        setName(name);
        setCiudad(ciudad);
        setPais(pais);
    }

    String name;
    String ciudad;
    String pais;

    /********************Comienzo encapsulacion********************/
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getCiudad() {
        return ciudad;
    }

    private void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    private void setPais(String pais) {
        this.pais = pais;
    }
    /**********************Fin encapsulacion**********************/

    @Override
    public String toString() {
        return getName()+", "+getCiudad()+" ("+getPais()+")";
    }

    public String impresion() {
        return "[Estadio] " + getName() + " (" + getCiudad() +
        " - " + getPais() + ")";
    }
}