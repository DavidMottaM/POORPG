package com.projeto.finaru;

import java.util.ArrayList;
import java.util.Scanner;

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
		System.out.println("# CRIAÇÃO DE PERSONAGEM #");
		
		System.out.print("Escolha o nome do seu personagem: ");
		System.out.print(" ");
		
		nome = leitor.nextLine();
		System.out.println(nome);
		
		System.out.println("Escolha a classe do seu personagem: ");
		System.out.println("1 - GUERREIRO");
		System.out.println("2 - MAGO");
		System.out.println("3 - LADINO");
		System.out.println(" ");
		
		String classe = leitor.nextLine();
		System.out.println(classe);
		
		
	}
}
