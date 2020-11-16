package Ruina;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import pista.Pista;
import pista.PistaSimple;
import avion.AvionComputarizado;
import avion.AvionSimple;
import copControl.Dificultad;
import copControl.Mapa;
import copControl.Nivel;
import copControl.Posicion;

public class TestIntegracionNivel {
	
	private Nivel nivel;
	private Mapa mapa;
	private Dificultad dificultad;
	private Posicion posicion;
	private Posicion posicion2;
	private AvionSimple avion;
	private AvionComputarizado avion2;
	private List<Pista> pistas = new ArrayList<Pista>();
	private PistaSimple pista;

	@Before
	public void setUp() throws Exception {
		
		mapa = new Mapa(); 
		dificultad = new Dificultad(10,15,5);
		nivel = new Nivel(mapa,dificultad);
		posicion = new Posicion(5,7);
		posicion2 = new Posicion(8,6);
		avion = new AvionSimple(posicion,posicion2,mapa);
		avion2 = new AvionComputarizado(posicion,mapa);
		pista = new PistaSimple(new Posicion(10,15));
		pistas.add(pista);
		mapa.setPistas(pistas);
		nivel.colocarAvionEnAire(avion);
		nivel.colocarAvionEnAire(avion2);
		
	}
    
	//8
	@Test
	public void testAterrizarAviones() {
		assertTrue("Fallo el metodo atterizarAviones",nivel.aterrizarAviones() == 2);
	}
	
	//9
	@Test
	public void testTienePistaAdecuada(){
		assertTrue("Fallo el metodo tienePistaAdecuada",nivel.tienePistaAdecuada(avion));
	}
	
	//10
	@Test
	public void testTieneAvionesVolando(){
		assertTrue("Fallo el metodo tieneAvionesVolando",nivel.tieneAvionesVolando());
	}
	
	

}
