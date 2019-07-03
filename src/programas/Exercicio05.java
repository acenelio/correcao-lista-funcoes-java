package programas;

import java.util.Scanner;

import tela.Mensagens;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		Mensagens.mostrarTabuada(N);
		
		sc.close();
	}
}
