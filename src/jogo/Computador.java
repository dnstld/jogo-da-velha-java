package jogo;

/**
 * Classe abstrata representando um computador
 */
public abstract class Computador {
	/**
	 * Metodo obrigatorio que deve ser implementado pelas classes filhas
	 */
	abstract void jogada(Tabuleiro tabuleiro);
}
