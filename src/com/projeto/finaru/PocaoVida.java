package com.projeto.finaru;

public class PocaoVida extends Item {

	public PocaoVida(String nome, String descricao) {
		super(nome, descricao);
	}

	@Override
	public void efeito(Heroi h) {//Fun��o de cura da po��o
		int cura =10;
		if(h.getVidaAtual() + cura > h.getVidaMax()) {
							//Se a cura deixaria o heroi com mais vida que a
							//m�xima, ele ficaria com a vida maxima ao inv�s
			h.setVidaAtual(h.getVidaMax());
		}
		else {
			h.setVidaAtual(h.getVidaAtual() + cura);
		}
	}

}
