package com.projeto.finaru;

public class BolaFogo extends Feitico {

	BolaFogo(String nome, String descricao, String frase) {
		super(nome, descricao, frase);
	}

	@Override
	public void efeito(Monstro m) {
		m.setVida(m.getVida() - 7);
	}



}
