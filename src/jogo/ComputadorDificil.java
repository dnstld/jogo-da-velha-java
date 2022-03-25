package jogo;

public class ComputadorDificil extends Computador {
	private int posicaoJogada = 0;
	
	public ComputadorDificil() {
		super();
	}
	
	/**
	 * Verifica todas as possibilidade do jogar terminar
	 * - Checa linhas horizontais
	 * - Checa linhas verticais
	 * - Checa linhas transversais
	 */
	private int possibilidadesFinalDeJogo(Tabuleiro tabuleiro, char simbolo) {
		// Possibilidades de vitoria nas linhas
		if (tabuleiro.getTabPosition(0, 0) == simbolo && tabuleiro.getTabPosition(0, 1) == simbolo && tabuleiro.getTabPosition(0, 2) == ' ' ) { posicaoJogada = 3; }
		else if (tabuleiro.getTabPosition(0, 0) == simbolo && tabuleiro.getTabPosition(0, 2) == simbolo && tabuleiro.getTabPosition(0, 1) == ' ') { posicaoJogada = 2; }
		else if (tabuleiro.getTabPosition(0, 1) == simbolo && tabuleiro.getTabPosition(0, 2) == simbolo && tabuleiro.getTabPosition(0, 0) == ' ') { posicaoJogada = 1; }
		
		else if (tabuleiro.getTabPosition(1, 0) == simbolo && tabuleiro.getTabPosition(1, 1) == simbolo && tabuleiro.getTabPosition(1, 2) == ' ') { posicaoJogada = 6; }
		else if (tabuleiro.getTabPosition(1, 0) == simbolo && tabuleiro.getTabPosition(1, 2) == simbolo && tabuleiro.getTabPosition(1, 1) == ' ') { posicaoJogada = 5; }
		else if (tabuleiro.getTabPosition(1, 1) == simbolo && tabuleiro.getTabPosition(1, 2) == simbolo && tabuleiro.getTabPosition(1, 0) == ' ') { posicaoJogada = 4; }
		
		else if (tabuleiro.getTabPosition(2, 0) == simbolo && tabuleiro.getTabPosition(2, 1) == simbolo && tabuleiro.getTabPosition(2, 2) == ' ') { posicaoJogada = 9; }
		else if (tabuleiro.getTabPosition(2, 0) == simbolo && tabuleiro.getTabPosition(2, 2) == simbolo && tabuleiro.getTabPosition(2, 1) == ' ') { posicaoJogada = 8; }
		else if (tabuleiro.getTabPosition(2, 1) == simbolo && tabuleiro.getTabPosition(2, 2) == simbolo && tabuleiro.getTabPosition(2, 0) == ' ') { posicaoJogada = 7; }
		
		// Possibilidades de vitoria do participante nas colunas
		else if (tabuleiro.getTabPosition(0, 0) == simbolo && tabuleiro.getTabPosition(1, 0) == simbolo && tabuleiro.getTabPosition(2, 0) == ' ') { posicaoJogada = 7; }
		else if (tabuleiro.getTabPosition(0, 0) == simbolo && tabuleiro.getTabPosition(2, 0) == simbolo && tabuleiro.getTabPosition(1, 0) == ' ') { posicaoJogada = 4; }
		else if (tabuleiro.getTabPosition(1, 0) == simbolo && tabuleiro.getTabPosition(2, 0) == simbolo && tabuleiro.getTabPosition(0, 0) == ' ') { posicaoJogada = 1; }
		
		else if (tabuleiro.getTabPosition(0, 1) == simbolo && tabuleiro.getTabPosition(1, 1) == simbolo && tabuleiro.getTabPosition(2, 1) == ' ') { posicaoJogada = 8; }
		else if (tabuleiro.getTabPosition(0, 1) == simbolo && tabuleiro.getTabPosition(2, 1) == simbolo && tabuleiro.getTabPosition(1, 1) == ' ') { posicaoJogada = 5; }
		else if (tabuleiro.getTabPosition(1, 1) == simbolo && tabuleiro.getTabPosition(2, 1) == simbolo && tabuleiro.getTabPosition(0, 1) == ' ') { posicaoJogada = 2; }
		
		else if (tabuleiro.getTabPosition(0, 2) == simbolo && tabuleiro.getTabPosition(1, 2) == simbolo && tabuleiro.getTabPosition(2, 2) == ' ') { posicaoJogada = 9; }
		else if (tabuleiro.getTabPosition(0, 2) == simbolo && tabuleiro.getTabPosition(2, 2) == simbolo && tabuleiro.getTabPosition(1, 2) == ' ') { posicaoJogada = 6; }
		else if (tabuleiro.getTabPosition(1, 2) == simbolo && tabuleiro.getTabPosition(2, 2) == simbolo && tabuleiro.getTabPosition(0, 2) == ' ') { posicaoJogada = 3; }
		
		// // Possibilidades de vitoria do participante nas transversais
		else if (tabuleiro.getTabPosition(0, 0) == simbolo && tabuleiro.getTabPosition(1, 1) == simbolo && tabuleiro.getTabPosition(2, 2) == ' ') { posicaoJogada = 9; }
		else if (tabuleiro.getTabPosition(0, 0) == simbolo && tabuleiro.getTabPosition(2, 2) == simbolo && tabuleiro.getTabPosition(1, 1) == ' ') { posicaoJogada = 5; }
		else if (tabuleiro.getTabPosition(1, 1) == simbolo && tabuleiro.getTabPosition(2, 2) == simbolo && tabuleiro.getTabPosition(0, 0) == ' ') { posicaoJogada = 1; }
		
		else if (tabuleiro.getTabPosition(0, 2) == simbolo && tabuleiro.getTabPosition(1, 1) == simbolo && tabuleiro.getTabPosition(2, 0) == ' ') { posicaoJogada = 7; }
		else if (tabuleiro.getTabPosition(0, 2) == simbolo && tabuleiro.getTabPosition(2, 0) == simbolo && tabuleiro.getTabPosition(1, 1) == ' ') { posicaoJogada = 5; }
		else if (tabuleiro.getTabPosition(1, 1) == simbolo && tabuleiro.getTabPosition(2, 0) == simbolo && tabuleiro.getTabPosition(0, 2) == ' ') { posicaoJogada = 3; }
		
		return posicaoJogada;
	}
	
