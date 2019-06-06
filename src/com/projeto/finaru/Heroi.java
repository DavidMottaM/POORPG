package com.projeto.finaru;

public abstract class Heroi {
	private int x;
	private int y;
	private String nome;
	private int nivel;
	private String genero;//enum
	private String raca; //enum
	private String classe; //enum
	private int inteligencia;
	private int forca;
	private int sorte;
	private int destreza;
	private int defesa;
	private int vida;
	private int mana;
	
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
	
	public int GetNivel() {
		return nivel;
	}
	public void SetNivel(int n) {
		nivel = n;
	}
	
	public String GetGenero() {
		return genero;
	}
	public void SetGenero(String g) {
		genero = g;
	}

	public String GetRaca() {
		return raca;
	}
	public void SetRaca(String r) {
		raca = r;
	}

	public String GetClasse() {
		return classe;
	}
	public void SetClasse(String c) {
		classe = c;
	}

	public int GetInteligencia() {
		return inteligencia;
	}
	public void SetInteligencia(int i) {
		inteligencia = i;
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
	
	public int GetDestreza() {
		return destreza;
	}
	public void SetDestreza(int d) {
		destreza = d;
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
	public void SetVida(int v) {
		vida = v;
	}
	
	public int GetMana() {
		return mana;
	}
	public void SetMana(int m) {
		mana = m;
	}
	
	public abstract void levelUp();
	
	public abstract int atacar();
	
	public abstract void perderVida(int dano);
	
	public abstract void fugir(int nivel); 
	
	public abstract void usarItem(Item item);
	
	public abstract void lancarFeitico(Feitico feitico);
	
	public abstract void moverFrente();
	
	public abstract void moverTras();
	
	public abstract void moverDireita();
	
	public abstract void moverEsquerda();
}
