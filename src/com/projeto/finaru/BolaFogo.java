package com.projeto.finaru;

public class BolaFogo extends Feitico {

	public BolaFogo(String nome, String descricao, String frase) {
		super(nome, descricao, frase);
	}

	@Override
	public void efeito(Heroi h, Monstro m) {
		m.setVida(m.getVida() - (7 + h.getInteligencia()));
	}



}
