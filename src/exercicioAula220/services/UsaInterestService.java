package exercicioAula220.services;

public class UsaInterestService implements InterestService {
	
	private double interestRate;
	
	public UsaInterestService() {
	}
	
	public UsaInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
