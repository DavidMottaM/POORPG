package com.projeto.finaru;

public abstract class Feitico {

	private String frase;
	private int dano;
	private String elemento; //enum
	
	public String GetFrase() {
		return frase;
	}
	public void SetFrase(String f) {
		frase = f;
	}
	
	public int GetDano() {
		return dano;
	}
	public void SetDano(int d) {
		dano = d;
	}
	
	public String GetElemento() {
		return elemento;
	}
	public void SetElemento(String e) {
		elemento = e;
	}
	
	public abstract void Efeito(Heroi heroi);
}
