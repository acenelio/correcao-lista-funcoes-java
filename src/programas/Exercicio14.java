package programas;

import java.util.Locale;
import java.util.Scanner;

import fisica.Conversao;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma temperatura em Fahrenheit: ");
		double F = sc.nextDouble();
		double C = Conversao.fahrenheitParaCelsius(F);
		System.out.printf("Temperatura em Celsius = %.2f%n", C);
		
		sc.close();
	}
}
