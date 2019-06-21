package com.projeto.finaru.herois;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.projeto.finaru.herois.Guerreiro;
import com.projeto.finaru.monstros.Goblin;
import com.projeto.finaru.Monstro;

import com.projeto.finaru.ElixirPoder;
import com.projeto.finaru.Item;
import com.projeto.finaru.PocaoVida;

public class GuerreiroTest {

	@Test
	public void test() {
		
		PocaoVida p = new PocaoVida("poção", "uma poção de vida");
		ElixirPoder x = new ElixirPoder("elixir", "elixir poder");
		
		ArrayList<Item> lista_item = new ArrayList<Item>();
		lista_item.add(p);
		lista_item.add(x);
		
		Guerreiro g = new Guerreiro("Julia", 12, 10,  2, lista_item);
		Goblin e = new Goblin("monstro", 12, 10, 1);	
		
		
		// Atributos do guerreiro são positivos?
		assertTrue(g.getForca() > 0);
		assertTrue(g.getInteligencia() > 0);
		assertTrue(g.getVidaMax() > 0);
		
		// armadura inicia em 1?
		assertEquals(g.armadura, 1);
		
		// Ataque subtrai a vida do inimigo pelo ataque do guerreiro?
		g.atacar(e);
		assertEquals(e.getVida(),2);
		
		//Verificar se poção está alterando vida do personagem
		g.setVidaAtual(1);
		g.usarItem(p);
		assertEquals(g.getVidaAtual(), 12);
		
		//Verificar se elixir está alterando atributos
		g.usarItem(x);
		assertEquals(g.getForca(), 15);
		assertEquals(g.getInteligencia(), 7);
		
		//Melhorar poder
		g.melhorarPoder();
		assertEquals(g.getForca(), 21);
		assertEquals(g.getInteligencia(), 8);
		assertEquals(g.getVidaMax(), 24);
		assertEquals(g.getArmadura(), 4);
		
	}

}