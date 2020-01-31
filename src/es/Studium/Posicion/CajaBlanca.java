package es.Studium.Posicion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CajaBlanca {

	@Test
	void testPosicion1() {
		int resultadoEsperado = 0;
		int resultadoReal= Posicion.posicion("p", "");
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testPosicion2() {
		int resultadoEsperado = 0;
		int resultadoReal= Posicion.posicion("p", "q");
		assertEquals(resultadoEsperado, resultadoReal);
	}

	@Test
	void testPosicion3() {
		int resultadoEsperado = 1;
		int resultadoReal= Posicion.posicion("p", "p");
		assertEquals(resultadoEsperado, resultadoReal);
	}
	

}
