package com.projeto.finaru;

import static org.junit.Assert.*;

import org.junit.Test;

public class SistemaTest {

	@Test(expected = OpcaoInexistenteException.class)
	public void testSistema() throws OpcaoInexistenteException {
		//Sistema s = new Sistema();
		Sala sala = new Sala(true, false, false, false, 30, 30, "Entrei");
		
		sala.mostrarOpcoes();
		
		int opcaoDirecao = 4;
		
	}

}