	/**
	 * Executa a jogada na posicao 5
	 */
	private void possibilidadeDeJogadaNoMeio(Tabuleiro tabuleiro) {
		if (tabuleiro.getTabPosition(1, 1) == ' ') {
			posicaoJogada = 5;
		}
	}
	
	/**
	 * Executa a jogada nas posicoes 1, 3, 7, 9
	 */
	private void possibilidadesDeJogadaNasQuinas(Tabuleiro tabuleiro) {
		if (tabuleiro.getTabPosition(1, 1) == 'X') {
			if (tabuleiro.getTabPosition(0, 0) != 'X' && tabuleiro.getTabPosition(0, 0) == ' ') { posicaoJogada = 1; }
			else if (tabuleiro.getTabPosition(0, 2) != 'X' && tabuleiro.getTabPosition(0, 2) == ' ') { posicaoJogada = 3; }
			else if (tabuleiro.getTabPosition(2, 0) != 'X' && tabuleiro.getTabPosition(2, 0) == ' ') { posicaoJogada = 7; }
			else if (tabuleiro.getTabPosition(2, 2) != 'X' && tabuleiro.getTabPosition(2, 2) == ' ') { posicaoJogada = 9; }
		}
	}
	
	/**
	 * Executa a jogada nas posicoes 2, 4, 6 ou 8
	 */
	private void possibilidadesDeJogadasRestantes(Tabuleiro tabuleiro) {
		if (posicaoJogada == 0) {
			for (int i = 2; i < 9; i += 2) {
				// faz a jogada nas opcoes disponiveis (2,4 6 ou 8)
				if (tabuleiro.jogadaValida(Integer.toString(i))) {
					posicaoJogada = i;
					break;
				}
			}
		}
	}

	/**
	 * Valida e faz a jogada checando possibilidades de vitoria e derrota
	 */
	@Override
	public void jogada(Tabuleiro tabuleiro) {
		// Verifica possibilidades de vitoria do computador
		possibilidadesFinalDeJogo(tabuleiro,'O');
				
		// Verifica possibilidades de vitoria do participante
		possibilidadesFinalDeJogo(tabuleiro, 'X');

		// Faz primeira jogada na posicao do meio se ainda nao tiver preenchida pelo participante
		possibilidadeDeJogadaNoMeio(tabuleiro);
		
		// Faz primeira jogada em algumas das quinas se ainda nao tiver preenchida pelo participante
		possibilidadesDeJogadaNasQuinas(tabuleiro);
		
		// Faz a jogada em uma das casas restantes se ainda nao tiver preenchida pelo participante
		possibilidadesDeJogadasRestantes(tabuleiro);
		
		
		if (!tabuleiro.jogadaValida(Integer.toString(posicaoJogada))) {
			return;
		}
		
		System.out.println("Seu oponente jogou na posisao " + posicaoJogada);
		
		// Executa a jogada
		tabuleiro.jogar(Integer.toString(posicaoJogada), 'O');
	}
}
