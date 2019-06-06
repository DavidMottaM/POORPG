package com.projeto.finaru;

public abstract class Sala {
	private int x;
	private int y;
	private boolean clear;
	
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
	
	public boolean getClear() {
		return clear;
	}
	public void setClear(boolean n) {
		clear = n;
	}
	
	public abstract void checarSaidas(Heroi heroi);
		
	
}
