package com.projeto.finaru;

import java.util.Random;

import com.projeto.finaru.monstros.Goblin;
public class Dungeon {

	Sala[][] salas = new Sala[4][4];
	
	String nome;
	String[] nomes1 = new String[] {"Naill","Efferil","Mellerelel","Ari","Beiro","Ariessus"};
	String[] nomes2 = new String[] {"Faen","Naal","Ethanasath","Innil","Galinndan","Floshem"};
	
	Random gerador;
	
	Dungeon(){
		gerador = new Random();
		this.nome = "Masmorra de " + nomes1[gerador.nextInt(6)] +" "+ nomes2[gerador.nextInt(6)];
		

		for (int i = 0; i < salas[0].length; i++) {
			
			for (int j = 0; j < salas[0].length; j++) {
				
				//salas[i][j] = new Sala();
				int temMonstro = gerador.nextInt(100);
				int temItem = gerador.nextInt(100);
				
				if (temMonstro <= 50) {
					//salas[i][j].monstros.add(new Goblin());
				}
			}
		}

//		for (int i = 0; i < salas[0].length; i++) {
//			
//			for (int j = 0; j < salas[0].length; j++) {
//				
//				salas[i][j] = new Sala();
//			}
//		}

		
	}
	
	public void iniciarDungeon() {
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
}
