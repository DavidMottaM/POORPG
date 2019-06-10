package com.projeto.finaru;

import java.util.List;

public abstract class Monstro {
//VARIÁVEIS///////////////////////////////////////////////////////
	private String nome;
	private int vida;
	private int ataque;
	private List<Item> lista_item;
//CONSTRUTOR///////////////////////////////////////////////////////	
	Monstro(String nome, int vida, int ataque, List<Item> lista_item){
		this.nome = nome;
		this.vida = vida;
		this.ataque = ataque;
		this.lista_item = lista_item;
	}
//GETS////////////////////////////////////////////////////////////
	public String getNome() {
		return this.nome;
	}
	public int getVida() {
		return this.vida;
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
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public void setListaItem(List<Item> lista_item) {
		this.lista_item = lista_item;
	}
}
