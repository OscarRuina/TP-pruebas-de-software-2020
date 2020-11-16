package Ruina;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import avion.AvionSimple;

import copControl.Mapa;
import copControl.Posicion;

import pista.PistaDoble;

public class TestIntegracionPistaDoble {
    
	private PistaDoble pistaDoble;
	private Posicion posicionEntrada;
	private Posicion  posicionInicialAvion;
	private Posicion  posicionFinalAvion;
	private Mapa mapaDeMovimiento;
	private AvionSimple avionSimple;
	
	@Before
	public void setUp() throws Exception {
		
		posicionEntrada = new Posicion(1,0);
		pistaDoble = new PistaDoble(posicionEntrada);
		posicionInicialAvion = new Posicion(2,0);
		posicionFinalAvion = new Posicion(2,2);
		mapaDeMovimiento = new Mapa();
		avionSimple = new AvionSimple(posicionInicialAvion,posicionFinalAvion,mapaDeMovimiento);
		
		  
	}
    
	//6
	@Test
	public void testEstaEnZonaDeAterrizaje() {
		assertTrue("Fallo el metodo estaEnZonadeAterrizaje",pistaDoble.estaEnZonaAterrizaje(avionSimple));
	}
	
	//7
	@Test
	public void testPuedeAterrizarAvionSimple(){
		assertTrue("Fallo el metodo puedeAterrizar",pistaDoble.puedeAterrizar(avionSimple));
	}

}
