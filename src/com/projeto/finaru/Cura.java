package com.projeto.finaru;

public class Cura extends Feitico {

	public Cura(String nome, String descricao, String frase) {
		super(nome, descricao, frase);
	}

	@Override
	public void efeito(Heroi h, Monstro m) {
		System.out.println(this.frase);
		
		int cura = h.getInteligencia()+7;
		if(h.getVidaAtual() + cura > h.getVidaMax()) {
							//Se a cura deixaria o heroi com mais vida que a
							//máxima, ele ficaria com a vida maxima ao invés
			h.setVidaAtual(h.getVidaMax());
		}
		else {
			h.setVidaAtual(h.getVidaAtual() + cura);
		}
		
		System.out.println("Voce curou " + cura + " de vida");
	}



}
