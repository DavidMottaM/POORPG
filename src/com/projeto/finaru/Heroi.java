package com.projeto.finaru;

import java.util.List;

public abstract class Heroi {
//VARIÁVEIS///////////////////////////////////
	protected int x;
	protected int y;
	protected String nome;
	protected int level;
	protected int vidaMax;
	protected int vidaAtual;
	protected int forca;
	public int inteligencia;
	protected List<Item> listaItem;

//CONSTRUTOR/////////////////////////////////////
	protected Heroi(String nome,int vidaMax, int forca, int inteligencia) {
		this.nome = nome;
		this.vidaMax = vidaMax;
		this.forca = forca;
		this.inteligencia = inteligencia;
		this.level = 0;
	}
//FUNÇOES DO JOGO////////////////////////////////
	private void obterItem(Item i) {//Adiciona um item ao final da lista
		this.listaItem.add(i);
	}
	private void usarItem(Item i) {
		i.efeito(this);
		listaItem.remove(i);//deleta o PRIMEIRO item da lista que possui o mesmo nome do parametro		
	}	

	protected void atacar(Monstro m) {
		m.setVida(m.getVida()-this.forca);
	}
	public abstract void melhorarPoder();//LevelUp simplificado
//GETS///////////////////////////////////////////
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public String getNome() {
		return this.nome;
	}
	public int getLevel() {
		return this.x;
	}
	public int getVidaMax() {
		return this.vidaMax;
	}
	public int getVidaAtual() {
		return this.vidaAtual;
	}
	public int getForca() {
		return this.forca;
	}
	public int getInteligencia() {
		return this.inteligencia;
	}
	public List<Item> getListaItem() {
		return this.listaItem;
	}
	
//SETS//////////////////////////////////////////
	public void setX (int x) {
		this.x = x;
	}
	public void setY (int y) {
		this.y = y;
	}
	public void setLevel (int level) {
		this.level = level;
	}
	public void setVidaMax(int vidaMax) {
		this.vidaMax = vidaMax;
	}
	public void setVidaAtual(int vidaAtual) {
		this.vidaAtual = vidaAtual;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	public void setListaItem(List<Item> listaItem) { //SOBRESCREVE TODA A LISTA!!!
		this.listaItem = listaItem;
	}

}
