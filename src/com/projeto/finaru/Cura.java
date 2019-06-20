package com.projeto.finaru;

public class Cura extends Feitico {

	public Cura(String nome, String descricao, String frase) {
		super(nome, descricao, frase);
	}

	@Override
	public void efeito(Heroi h, Monstro m) {
		// TODO Auto-generated method stub
		h.setVidaAtual(h.getVidaAtual()+h.getInteligencia());
	}



}
