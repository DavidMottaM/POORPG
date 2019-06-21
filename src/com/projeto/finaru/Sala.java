package com.projeto.finaru;

import java.util.ArrayList;
import java.util.Scanner;

public class Sala {
//VARIÁVEIS///////////////////////////////////////
	private boolean paraDireita;
	private boolean paraEsquerda;
	private boolean paraCima;
	private boolean paraBaixo;

	Scanner leitor = new Scanner(System.in);
	
	public ArrayList<Monstro> monstros;
	public ArrayList<Item> itens;

	private int x;
	private int y;
	//public Monstro monstros[];
	public boolean visitada;
	public String textoEntrada = "";
	
//CONSTRUTOR/////////////////////////////////////
	public Sala(boolean paraDireita, boolean paraEsqueda, boolean paraCima, boolean paraBaixo, int x, int y, String t) {
		this.paraDireita = paraDireita;
		this.paraEsquerda = paraEsqueda;
		this.paraCima = paraCima;
		this.paraBaixo = paraBaixo;
		this.x = x;
		this.y = y;
		visitada = false;
		this.textoEntrada = t;
		monstros = new ArrayList<Monstro>(); 
		itens = new ArrayList<Item>(); 
	}
//MÉTODOS//////////////////////////////////////////
	protected  void entrada(Heroi heroi) {
		System.out.println(textoEntrada);
		//System.out.println("///////////////////////////// MENU /////////////////////////////");
		
		if (itens.size() > 0) {
			System.out.println("Voce achou um item!");
			System.out.println(itens.get(0).getNome() + " foi adicionado no seu inventario...");
			heroi.listaItem.add(itens.get(0));
			this.itens.remove(0);
			
		}
		
		if (monstros.size() > 0) {
			System.out.println("Um Monstro aparece!");
			System.out.println(monstros.get(0).getNome());
			this.batalha(heroi, monstros.get(0));
			
		}
	}
	
	protected void permanencia() {
		
	}
	
	protected void saida() {
		
	}
	
	public void mostrarOpcoes() {
		if(this.paraCima == true) {
			System.out.println("1 - Ir para cima");
		}
		
		if(this.paraBaixo) {
			System.out.println("2 - Ir para baixo");
		}
		
		if(this.paraEsquerda) {
			System.out.println("3 - Ir para esquerda");
		}
		
		if(this.paraDireita) {
			System.out.println("4 - Ir para direita");
		}
		
	}
	
	
	public boolean temMonstro() {
		return (monstros.size() > 0) ? true : false; 
		
	}
	
	public void batalha(Heroi heroi, Monstro monstro) {
	
		boolean turno = true;
		
		while(turno) {
			System.out.println("Seu Turno!");
			System.out.println(" ");
			System.out.println("////// MENU DE BATALHA //////");
			System.out.println("1 - Atacar");
			System.out.println("2 - Usar feitiço");
			System.out.println("3 - Usar item");
			
			int resposta = Integer.parseInt(leitor.nextLine());
			
			if(resposta == 1) {
				heroi.atacar(monstro);
				System.out.println("Você inflingiu "+ heroi.getForca()+ " de dano");
			}
			else if(resposta == 2) {
				
				if(heroi.lista_feitico.size() == 0) {
					System.out.println("Voce nao tem nenhum feitiço...");
					continue;
				}
				else {
					
					
					for (int i = 0; i < heroi.lista_feitico.size(); i++) {
						System.out.println(i + " - " + heroi.lista_feitico.get(i).getNome());
					}
					
					System.out.println(heroi.lista_feitico.size() + " - Voltar");
					
					int escolha = Integer.parseInt(leitor.nextLine());
					
					if (escolha == heroi.lista_feitico.size())
						continue;
					else 
						heroi.usarFeitico(heroi.lista_feitico.get(escolha), monstro);
						
					}
			    }
				
				else if(resposta == 3) {
					
					if(heroi.listaItem.size() == 0) {
						System.out.println("Voce nao tem nenhum Item...");
						continue;
					}else {
						
						for (int i = 0; i < heroi.listaItem.size(); i++) {
							System.out.println(i + " - " + heroi.listaItem.get(i).getNome());
						}
						
						System.out.println(heroi.listaItem.size() + " - Voltar");
						
						int escolha = Integer.parseInt(leitor.nextLine());
						
						if (escolha == heroi.listaItem.size())
							continue;
						else 
							heroi.listaItem.get(escolha).efeito(heroi);	
					
					}					
				
				}
				else {
					System.out.println("Resposta invalida");
					
				}
			
			
			if(monstro.getVida() <= 0) {
				System.out.println("Voce derrotou o monstro!");
				heroi.melhorarPoder();
				System.out.println("Voce passou para o Nível "+heroi.getLevel()+"!");
				this.monstros.remove(0);
				break;
			}
			
			System.out.println("Turno do Monstro!");
			System.out.println(" ");
			System.out.println("O monstro ataca!");
			monstro.atacar(heroi);
			
			System.out.println("Voce recebeu " + (monstro.getAtaque()+monstro.getLevel())+" de dano");
			
			if(heroi.getVidaAtual() <= 0) {
				System.out.println("Voce morreu... :(");
				System.out.println("da proxima vez tente usar mais poçoes de vida...");
				System.out.println(" ");
				System.out.println("////// FIM DE JOGO //////");
				System.exit(0);
			}
			
		}		
	}
//GETS/////////////////////////////////////////////
	public boolean getParaDireita() {
		return this.paraDireita;
	}
	public boolean getParaEsquerda() {
		return this.paraEsquerda;
	}
	public boolean getParaCima() {
		return this.paraCima;
	}
	public boolean getParaBaixo() {
		return this.paraBaixo;
	}
//SETS/////////////////////////////////////////////////////
	public void setParaDireita(boolean paraDireita) {
		this.paraDireita = paraDireita;
	}
	public void setParaEsquerda(boolean paraEsquerda) {
		this.paraEsquerda = paraEsquerda;
	}
	public void setParaCima(boolean paraCima) {
		this.paraCima = paraCima;
	}
	public void setParaBaixo(boolean paraBaixo) {
		this.paraBaixo = paraBaixo;
	}
}