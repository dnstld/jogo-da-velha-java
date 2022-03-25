package jogo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro();
		Jogador jogador = new Jogador();
		
		// Mostra instrucoes da escolha do nivel
		System.out.println("Digite 1, 2 ou 3 para escolher o nivel:");
		System.out.println("1: Facil");
		System.out.println("2: Medio");
		System.out.println("3: Dificil");
		
		Computador computador = null;
		
		System.out.println("1 -----");
		Scanner teclado = new Scanner(System.in);
		System.out.println("2 -----");
		
		// Valida se o participante digitou 1, 2 ou 3
		int nivelDoComputador = teclado.nextInt();
		System.out.println("3 -----");
		
		boolean sucessoLeituraNivel = false;
		
		while (!sucessoLeituraNivel) {
			try {
				jogador.nivel(nivelDoComputador);
				sucessoLeituraNivel = true;
			} catch (Exception e) {
				sucessoLeituraNivel = false;
				
				System.out.println("Erro: " + e.getMessage());
				
				System.out.println("Digite novamente:");
				nivelDoComputador = teclado.nextInt();
			}
		}
		
		// Decide o computador adversario de acordo com o nivel escolhido
		if (nivelDoComputador == 1) {
			computador = new ComputadorFacil();
		} else if (nivelDoComputador == 2) {
			computador = new ComputadorMedio();
		} else {
			computador = new ComputadorDificil();
		}
		
		// Mostra as instrucoes do jogo
		tabuleiro.tutorial();
		
		System.out.println("O jogo ja vai comecar \\o/");
		System.out.println("Voce eh o simbolo simbolo");
		
		// Mostra tabuleiro vazio
		tabuleiro.visualizar();
		
		// Executa as jogadas ate o jogo terminar
		while (true) {
			
			// Executa a jogada do participante
			jogador.jogada(tabuleiro, teclado);
			
			// Checa se o participante ganhou ou se o jogo empatou
			if (tabuleiro.situacao()) {
				break;
			}
			
			// Mostra o tabuleiro com a jogada do participante
			tabuleiro.visualizar();
			
			// Executa a jogada do computador
			computador.jogada(tabuleiro);
			
			// Checa se o computador ganhou ou se o jogo empatou
			if (tabuleiro.situacao()) {
				break;
			}
			
			// Mostra o tabuleiro com a jogada do computador 
			tabuleiro.visualizar();
			
		}
	}

}
