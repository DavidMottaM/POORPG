package com.projeto.finaru;

public class ElixirPoder extends Item {

	ElixirPoder(String nome, String descricao) {
		super(nome, descricao);
	}

	@Override
	public void efeito(Heroi h) {//Função de elixir de poder
		
		h.setForca(h.getForca() + 1);
		h.setInteligencia(h.getInteligencia() + 1);
	}

}
