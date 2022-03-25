package jogo;

import java.util.Random;

public class ComputadorMedio extends Computador {
	public ComputadorMedio() {
		super();
	}

	/**
	 * Valida e faz a jogada de forma randomica
	 */
	@Override
	public void jogada(Tabuleiro tabuleiro) {
		Random rand = new Random();
		
		int posicaoJogada;
		
		while (true) {
			// gera numero randomico entra 1 e 9
			posicaoJogada = rand.nextInt(9) + 1;
			
			// Checa se o lugar escolhido esta disponivel
			if (tabuleiro.jogadaValida(Integer.toString(posicaoJogada))) {
				break;
			}
			
		}
		
		System.out.println("Seu oponente jogou na posisao " + posicaoJogada);
		
		// Executa a jogada
		tabuleiro.jogar(Integer.toString(posicaoJogada), 'O');
	}
}
