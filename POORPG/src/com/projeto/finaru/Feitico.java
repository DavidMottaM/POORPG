package com.projeto.finaru;

public abstract class Feitico {
//VARIÁVEIS//////////////////////////////////////////////////
	protected String nome;
	protected String descricao;
	protected String frase;
//CONSTRUTOR/////////////////////////////////////////////////	
	Feitico(String nome, String descricao, String frase){
		this.nome = nome;
		this.descricao = descricao;
		this.frase = frase;
	}
//FUNÇÕES DO JOGO////////////////////////////////////////////
	public abstract void efeito(Heroi heroi);
//GETS///////////////////////////////////////////////////////
	public String getNome() {
		return this.nome;
	}
	public String getDescricao() {
		return this.descricao;
	}
	public String getFrase() {
		return this.frase;
	}
//SETS//////////////////////////////////////////////////////////
	public void setNome(String nome) {
		this.nome= nome;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setFrase(String frase) {
		this.frase = frase;
	}
}
