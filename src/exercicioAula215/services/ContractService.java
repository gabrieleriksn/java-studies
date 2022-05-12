package exercicioAula215.services;

import exercicioAula215.entities.Contract;
import exercicioAula215.entities.Installment;
import java.util.Calendar;
import java.util.Date;

public class ContractService {
	
	private OnlinePaymentService paymentService;
	
	public ContractService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
		for (int i = 0; i < months; i++) {
			Date dueDate = addMonths(contract.getDate(), i + 1);
			
			double baseAmount = contract.getTotalValue() / months;
			double interest = paymentService.interest(baseAmount, i + 1);
			double paymentFee = paymentService.paymentFee(baseAmount + interest);
			
			Double amount = baseAmount + interest + paymentFee;
			
			Installment installment = new Installment(dueDate, amount);
			contract.addInstallment(installment);
		}
	}
	
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
}
