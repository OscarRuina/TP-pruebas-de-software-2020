package Ruina;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import copControl.Posicion;

public class TestUnitarioPosicion {
    Posicion posicion;
	Posicion otraPosicionIgual;
	Posicion otraPosicionDistancia;
	int i,j,k,l,m,n;
	double distancia;
	@Before
	public void setUp() throws Exception {
		i = 5;
		j = 5;
		k = 5;
		l = 5;
		posicion = new Posicion(i,j);
		otraPosicionIgual = new Posicion(k,l);
		m = 10;
		n = 15;
		otraPosicionDistancia = new Posicion(m,n);
		distancia = Math.hypot(Math.abs(otraPosicionDistancia.getCoordenadaY() - posicion.getCoordenadaY()), 
				Math.abs(otraPosicionDistancia.getCoordenadaX() - posicion.getCoordenadaX()));
	}
    //2
	@Test
	public void testIgualA() {
		assertTrue("Fallo el metodo igualA(Posicion otraPosicion)" , 
				posicion.igualA(otraPosicionIgual) == true);
	}
	//3
	@Test
	public void testDistanciaHasta(){
		assertTrue("Fallo el metodo distanciaHasta(Posicion otraPosicion)" , 
				posicion.distanciaHasta(otraPosicionDistancia) == distancia);
	}
}
