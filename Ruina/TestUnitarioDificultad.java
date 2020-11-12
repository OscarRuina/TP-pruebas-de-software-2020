package Ruina;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import copControl.Dificultad;

public class TestUnitarioDificultad {
    int a,b,c,d;
	Dificultad dificultad;
	@Before
	public void setUp() throws Exception {
		a=10;
		b=15;
		c=7;
		d = a+b+c;
		dificultad = new Dificultad(a,b,c);
	}
    //1
	@Test
	public void testGetValorDeDificultad() {
		assertTrue("Fallo el metodo getValorDeDificultad", 
				dificultad.getValorDeDificultad() == d);
	}
}
