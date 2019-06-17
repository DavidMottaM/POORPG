package com.projeto.finaru;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Sistema sistema = new Sistema();
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		boolean sair = false;
		Heroi personagem;
		Dungeon dungeon;
		
		System.out.println("-----------------{ Bem vindx a SMD - Super Masmorras Delirantes }-----------------");
		System.out.println(" ");
		System.out.println(" ");
		
		while(sair == false) {
			System.out.println("///////////////////////////// MENU PRICIPAL /////////////////////////////");
			System.out.println("-Escolha sua opcao:");
			System.out.println(" ");
			System.out.println("1 - CRIAR PERSONAGEM ");
			System.out.println("2 - COMEÇAR JOGO ");
			System.out.println("3 - SAIR ");
			System.out.println(" ");
			
			opcao = Integer.parseInt(leitor.nextLine());
			
			if (opcao == 1) {
				
				System.out.println("-Voce escolheu a opcao 1");
				sistema.criarPerosonagem();
			}
			
			if (opcao == 2) {
				
				System.out.println("-Voce escolheu a opcao 2");
				System.out.println(" ");
				System.out.println("Hora de escolher seu personagem!");
				
				personagem = sistema.escolherPersonagem();
				
				System.out.println(" ");
				System.out.println("Hora de escolher a Masmorra!");
				
				dungeon = sistema.escolherDungeon();
				
				System.out.println(" ");
				System.out.println("Deseja Iniciar a Masmorra? Essa e sua ultima chance de retornar!");
				System.out.println(" ");
				System.out.println("1 - SIM");
				System.out.println("2 - NAO");
				
				int resposta = Integer.parseInt(leitor.nextLine());
				
				if (resposta == 1) {
					System.out.println("iniciar");
				}
				else
					continue;
			}
			if (opcao == 3) {
				
				System.out.println("-Voce escolheu a opcao 3");
				sair = true;
			}
		}
	}
}
