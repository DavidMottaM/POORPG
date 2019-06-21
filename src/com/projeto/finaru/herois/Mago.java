package com.projeto.finaru.herois;

import java.util.List;

import com.projeto.finaru.BolaFogo;
import com.projeto.finaru.Cura;
import com.projeto.finaru.Feitico;
import com.projeto.finaru.Heroi;
import com.projeto.finaru.Item;
import com.projeto.finaru.Monstro;

public class Mago extends Heroi{
	int espacosMagia = 6;

		

	
	
	public Mago(String nome, int vidaMax, int forca, int inteligencia, List<Item> listaItem) {
		super(nome, vidaMax, forca, inteligencia, listaItem);
		this.lista_feitico.add(new BolaFogo("Bola de Fogo", "Dispara uma bola de fogo que d� dano","AAAAAAAAAHHH BOOOLA DE FOOGO!!"));
		this.lista_feitico.add(new Cura("Cura", "Cura","Curou toda"));

	}

	@Override
	public void melhorarPoder() {
		this.setLevel(this.getLevel()+1);
		this.vidaMax += 5;
		this.forca += 1;
		this.inteligencia += 7;	
		this.espacosMagia += 2;
	}

	
}
