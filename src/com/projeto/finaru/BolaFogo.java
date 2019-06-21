package com.projeto.finaru;

public class BolaFogo extends Feitico {

	public BolaFogo(String nome, String descricao, String frase) {
		super(nome, descricao, frase);
	}

	@Override
	public void efeito(Heroi h, Monstro m) {
		System.out.println(this.frase);
		m.setVida(m.getVida() - (5 + h.getInteligencia()));
		
		System.out.println("Voce causou "+(5 + h.getInteligencia())+" de dano");
	}



}
