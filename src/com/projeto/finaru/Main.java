package com.projeto.finaru;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Sistema sistema = new Sistema();
		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		int opcaoDirecao = 0;
		boolean sair = false;
		Heroi personagem;
		Dungeon dungeon;
		Sala masmorraAtual;
		
		int atualX = 0;
		int atualY = 0;
		
		/////Criando mapa////////////////////////////////////////////////////////////////
		//boolean paraDireta, boolean paraEsqueda, boolean paraCima, boolean paraBaixo, int x, int y)
		Sala a = new Sala(false, false, true, false, 0, 0, "você entra na masmorra em busca de novas aventuras");
		Sala b = new Sala(true, false, false, true, 0, 1, "Você percebe alguns esqueletos no chão");
		Sala c = new Sala(false, true, true, true, 1, 1, "uma armadilha foi acionada, mas você conseguiu escapar ileso");
		Sala d = new Sala(true, false, false, true, 1, 2,"Os ratos correm pelo chão. Esta cada vez mais dificil Enxergar em meio a escuridão ");
		Sala e = new Sala(true, true, false, false, 2, 2, "As sombras parecem cada vez mais assustadoras");
		Sala f = new Sala(false, true, true, true, 3, 2, "Com coragem, você abre a porta, e mais uma sala está vazia");
		Sala g = new Sala(false, true, false, true, 3, 3,"Você encontra um baú com Poções");
		Sala h = new Sala(true, true, false, false, 2, 3,"Você ja não consegue mais ouvir os sons da floresta");
		Sala i = new Sala(true, true, false, false, 1, 3,"Você escuta sons de correntes");
		Sala j = new Sala(true, false, false, false, 0, 3,"Nada aqui");
		Sala k = new Sala(false, false, true, false, 3, 1,"mais um lugar silencioso");
		Sala l = new Sala(true, false, true, false, 1, 0,"Ei! você quer comprar alguns tesouros? diz um comerciante");
		Sala m = new Sala(true, true, false, false, 2, 0,"Goblins pulam em você, não deixe eles te derrotarem!");
		Sala n = new Sala(false, true, false, false, 3, 0,"uma fonte de aguas cristalinas parece um bom lugar para descansar");
		
		Sala [] [] masmorra = new Sala [4][4];
		masmorra[0][0] = a;
		masmorra[0][1] = b;
		masmorra[1][1] = c;
		masmorra[1][2] = d;
		masmorra[2][2] = e;
		masmorra[3][2] = f;
		masmorra[3][3] = g;
		masmorra[2][3] = h;
		masmorra[1][3] = i;
		masmorra[0][3] = j;
		masmorra[3][1] = k;
		masmorra[1][0] = l;
		masmorra[2][0] = m;
		masmorra[3][0] = n;
		
		masmorraAtual = masmorra[atualX][atualY];
		
		
		
		
		
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
				sistema.criarPersonagem();
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
					
					///////////O jogo acontece aqui bebê//////////////////////////////////
					while(true) {
						
						masmorraAtual.mostrarOpcoes();
						
						opcaoDirecao = Integer.parseInt(leitor.nextLine());
						
						switch(opcaoDirecao) {
						
							case 1:
								atualY++;
							break;
							case 2:
								atualY--;
							break;
							case 3:
								atualX--;
							break;
							case 4:
								atualX++;
							break;
						}
						
						masmorraAtual = masmorra[atualX][atualY];
						masmorraAtual.entrada();
					}
					
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
