package programas;

import java.util.Locale;
import java.util.Scanner;

import saude.Nutricao;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		double peso = sc.nextDouble();
		System.out.print("Digite sua altura: ");
		double altura = sc.nextDouble();
		
		double resultado = Nutricao.imc(peso, altura);
		
		System.out.printf("Seu imc = %.2f%n", resultado);
		
		sc.close();
	}
}
