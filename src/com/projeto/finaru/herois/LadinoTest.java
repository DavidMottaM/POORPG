package com.projeto.finaru.herois;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.projeto.finaru.ElixirPoder;
import com.projeto.finaru.Item;
import com.projeto.finaru.PocaoVida;
import com.projeto.finaru.monstros.Goblin;

public class LadinoTest {

	@Test
	public void test() {
		
		PocaoVida p = new PocaoVida("poção", "uma poção de vida");
		ElixirPoder x = new ElixirPoder("elixir", "elixir poder");
		
		ArrayList<Item> lista_item = new ArrayList<Item>();
		lista_item.add(p);
		lista_item.add(x);
		
		Ladino l = new Ladino("Davi", 12, 10,  2, lista_item);
		Goblin e = new Goblin("monstro", 12, 10, 1);	
		
		
		// Atributos do ladino são positivos?
		assertTrue(l.getForca() > 0);
		assertTrue(l.getInteligencia() > 0);
		assertTrue(l.getVidaMax() > 0);	
		
		// Ataque subtrai a vida do inimigo pelo ataque do ladino?
		l.atacar(e);
		assertEquals(e.getVida(),1);
		
		//Verificar se poção está alterando vida do personagem
		l.setVidaAtual(1);
		l.usarItem(p);
		assertEquals(l.getVidaAtual(), 12);
		
		//Verificar se elixir está alterando atributos
		l.usarItem(x);
		assertEquals(l.getForca(), 16);
		assertEquals(l.getInteligencia(), 7);
		
		//Melhorar poder
		l.melhorarPoder();
		assertEquals(l.getForca(), 24);
		assertEquals(l.getInteligencia(), 8);
		assertEquals(l.getVidaMax(), 15);
		
	}

}
