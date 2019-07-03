package saude;

public class Hemograma {

	public static void classificarGlicose(double g) {
		if (g <= 100.0) {
			System.out.println("Normal");
		}
		else if (g <= 140.0) {
			System.out.println("Elevado");
		}
		else {
			System.out.println("Diabetes");
		}
	}
	
	public static void classificarTriglicerideos(double medida) {
		if (medida <= 200.0) {
			System.out.println("Desejável");
		}
		else {
			System.out.println("Aumentado");
		}
	}
	
	public static void classificarColesterol(double medida) {
		if (medida <= 200.0) {
			System.out.println("Desejável");
		}
		else if (medida <= 240.0) {
			System.out.println("Limiar");
		}
		else {
			System.out.println("Elevado");
		}
	}
}
