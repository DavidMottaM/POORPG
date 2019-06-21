package com.projeto.finaru.herois;

import com.projeto.finaru.Heroi;
import com.projeto.finaru.Item;
import com.projeto.finaru.Monstro;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class Guerreiro extends Heroi {
	
	public Guerreiro(String nome, int vidaMax, int forca, int inteligencia, java.util.List<Item> listaItem) {
		super(nome, vidaMax, forca, inteligencia, listaItem);
		// TODO Auto-generated constructor stub
	}

	int armadura = 1;
	
	

	@Override
	public void melhorarPoder() {
		this.setLevel(this.getLevel()+1);
		this.vidaMax += 12;
		this.forca += 6;
		this.inteligencia += 1;	
		this.armadura += 3;
	}
	
	public int getArmadura() {
		return this.armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	
}
