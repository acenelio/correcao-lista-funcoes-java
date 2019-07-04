package energia;

public class Energia {

	public static double conta(int kwh) {
		double valor = 20.0;
		if (kwh > 45) {
			valor = valor + (kwh - 45) * 0.5;
		}
		return valor;
	}
}
