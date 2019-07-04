package programas;

import java.util.Locale;
import java.util.Scanner;

import saude.Nutricao;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite seu peso: ");
		double peso = sc.nextDouble();
		System.out.print("Digite sua altura: ");
		double altura = sc.nextDouble();
		
		Nutricao.classificarImc(peso, altura);
				
		sc.close();
	}
}
