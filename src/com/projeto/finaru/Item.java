package com.projeto.finaru;

public abstract class Item {
//VARI�VEIS////////////////////////////
	protected String nome;
	protected String descricao;
//CONSTRUTOR///////////////////////////	
	Item(String nome, String descricao){
		this.nome = nome;
		this.descricao = descricao;
	}
//FUN�OES DO JOGO//////////////////////
	public abstract void efeito(Heroi heroi); //Faz o efeito no proprio her�i
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
