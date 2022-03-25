package jogo;

public class ComputadorFacil extends Computador {
	public ComputadorFacil() {
		super();
	}

	/**
	 * Valida a faz a jogada de forma sequencial (1-9)
	 */
	@Override
	public void jogada(Tabuleiro tabuleiro) {
		int posicaoJogada = 1;
		
		// comecando da posicao 1 ate a 9
		for (int i = 1; i <= 9; i++) {
			// faz a jogada na primeira posicao disponivel
			if (tabuleiro.jogadaValida(Integer.toString(i))) {
				posicaoJogada = i;
				break;
			}
		}
		
		System.out.println("Seu oponente jogou na posisao " + posicaoJogada);
		
		// Executa a jogada
		tabuleiro.jogar(Integer.toString(posicaoJogada), 'O');
	}
}
