package programas;

import java.util.Locale;
import java.util.Scanner;

import saude.Hemograma;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre o valor de glicose: ");
		double glicose = sc.nextDouble();
		System.out.print("Entre o valor de triglicer�deos: ");
		double trig = sc.nextDouble();
		System.out.print("Entre o valor de colesterol: ");
		double colesterol = sc.nextDouble();
		
		System.out.print("Classifica��o de glicose: ");
		Hemograma.classificarGlicose(glicose);
		System.out.print("Classifica��o de triglicer�deos: ");
		Hemograma.classificarTriglicerideos(trig);
		System.out.print("Classifica��o de colesterol: ");
		Hemograma.classificarColesterol(colesterol);
				
		sc.close();
	}
}
