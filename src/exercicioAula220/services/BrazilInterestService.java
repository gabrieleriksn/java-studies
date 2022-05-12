package exercicioAula220.services;

public class BrazilInterestService implements InterestService {
	
	private double interestRate;
	
	public BrazilInterestService() {
	}
	
	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
