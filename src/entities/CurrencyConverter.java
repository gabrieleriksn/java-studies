package entities;

public class CurrencyConverter {
	
	public static double calculateReais (double dollar, double dollarPrice) {
		return dollarPrice * dollar + (dollarPrice * dollar) * 0.06;
	}
}
