package exercicioAula152.entities;

public final class LegalPayer extends TaxPayer {

    private Integer employeesNumber;

    public LegalPayer() {
    }

    public LegalPayer(String name, Double annualIncome, Integer employeesNumber) {
        super(name, annualIncome);
        this.employeesNumber = employeesNumber;
    }

    public Integer getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(Integer employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    @Override
    public Double tax() {
        if (employeesNumber > 10) {
            return getAnnualIncome() * 0.14;
        }

        else {
            return getAnnualIncome() * 0.16;
        }
    }
}
