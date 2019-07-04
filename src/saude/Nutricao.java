package saude;

public class Nutricao {

	public static double imc(double peso, double altura) {
		return peso / (altura * altura);
	}
	
	public static void classificarImc(double peso, double altura) {
		
		// poderia ter reaproveitado a funcao imc acima, mas fiz o calculo manualmente aqui
		// porque neste exercicio nao tinhamos visto ainda funcao que retorna valor:
		double imc = peso / (altura * altura);  
		
		if (imc < 20.0) {
			System.out.println("abaixo do peso");
		}
		else if (imc < 25.0) {
			System.out.println("peso normal");
		}
		else if (imc < 30.0) {
			System.out.println("sobrepeso");
		}
		else {
			System.out.println("obeso");
		}
	}
}
