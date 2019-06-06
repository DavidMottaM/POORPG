package com.projeto.finaru;

import java.util.List;

public abstract class Heroi {
//VARIÁVEIS///////////////////////////////////
	protected int vidaMax;
	protected int vidaAtual;
	protected int forca;
	public int inteligencia;
	protected List<Item> listaItem;

//CONSTRUTOR/////////////////////////////////////
	Heroi(int vidaMax, int forca, int inteligencia) {
		this.vidaMax = vidaMax;
		this.forca = forca;
		this.inteligencia = inteligencia;
	}
//FUNÇOES DO JOGO////////////////////////////////
	private void obterItem(Item i) {//Adiciona um item ao final da lista
		this.listaItem.add(i);
	}
	private void usarItem(Item i) {
		i.efeito(this);
		listaItem.remove(i);		
	}	
	private void atacar(Monstro m) {
		m.setVida(m.GetVida()-this.forca);
	}
	private void melhorarPoder() {//Level UP simplificado
		this.vidaMax += 5;
		this.forca += 1;
		this.inteligencia += 1;
	}
//GETS///////////////////////////////////////////
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
