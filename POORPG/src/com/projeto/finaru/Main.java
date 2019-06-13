package com.projeto.finaru;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Sistema sistema = new Sistema();
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		boolean sair = false;
		Heroi peronagem;
		Dungeon dungeon;
		
		System.out.println("Bem vindx à SMD - Super Masmorras Delirantes");
		
		while(sair == false) {
			System.out.println("///////MENU///////");
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
			}
			if (opcao == 3) {
				
				System.out.println("-Voce escolheu a opcao 3");
				sair = true;
			}
		}
	}
}
