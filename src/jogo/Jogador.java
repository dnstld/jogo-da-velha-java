package jogo;

import java.util.Scanner;

public class Jogador {
	
	/**
	 * Valida se o participante digitou 1, 2 ou 3 na escolha do nivel
	 */
	public int nivel(int nivelEscolhido) throws Exception {

		if (nivelEscolhido < 1 || nivelEscolhido > 3) {
			throw new Exception("Escolha entre as opcoes 1, 2 ou 3.");
		}
		
		return nivelEscolhido;
	}

	/**
	 * Valida a jogada do participante antes de executa-la
	 */
	public void jogada(Tabuleiro tabuleiro, Scanner scanner) {		
		String posicaoJogada;
		
		while (true) {
			System.out.println("Eh a sua vez! Digite onde quer jogar. (1-9)");

			posicaoJogada = scanner.next();
			
			// Checa se o lugar escolhido esta disponivel
			if (tabuleiro.jogadaValida(posicaoJogada)) {
				break;
			} else {
				System.out.println("Esse lugar ja foi escolhido: " + posicaoJogada);
			}
		}
		
		// Executa a jogada
		tabuleiro.jogar(posicaoJogada, 'X');
	}
}
