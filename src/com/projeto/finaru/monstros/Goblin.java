package com.projeto.finaru.monstros;
import java.util.List;

import com.projeto.finaru.*;

public class Goblin extends Monstro {

	public Goblin(String nome, int vida, int ataque) {
		super(nome, vida, ataque);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void atacar(Heroi heroi) {
		heroi.setVidaAtual(heroi.getVidaAtual()-(this.ataque+this.level));
		
	}

}
