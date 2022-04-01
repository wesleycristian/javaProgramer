package megasena;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortearNumero {

	// @Test
	// void test() {
	// fail("Not yet implemented");

	@test
	void gera��oDeNumeroPositivo() {
		int numeroMaiorQueZero = megaSenaUtilitario.sortearNumero();
		assertTrue(numeroMaiorQueZero > 0);
	}

	@test
	void gera��oDeNumeroIgualOuMaiorQueSessenta() {
		int numeroIgualOuMaiorQueSessenta = megaSenaUtilitario.sortearNumero();
		assertTrue(numeroIgualOuMaiorQueSessenta <= 60);
	}

}
