package com.projeto.finaru;

public abstract class Item {
	private String frase;
	
	public String GetFrase() {
		return frase;
	}
	public void SetFrase(String f) {
		frase = f;
	}
	
	public abstract void Efeito(Heroi heroi);

}
