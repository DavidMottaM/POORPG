package com.projeto.finaru;

import java.util.ArrayList;

public class Sala {
//VARIÁVEIS///////////////////////////////////////
	private boolean paraDireita;
	private boolean paraEsquerda;
	private boolean paraCima;
	private boolean paraBaixo;

	public ArrayList<Monstro> monstros;
	public ArrayList<Item> itens;

	private int x;
	private int y;
	//public Monstro monstros[];
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
	protected  void entrada(Heroi heroi) {
		System.out.println(textoEntrada);
		//System.out.println("///////////////////////////// MENU /////////////////////////////");
		
		if (itens.size() > 0) {
			System.out.println("Voce achou um item!");
			System.out.println(itens.get(0).getNome() + " foi adicionado no seu inventario...");
			heroi.listaItem.add(itens.get(0));
			
		}
		
		if (monstros.size() > 0) {
			System.out.println("Um Monstro aparece!");
			System.out.println("Goblin de nível " + monstros.get(0).getLevel());
			this.batalha(heroi, monstros.get(0));
			
		}
	}
	
	protected void permanencia() {
		
	}
	
	protected void saida() {
		
	}
	
	public void mostrarOpcoes() {
		if(this.paraCima == true) {
			System.out.println("1 - Ir para cima");
		}
		
		if(this.paraBaixo == true) {
			System.out.println("2 - Ir para baixo");
		}
		
		if(this.paraEsquerda == true) {
			System.out.println("3 - Ir para esquerda");
		}
		
		if(this.paraDireita == true) {
			System.out.println("4 - Ir para direita");
		}
		
	}
	
	
	public boolean temMonstro() {
		return (monstros.size() > 0) ? true : false; 
		
	}
	
	public void batalha(Heroi heroi, Monstro monstro) {
		
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