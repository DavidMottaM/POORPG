package com.projeto.finaru;

import java.util.List;

public abstract class Monstro {
//VARIÁVEIS///////////////////////////////////////////////////////
	protected String nome;
	protected int level;
	protected int vida;
	protected int ataque;
	protected List<Item> lista_item;
//CONSTRUTOR///////////////////////////////////////////////////////	
	protected Monstro(String nome, int vida, int ataque){
		this.nome = nome;
		this.vida = vida;
		this.ataque = ataque;
	//	this.lista_item = lista_item;
	}
//METODOS////////////////////////////////////////////////////////////
	public abstract void atacar(Heroi heroi);
		
	
	public void darLoot(Heroi heroi) {
		
	}
		
//GETS////////////////////////////////////////////////////////////
	public String getNome() {
		return this.nome;
	}
	public int getVida() {
		return this.vida;
	}
	public int getLevel() {
		return this.level;
	}
	public int getAtaque() {
		return this.ataque;
	}
	public List<Item> getListaItem() {
		return this.lista_item;
	}
//SETS//////////////////////////////////////////////////////////////
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public void setListaItem(List<Item> lista_item) {
		this.lista_item = lista_item;
	}
}
