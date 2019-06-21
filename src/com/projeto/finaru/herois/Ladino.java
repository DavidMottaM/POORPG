package com.projeto.finaru.herois;

import java.util.List;

import com.projeto.finaru.Heroi;
import com.projeto.finaru.Item;
import com.projeto.finaru.Monstro;

public class Ladino extends Heroi{
	float chanceCritico = 3;
	
	public Ladino(String nome, int vidaMax, int forca, int inteligencia, List<Item> listaItem) {
		super(nome, vidaMax, forca, inteligencia, listaItem);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void melhorarPoder() {
		this.setLevel(this.getLevel()+1);
		this.vidaMax += 3;
		this.forca += 8;
		this.inteligencia += 1;	
		this.chanceCritico += 5;
	}
	
	//para professora: a gente quer fazer uma sobrecarga
	@Override
	public void atacar(Monstro m) {
		this.forca++;
		m.setVida(m.getVida()-this.forca);
	}


	
}
