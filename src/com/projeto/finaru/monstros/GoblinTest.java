package com.projeto.finaru.monstros;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.projeto.finaru.Item;
import com.projeto.finaru.herois.Guerreiro;

public class GoblinTest {

	@Test
	public void test() {
		ArrayList<Item> lista_item = new ArrayList<Item>();
		
		Guerreiro g = new Guerreiro("Julia", 12, 10,  2, lista_item);
		Goblin goblin = new Goblin("monstro", 12, 10, 1);	
		
		//Verificar se é iniciado com vida é maior que zero
		assertTrue(goblin.getVida() > 0);
		
		//Verificar se o ataque é positivo
		assertTrue(goblin.getAtaque() > 0);
		
		goblin.atacar(g);
		assertEquals(g.getVidaAtual(), 1);
	}

}
