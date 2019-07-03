package programas;

import java.util.Locale;
import java.util.Scanner;

import financeiro.Financiamento;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor do imóvel: ");
		double valorDoImovel = sc.nextDouble();
		System.out.println("Valor da entrada: ");
		double valorDaEntrada = sc.nextDouble();
		System.out.println("Número de prestações: ");
		int prestacoes = sc.nextInt();
		
		Financiamento.mostrarValorDaPrestacao(valorDoImovel, valorDaEntrada, prestacoes);

		sc.close();
	}
}
