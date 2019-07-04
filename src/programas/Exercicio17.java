package programas;

import java.util.Locale;
import java.util.Scanner;

import escola.Notas;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite as três notas obtidas no ano: ");
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();

		double resultado = Notas.notaFinal(nota1, nota2, nota3);
		System.out.printf("Nota final = %.2f%n", resultado);
		
		sc.close();
	}
}
