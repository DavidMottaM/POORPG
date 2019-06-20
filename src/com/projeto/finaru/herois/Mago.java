package com.projeto.finaru.herois;

import java.util.List;

import com.projeto.finaru.Feitico;
import com.projeto.finaru.Heroi;
import com.projeto.finaru.Item;
import com.projeto.finaru.Monstro;

public class Mago extends Heroi{
	int espacosMagia = 6;
	List<Feitico> lista_feitico;
	
	public Mago(String nome, int vidaMax, int forca, int inteligencia, List<Item> listaItem) {
		super(nome, vidaMax, forca, inteligencia, listaItem);
	}

	@Override
	public void melhorarPoder() {
		this.vidaMax += 7;
		this.forca += 4;
		this.inteligencia += 1;	
		this.espacosMagia += 3;
	}

	
}
