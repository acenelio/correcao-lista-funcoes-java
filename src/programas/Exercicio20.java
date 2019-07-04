package programas;

import java.util.Locale;
import java.util.Scanner;

import energia.Energia;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantidade de Kwh: ");
		int kwh = sc.nextInt();
		
		System.out.printf("Valor da conta = %.2f%n", Energia.conta(kwh));
		
		sc.close();
	}
}
