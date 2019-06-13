package com.projeto.finaru.herois;

import com.projeto.finaru.Heroi;
import com.projeto.finaru.Monstro;

public class Guerreiro extends Heroi{

	public Guerreiro(String nome, int vidaMax, int forca, int inteligencia) {
		super(nome, vidaMax, forca, inteligencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atacar(Monstro m) {
		
		m.setVida(m.getVida()-this.forca+this.level);
		
		
	}

	
}
