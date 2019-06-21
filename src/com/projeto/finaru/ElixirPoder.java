package com.projeto.finaru;

public class ElixirPoder extends Item {

	public ElixirPoder(String nome, String descricao) {
		super(nome, descricao);
	}

	@Override
	public void efeito(Heroi h) {//Função de elixir de poder
		
		h.setForca(h.getForca() + 5);
		h.setInteligencia(h.getInteligencia() + 5);
		
		System.out.println("Dano aumentado em 5 pontos");
	}

}
