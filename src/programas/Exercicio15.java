package programas;

import java.util.Locale;
import java.util.Scanner;

import financeiro.Cambio;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor em reais: ");
		double reais = sc.nextDouble();
		System.out.print("Digite a cotação do dólar: ");
		double cotacao = sc.nextDouble();
		
		double dolares = Cambio.realParaDolar(reais, cotacao);
		System.out.printf("Valor em dólar: %.2f%n", dolares);
		
		sc.close();
	}
}
