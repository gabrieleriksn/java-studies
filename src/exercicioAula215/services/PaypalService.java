package exercicioAula215.services;

public class PaypalService implements OnlinePaymentService {
	
	public static final double PAYMENT_FEE = 0.02;
	public static final double MONTHLY_INTEREST = 0.01;
	
	@Override
	public double paymentFee(double amount) {
		return PAYMENT_FEE * amount;
	}
	
	@Override
	public double interest(double amount, int months) {
		return MONTHLY_INTEREST * amount * months;
	}
}
 