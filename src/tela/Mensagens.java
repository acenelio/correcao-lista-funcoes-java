package tela;

public class Mensagens {
	
	public static void mostrarCabecalho() {
		System.out.println("Nelio Alves");
		System.out.println("Matr�cula: 8374, Ano: 2019 - noturno");
	}
	
	public static void mostrarDisciplinas() {
		System.out.println("L�gica de Programa��o - 105h");
		System.out.println("Fundamentos de Web Design - 75h");
		System.out.println("Projeto Integrador 1 - 45h");
		System.out.println("Sistemas Operacionais - 30h");
		System.out.println("Ingl�s Instrumental - 30h");
		System.out.println("Metodologia Cient�fica - 30h");
		System.out.println("Arquitetura e Organiza��o de Computadores - 45h");
	}
	
	public static void mostrarOnlineOffline(int N) {
		for (int i=0; i<N; i++) {
			System.out.println("Online ou offline?");
		}
	}
	
	public static void mostrarTabuada(int N) {
		for (int i=1; i<=10; i++) {
			int resultado = N * i;
			System.out.println(N + " x " + i + " = " + resultado);
		}
	}
}
