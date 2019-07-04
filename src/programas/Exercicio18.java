package programas;

import java.util.Locale;
import java.util.Scanner;

import matematica.Calculos;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quatro valores num�ricos: ");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		
		double resultado = Calculos.maiorDentreQuatro(n1, n2, n3, n4);
		System.out.printf("Maior = %.2f%n", resultado);
		
		sc.close();
	}
}
