package edu.poniperro;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestProcesadorTexto {

	@Test
	public void test_simple() {
		
		ProcesadorTextoBasico procesador = new ProcesadorTextoBasico();
		
		procesador.nueva("No");
		procesador.nueva("himporta");
		procesador.nueva("la");
		procesador.nueva("hortografia");
		
		assertEquals("No himporta la hortografia", procesador.texto());
	}
	
	@Test
	public void test_con_idioma() {
		
		ProcesadorTexto procesador = new ProcesadorTexto();
		
		procesador.nueva("Tengo");
		procesador.nueva("hambre");
		
		assertEquals("Tengo hambre", procesador.texto());
		
		assertTrue(procesador.correcto(Idioma.ES));
	}
}