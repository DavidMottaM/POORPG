package com.projeto.finaru;

public class Relampago extends Feitico {

	Relampago(String nome, String descricao, String frase) {
		super(nome, descricao, frase);
	}

	@Override
	public void efeito(Monstro m) {
		m.setVida(m.getVida() - 7);
	}



}
