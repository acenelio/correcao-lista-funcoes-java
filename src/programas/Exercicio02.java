package programas;

import java.util.Locale;
import java.util.Scanner;

import saude.Hemograma;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a glicose: ");
		double glicose = sc.nextDouble();
		
		Hemograma.classificarGlicose(glicose);		
		
		sc.close();
	}
}
