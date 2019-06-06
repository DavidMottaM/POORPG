package com.projeto.finaru;

public abstract class Feitico {

	protected String nome;
	protected String descricao;
	protected String frase;
	
	Feitico(String nome, String descricao, String frase){
		this.nome = nome;
		this.descricao = descricao;
		this.frase = frase;
	}
	public abstract void efeito(Heroi heroi);
	public String getNome() {
		return this.nome;
	}
	public String getDescricao() {
		return this.descricao;
	}
	public String getFrase() {
		return this.frase;
	}
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
