package com.projeto.finaru;

import java.util.ArrayList;
import java.util.Scanner;

import com.projeto.finaru.herois.Guerreiro;

public class Sistema {
	public ArrayList<Heroi> personagens;
	public ArrayList<Dungeon> dungeons;
	protected Scanner leitor;
	
	Sistema(){
		leitor = new Scanner(System.in);
		personagens = new ArrayList<Heroi>();
		dungeons = new ArrayList<Dungeon>();
	}
	
	public void criarPerosonagem() {
		String nome = "";
		System.out.println("# CRIA��O DE PERSONAGEM #");
		
		System.out.print("Escolha o nome do seu personagem: ");
		System.out.print(" ");
		
		nome = leitor.nextLine();
		
		System.out.println("Escolha a classe do seu personagem: ");
		System.out.println("1 - GUERREIRO");
		System.out.println("2 - MAGO");
		System.out.println("3 - LADINO");
		System.out.println(" ");
		
		int classe = Integer.parseInt(leitor.nextLine());
		
		if(classe == 1) {
			Heroi heroi = new Guerreiro(nome,50,10,0);
			personagens.add(heroi);
			System.out.println("Personagem Criado!");
			System.out.println(" ");
		}	
	}
	
	public Heroi escolherPersonagem() {
		
		boolean escolhido = false;
		int resposta = 0;
		
		while(escolhido == false) {
	
			for (int i = 0; i < this.personagens.size(); i++) {
				System.out.println("# SELE��O DE PERSONAGEM #");
				System.out.println(" ");
				System.out.println(i + " - " + personagens.get(i).getNome());
			}
			
			System.out.println(this.personagens.size() + " - " + "Criar novo personagem?");
			
			resposta =  Integer.parseInt(leitor.nextLine());
			
			if(resposta == this.personagens.size())
				this.criarPerosonagem();
			else {
				escolhido = true;
				
			}
				
		}
		
		System.out.println(" ");
		System.out.println("Personagem escolhido: " + personagens.get(resposta).getNome()+"!");
		return personagens.get(resposta);

	}
	
	public Dungeon escolherDungeon(){
		boolean escolhido = false;
		int resposta = 0;
		
		while(escolhido == false) {
		
			if(dungeons.size() == 0) {
				System.out.println("- Procurando Masmorra Mais Proxima...");
				System.out.println(" ");
				Dungeon dungeon = new Dungeon();
				dungeons.add(dungeon);
			}
			
			for (int i = 0; i < this.dungeons.size(); i++) {
				System.out.println("# SELE��O DE MASMORRA #");
				System.out.println(" ");
				System.out.println(i + " - " + dungeons.get(i).getNome());
			}
			
			System.out.println(this.dungeons.size() + " - " + "Procurar mais Masmorras?");
			
			resposta =  Integer.parseInt(leitor.nextLine());
			
			if(resposta >= this.dungeons.size()){
				System.out.println("- Procurando Mais Masmorras...");
				Dungeon dungeon = new Dungeon();
				dungeons.add(dungeon);
			}
			else 
				escolhido = true;	
		}
		
		System.out.println(" ");
		System.out.println("Masmorra escolhida: " + dungeons.get(resposta).getNome()+"!");
		return dungeons.get(resposta);
		
	}
}
