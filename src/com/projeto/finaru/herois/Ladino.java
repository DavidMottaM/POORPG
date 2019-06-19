package com.projeto.finaru.herois;

import com.projeto.finaru.Heroi;
import com.projeto.finaru.Monstro;

public class Ladino extends Heroi{
	float chanceCritico = 3;
	public Ladino(String nome, int vidaMax, int forca, int inteligencia) {
		super(nome, vidaMax, forca, inteligencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void melhorarPoder() {
		this.vidaMax += 7;
		this.forca += 4;
		this.inteligencia += 1;	
		this.chanceCritico += 3;
	}
	
	//para professora: a gente quer fazer uma sobrecarga
	@Override
	protected void atacar(Monstro m) {
		this.forca++;
		m.setVida(m.getVida()-this.forca);
	}


	
}
