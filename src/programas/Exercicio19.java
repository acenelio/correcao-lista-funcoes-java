package programas;

import java.util.Locale;
import java.util.Scanner;

import matematica.Calculos;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor da base: ");
		double base = sc.nextDouble();
		System.out.print("Digite o valor da altura: ");
		double altura = sc.nextDouble();
		
		System.out.printf("DIAGONAL = %.2f%n", Calculos.diagonalRetangulo(base, altura));
		System.out.printf("AREA = %.2f%n", Calculos.areaRetangulo(base, altura));
		System.out.printf("PERÍMETRO = %.2f%n", Calculos.perimetroRetangulo(base, altura));
		
		sc.close();
	}
}
