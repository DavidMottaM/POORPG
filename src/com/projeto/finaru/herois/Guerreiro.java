package com.projeto.finaru.herois;

import com.projeto.finaru.Heroi;
import com.projeto.finaru.Monstro;

public class Guerreiro extends Heroi{
	int armadura = 1;
	
	public Guerreiro(String nome, int vidaMax, int forca, int inteligencia) {
		super(nome, vidaMax, forca, inteligencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void melhorarPoder() {
		this.vidaMax += 12;
		this.forca += 3;
		this.inteligencia += 1;	
		this.armadura += 1;
	}


	
}
