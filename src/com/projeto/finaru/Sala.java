package com.projeto.finaru;

public class Sala {
//VARIÁVEIS///////////////////////////////////////
	private boolean paraDireita;
	private boolean paraEsquerda;
	private boolean paraCima;
	private boolean paraBaixo;
	private int x;
	private int y;
	public Monstro monstros[];
	public boolean visitada;
	private String textoEntrada = "";
	
//CONSTRUTOR/////////////////////////////////////
	public Sala(boolean paraDireita, boolean paraEsqueda, boolean paraCima, boolean paraBaixo, int x, int y, String t) {
		this.paraDireita = paraDireita;
		this.paraEsquerda = paraEsqueda;
		this.paraCima = paraCima;
		this.paraBaixo = paraBaixo;
		this.x = x;
		this.y = y;
		visitada = false;
		this.textoEntrada = t;
	}
//MÉTODOS//////////////////////////////////////////
	protected  void entrada() {
		System.out.println(textoEntrada);
		System.out.println("///////////////////////////// MENU /////////////////////////////");
		
	}
	
	protected void permanencia() {
		
	}
	
	protected void saida() {
		
	}
	
	public void mostrarOpcoes() {
		if(this.paraCima == true) {
			System.out.println("1 - Ir para cima");
		} else {
			System.out.println("Opção invalida");
		}
		
		if(this.paraBaixo) {
			System.out.println("2 - Ir para baixo");
		}
		
		if(this.paraEsquerda) {
			System.out.println("3 - Ir para esquerda");
		}
		
		if(this.paraDireita) {
			System.out.println("4 - Ir para direita");
		}
		
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