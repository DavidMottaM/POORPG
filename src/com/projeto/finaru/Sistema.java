package com.projeto.finaru;

import java.util.ArrayList;
import java.util.Scanner;

import com.projeto.finaru.herois.Guerreiro;
import com.projeto.finaru.herois.Ladino;
import com.projeto.finaru.herois.Mago;

public class Sistema {
	private static final int ArrayList = 0;
	public ArrayList<Heroi> personagens;
	public ArrayList<Dungeon> dungeons;
	protected Scanner leitor;
	
	Sistema(){
		leitor = new Scanner(System.in);
		personagens = new ArrayList<Heroi>();
		dungeons = new ArrayList<Dungeon>();
	}
	
	public void criarPersonagem() throws OpcaoInexistenteException {
		String nome = "";
		System.out.println("# CRIAÇÃO DE PERSONAGEM #");
		
		System.out.print("Escolha o nome do seu personagem: ");
		System.out.print(" ");
		
		nome = leitor.nextLine();
		
		System.out.println("Escolha a classe do seu personagem: ");
		System.out.println("1 - GUERREIRO");
		System.out.println("2 - MAGO");
		System.out.println("3 - LADINO");
		System.out.println(" ");
		
		int classe = Integer.parseInt(leitor.nextLine());
		
		PocaoVida p = new PocaoVida("poção", "uma poção de vida");
		ElixirPoder x = new ElixirPoder("elixir", "elixir poder");
		
		ArrayList<Item> itemMago = new ArrayList<Item>();
		itemMago.add(p);
		itemMago.add(x);
		itemMago.add(p);
		itemMago.add(x);
		ArrayList<Item> itemLadino = new ArrayList<Item>();
		itemLadino.add(p);
		itemLadino.add(x);
		ArrayList<Item> itemGuerreiro = new ArrayList<Item>();
		itemGuerreiro.add(p);
		itemGuerreiro.add(x);
		
		if(classe == 1) {
			Heroi heroi = new Guerreiro(nome,50,10,1, itemGuerreiro);
			personagens.add(heroi);
			System.out.println("Guerreiro criado!");
			System.out.println(" ");
		}else if(classe == 2) {
			Heroi heroi = new Mago(nome,20,5,12, itemMago);
			personagens.add(heroi);
			System.out.println("Mago criado!");
			System.out.println(" ");
		}else if(classe == 3) {
			Heroi heroi = new Ladino(nome,30,12,2, itemLadino);
			personagens.add(heroi);
			System.out.println("Ladino criado!");
			System.out.println(" ");
		}else {
			throw new OpcaoInexistenteException("Selecione uma opção existente");
		}	
	}
	
	public Heroi escolherPersonagem() throws OpcaoInexistenteException {
		
		boolean escolhido = false;
		int resposta = 0;
		
		while(escolhido == false) {
	
			for (int i = 0; i < this.personagens.size(); i++) {
				System.out.println("# SELEÇÃO DE PERSONAGEM #");
				System.out.println(" ");
				System.out.println(i + " - " + personagens.get(i).getNome());
			}
			
			System.out.println(this.personagens.size() + " - " + "Criar novo personagem?");
			
			resposta =  Integer.parseInt(leitor.nextLine());
			
			if(resposta == this.personagens.size())
				this.criarPersonagem();
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
				System.out.println("- Procurando masmorra mais próxima...");
				System.out.println(" ");
				Dungeon dungeon = new Dungeon();
				dungeons.add(dungeon);
			}
			
			for (int i = 0; i < this.dungeons.size(); i++) {
				System.out.println("# SELEÇÃO DE MASMORRA #");
				System.out.println(" ");
				System.out.println(i + " - " + dungeons.get(i).getNome());
			}
			
			System.out.println(this.dungeons.size() + " - " + "Procurar mais masmorras?");
			
			resposta =  Integer.parseInt(leitor.nextLine());
			
			if(resposta >= this.dungeons.size()){
				System.out.println("- Procurando mais masmorras...");
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
