package com.projeto.finaru.herois;

import java.util.List;

import com.projeto.finaru.Feitico;
import com.projeto.finaru.Heroi;
import com.projeto.finaru.Monstro;

public class Mago extends Heroi{
	int espacosMagia = 6;
	public Mago(String nome, int vidaMax, int forca, int inteligencia) {
		super(nome, vidaMax, forca, inteligencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void melhorarPoder() {
		this.vidaMax += 7;
		this.forca += 4;
		this.inteligencia += 1;	
		this.espacosMagia += 3;
	}

	
}
