
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import ucp.partido.Entrada;
import ucp.partido.EntradaBase;
import ucp.partido.EntradaVip;
import ucp.partido.Equipo;
import ucp.partido.Estadio;
import ucp.partido.Jugador;
import ucp.partido.Partido;
import ucp.partido.interfaces.IJugador;

public class Parcial_Test {
    @Test
    public void partido_con_fecha_ejercicio_ejemplo_11()
    {
        Equipo boca = new Equipo("Boca Juniors", "BOC");        
        Equipo sanLorenzo = new Equipo("San Lorenzo", "SAL");        

        Estadio estadioBombonera = new Estadio("Estadio Pedro Bidegain (El Nuevo Gasometro)", "Buenos Aires", "Argentina");

        Partido partido = new Partido(estadioBombonera, sanLorenzo, boca, "Primera Division 2023 | Fecha 12");

        Calendar calendar = Calendar.getInstance();

        calendar.set(2023, 10, 8); //Mes 10 = Noviembre (comienza en 0)
        Date fecha = calendar.getTime();
        partido.setFecha(fecha);

        assertEquals(fecha, partido.getFecha());
        assertEquals("08/11/2023", partido.getFechaFormateada());

         calendar.set(2023, 11, 13); //Mes 11 = Diciembre (comienza en 0)
        Date fecha2 = calendar.getTime();       
        partido.setFecha(fecha2);

        assertEquals(fecha2, partido.getFecha());
        assertEquals("13/12/2023", partido.getFechaFormateada());
    }

    @Test
    public void entradas_para_partido_ejercicio_ejemplo_12()
    {
        Equipo boca = new Equipo("Boca Juniors", "BOC");
        Equipo sanLorenzo = new Equipo("San Lorenzo", "SAL");

        Estadio estadioBombonera = new Estadio("Estadio Pedro Bidegain (El Nuevo Gasometro)", "Buenos Aires", "Argentina");

        Partido partido = new Partido(estadioBombonera, sanLorenzo, boca, "Primera Division 2023 | Fecha 12");


        Calendar calendar = Calendar.getInstance();
        calendar.set(2023, 10, 8); //Mes 10 = Noviembre (comienza en 0)
        Date fecha = calendar.getTime();

        partido.setFecha(fecha);

        Entrada entradaNormal = new Entrada(partido, "Mi Entrada", 4500);
        EntradaVip entradaVip = new EntradaVip(partido, "Entrada VIP", 25000);

        assertEquals("[Entrada] Partido SAL vs. BOC el 08/11/2023", entradaNormal.toString());
        assertEquals("[Entrada VIP] Partido SAL vs. BOC el 08/11/2023", entradaVip.toString());
        assertEquals(true, entradaVip.esVip());
    }

    @Test
    public void jugadores_ejercicio_ejemplo()
    {
        Equipo boca = new Equipo("Boca Juniors", "BOC");

        for (int i=1; i<=5; i++) {

            IJugador jugador = new Jugador("Demo ", i);
            jugador.setPosicion("Defensor");
            boca.agregar(jugador);
        }

        for (int i=6; i<=10; i++) {

            IJugador jugador = new Jugador("Demo ", i);
            jugador.setPosicion("Mediocampo");
            boca.agregar(jugador);
        }

        for (int i=11; i<=15; i++) {

            IJugador jugador = new Jugador("Demo ", i);
            jugador.setPosicion("Delantero");
            boca.agregar(jugador);
        }


        assertEquals(3, boca.cantidadMediocampoConNumerosMayorQue7());
    }
}