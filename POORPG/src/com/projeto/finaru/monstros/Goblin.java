package com.projeto.finaru.monstros;
import java.util.List;

import com.projeto.finaru.*;

public class Goblin extends Monstro {

	Goblin(String nome, int vida, int ataque, List<Item> lista_item) {
		super(nome, vida, ataque, lista_item);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void atacar(Heroi heroi) {
		heroi.setVidaAtual(heroi.getVidaAtual()-(this.ataque+this.level));
		
	}

}
