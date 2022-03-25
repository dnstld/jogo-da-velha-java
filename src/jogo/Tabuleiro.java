package jogo;

public class Tabuleiro {
	
	/**
	 * Cria a estrutura do tabuleiro 2D
	 */
	char [][] tab = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
	
	/**
	 * Retorna a variavel tab
	 */
	public char[][] getTab() {
		return tab;
	}
	
	/**
	 * Adiciona o simbolo da jogada na posicao enviada
	 */
	public void setTab(int p1, int p2, char simbolo) {
		tab[p1][p2] = simbolo;
	}
	
	/**
	 * Retorna o item da tabela na posicao indicada
	 */
	public char getTabPosition(int p1, int p2) {
		return tab[p1][p2];
	}
	
	/**
	 * Mostra as instrucoes do jogo antes de iniciar a partida
	 */
	public void tutorial () {
		System.out.println("Instrucoes:");
		System.out.println("Digite o numero referente a sua jogada como indicado abaixo.");
		System.out.println();
		System.out.println(1 + "|" + 2 + "|" + 3);
		System.out.println("-+-+-");
		System.out.println(4 + "|" + 5 + "|" + 6);
		System.out.println("-+-+-");
		System.out.println(7 + "|" + 8 + "|" + 9);
		System.out.println();
	}
	
	/**
	 * Mostra o tabuleiro
	 */
	public void visualizar () {
		System.out.println();
		System.out.println(tab[0][0] + "|" + tab[0][1] + "|" + tab[0][2]);
		System.out.println("-+-+-");
		System.out.println(tab[1][0] + "|" + tab[1][1] + "|" + tab[1][2]);
		System.out.println("-+-+-");
		System.out.println(tab[2][0] + "|" + tab[2][1] + "|" + tab[2][2]);
		System.out.println();
	}
	
	/**
	 * Verifica se a posicao escolhida esta disponivel para a jogada
	 */
	public boolean jogadaValida(String posicao) {
		switch(posicao) {
			case "1":
				return (tab[0][0] == ' ');
			case "2":
				return (tab[0][1] == ' ');
			case "3":
				return (tab[0][2] == ' ');
			case "4":
				return (tab[1][0] == ' ');
			case "5":
				return (tab[1][1] == ' ');
			case "6":
				return (tab[1][2] == ' ');
			case "7":
				return (tab[2][0] == ' ');
			case "8":
				return (tab[2][1] == ' ');
			case "9":
				return (tab[2][2] == ' ');
			default:
				return false;
			
		}
	}
	
	/**
	 * Executa as jogadas de ambos participantes
	 */
	public void jogar(String posicao, char simbolo) {
		switch(posicao) {
			case "1":
				setTab(0, 0, simbolo);
				break;
			case "2":
				setTab(0, 1, simbolo);
				break;
			case "3":
				setTab(0, 2, simbolo);
				break;
			case "4":
				setTab(1, 0, simbolo);
				break;
			case "5":
				setTab(1, 1, simbolo);
				break;
			case "6":
				setTab(1, 2, simbolo);
				break;
			case "7":
				setTab(2, 0, simbolo);
				break;
			case "8":
				setTab(2, 1, simbolo);
				break;
			case "9":
				setTab(2, 2, simbolo);
				break;
			default:
				System.out.println("Ops! O numero digitado deve ser de 1 a 9. Tente novamente!");
				
		}
	}
	
	/**
	 * Verifica se alguem venceu ou se houve empate
	 */
	public boolean situacao() {
		// Checa se o participante venceu
		if (checaVitoria('X')) {
			visualizar();
			System.out.println("Parabens. Voce venceu!");
			return true;
		}
		
		// Checa se o computador venceu
		if (checaVitoria('O')) {
			visualizar();
			System.out.println("Nao foi desta vez. O computador venceu!");
			return true;
		}
		
		// Checa se ainda ha espacos disponiveis para jogadas
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				if (tab[i][j] == ' ') {
					return false;
				}
			}
		}
		
		visualizar();
		
		System.out.println("O jogo empatou!");
		
		return true;
	}
	
	/**
	 * Retorna se houve um vencedor ou nao
	 */
	private boolean checaVitoria(char simbolo) {
		if (
				// Casos de vitoria nas fileiras
				(tab[0][0] == simbolo && tab[0][1] == simbolo && tab[0][2] == simbolo) ||
				(tab[1][0] == simbolo && tab[1][1] == simbolo && tab[1][2] == simbolo) ||
				(tab[2][0] == simbolo && tab[2][1] == simbolo && tab[2][2] == simbolo) ||
				
				// Casos de vitorias nas colunas
				(tab[0][0] == simbolo && tab[1][0] == simbolo && tab[2][0] == simbolo) ||
				(tab[0][1] == simbolo && tab[1][1] == simbolo && tab[2][1] == simbolo) ||
				(tab[0][2] == simbolo && tab[1][2] == simbolo && tab[2][2] == simbolo) ||
				
				// Casos de vitorias nas transversais
				(tab[0][0] == simbolo && tab[1][1] == simbolo && tab[2][2] == simbolo) ||
				(tab[0][2] == simbolo && tab[1][1] == simbolo && tab[2][0] == simbolo)) {
			
			return true;
		}
		
		return false;
	}
}
