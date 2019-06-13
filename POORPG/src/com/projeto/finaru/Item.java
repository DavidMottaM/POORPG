package com.projeto.finaru;

public abstract class Item {
//VARIÁVEIS////////////////////////////
	protected String nome;
	protected String descricao;
//CONSTRUTOR///////////////////////////	
	Item(String nome, String descricao){
		this.nome = nome;
		this.descricao = descricao;
	}
//FUNÇOES DO JOGO//////////////////////
	public abstract void efeito(Heroi heroi); //Faz o efeito no proprio herói
//GETS/////////////////////////////////
	public String getNome() {
		return this.nome;
	}
	public String getDescricao() {
		return this.descricao;
	}
//SETS/////////////////////////////////
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
