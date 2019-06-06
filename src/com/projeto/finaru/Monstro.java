package com.projeto.finaru;

public abstract class Monstro {

	private int x;
	private int y;
	private String nome;
	private String elemento; //enum
	private int nivel;
	private String raca; //enum
	private int forca;
	private int sorte;
	private int defesa;
	private int vida;
	
	
	//METODOS 
	
	public int GetX() {
		return x;
	}
	public void SetX(int n) {
		x = n;
	}
	
	public int GetY() {
		return y;
	}
	public void SetY(int n) {
		y = n;
	}
	
	public String GetNome() {
		return nome;
	}
	public void SetNome(String n) {
		nome = n;
	}
	
	public String GetElemento() {
		return elemento;
	}
	public void SetElemento(String e) {
		elemento = e;
	}
	
	public int GetNivel() {
		return nivel;
	}
	public void SetNivel(int n) {
		nivel = n;
	}
	
	public String GetRaca() {
		return raca;
	}
	public void SetRaca(String r) {
		raca = r;
	}

	public int GetForca() {
		return forca;
	}
	public void SetForca(int f) {
		forca = f;
	}
	
	public int GetSorte() {
		return sorte;
	}
	public void SetSorte(int s) {
		sorte = s;
	}

	public int GetDefesa() {
		return defesa;
	}
	public void SetDefesa(int d) {
		defesa = d;
	}
	
	public int GetVida() {
		return vida;
	}
	public void setVida(int v) {
		vida = v;
	}
	
	public abstract void levelUp();
	
	public abstract int atacar();
	
	public abstract void receberAtaque(int dano);
	
	public abstract void receberFeitico(Feitico feitico);
	
	

}
