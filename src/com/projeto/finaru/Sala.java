package com.projeto.finaru;

public class Sala {
//VARIÁVEIS///////////////////////////////////////
	private boolean paraDireita;
	private boolean paraEsquerda;
	private boolean paraCima;
	private boolean paraBaixo;
	public Monstro monstros[];
	public boolean visitada;
//CONSTRUTOR/////////////////////////////////////
	public Sala() {
		visitada = false;
	}
//MÉTODOS//////////////////////////////////////////
	protected  void entrada() {
		
	}
	
	protected void permanencia() {
		
	}
	
	protected void saida() {
		
	}
	
	
	public boolean temMonstro() {
		return (monstros.length > 0) ? true : false; 
		
	}
//GETS/////////////////////////////////////////////
	public boolean getParaDireita() {
		return this.paraDireita;
	}
	public boolean getParaEsquerda() {
		return this.paraEsquerda;
	}
	public boolean getParaCima() {
		return this.paraCima;
	}
	public boolean getParaBaixo() {
		return this.paraBaixo;
	}
//SETS/////////////////////////////////////////////////////
	public void setParaDireita(boolean paraDireita) {
		this.paraDireita = paraDireita;
	}
	public void setParaEsquerda(boolean paraEsquerda) {
		this.paraEsquerda = paraEsquerda;
	}
	public void setParaCima(boolean paraCima) {
		this.paraCima = paraCima;
	}
	public void setParaBaixo(boolean paraBaixo) {
		this.paraBaixo = paraBaixo;
	}
}