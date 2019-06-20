package com.projeto.finaru.herois;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.projeto.finaru.ElixirPoder;
import com.projeto.finaru.Item;
import com.projeto.finaru.PocaoVida;
import com.projeto.finaru.monstros.Goblin;

public class MagoTest {

	@Test
	public void test() {
		
		PocaoVida p = new PocaoVida("poção", "uma poção de vida");
		ElixirPoder x = new ElixirPoder("elixir", "elixir poder");
		
		ArrayList<Item> lista_item = new ArrayList<Item>();
		lista_item.add(p);
		lista_item.add(x);
		
		Mago m = new Mago("Davi", 12, 10,  2, lista_item);
		Goblin e = new Goblin("monstro", 12, 10, 1);	
		
		
		// Atributos do ladino são positivos?
		assertTrue(m.getForca() > 0);
		assertTrue(m.getInteligencia() > 0);
		assertTrue(m.getVidaMax() > 0);	
		
		// Ataque subtrai a vida do inimigo pelo ataque do ladino?
		m.atacar(e);
		assertEquals(e.getVida(),2);
		
		//Verificar se poção está alterando vida do personagem
		m.setVidaAtual(1);
		m.usarItem(p);
		assertEquals(m.getVidaAtual(), 11);
		
		//Verificar se elixir está alterando atributos
		m.usarItem(x);
		assertEquals(m.getForca(), 11);
		assertEquals(m.getInteligencia(), 3);

		//Melhorar poder
		m.melhorarPoder();
		assertEquals(m.getForca(), 15);
		assertEquals(m.getInteligencia(), 4);
		assertEquals(m.getVidaMax(), 19);
	}
}
