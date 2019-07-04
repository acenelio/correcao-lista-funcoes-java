package matematica;

public class Calculos {

	public static double mediaEntreQuatro(double N1, double N2, double N3, double N4) {
		return (N1 + N2 + N3 + N4) / 4.0;
	}
	
	public static double maiorDentreDois(double n1, double n2) {
		if (n1 > n2) {
			return n1;
		}
		else {
			return n2;
		}
	}
	
	public static double maiorDentreQuatro(double n1, double n2, double n3, double n4) {
		return maiorDentreDois(maiorDentreDois(n1, n2), maiorDentreDois(n3, n4));
	}
	
	public static double areaRetangulo(double base, double altura) {
		return base * altura;
	}

	public static double perimetroRetangulo(double base, double altura) {
		return 2 * (base + altura);
	}

	public static double diagonalRetangulo(double base, double altura) {
		return Math.sqrt(base * base + altura * altura);
	}
}
