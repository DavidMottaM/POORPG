package com.projeto.finaru;

public class PocaoVida extends Item {

	public PocaoVida(String nome, String descricao) {
		super(nome, descricao);
	}

	@Override
	public void efeito(Heroi h) {//Função de cura da poção
		int cura =10;
		if(h.getVidaAtual() + cura > h.getVidaMax()) {
							//Se a cura deixaria o heroi com mais vida que a
							//máxima, ele ficaria com a vida maxima ao invés
			h.setVidaAtual(h.getVidaMax());
		}
		else {
			h.setVidaAtual(h.getVidaAtual() + cura);
		}
	}

}
