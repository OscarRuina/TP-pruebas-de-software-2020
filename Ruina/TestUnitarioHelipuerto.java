package Ruina;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import avion.AvionSimple;
import avion.Helicoptero;

import pista.Helipuerto;

import copControl.Posicion;

public class TestUnitarioHelipuerto {
    int i,j;
	Posicion posicionEntrada;
	Helipuerto helipuerto;
	Helicoptero helicoptero;
	AvionSimple avionSimple;
    	
	@Before
	public void setUp() throws Exception {
		i = 10;
		j = 15;
		posicionEntrada = new Posicion(i,j);
		helipuerto = new Helipuerto(posicionEntrada);
	}
    //4
	@Test
	public void testPuedeAterrizarHelicoptero() {
		assertTrue("Fallo el metodo puedeAterrizar(Helicoptero helicoptero)" 
				, helipuerto.puedeAterrizar(helicoptero));
	}
	//5
	@Test
	public void testPuedeAterrizarAvionSimple(){
		assertFalse("Fallo el metodo puedeAterrizar(AvionSimple avionSimple)" 
				, helipuerto.puedeAterrizar(avionSimple));
	}

}
