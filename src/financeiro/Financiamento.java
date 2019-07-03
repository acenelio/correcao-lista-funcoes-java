package financeiro;

public class Financiamento {

	public static void mostrarValorDaPrestacao(double vi, double ve, int p) {
		
		double resultado = (vi - ve) / p;
		System.out.printf("Cada prestacao = R$ %.2f%n", resultado);
	}
}
