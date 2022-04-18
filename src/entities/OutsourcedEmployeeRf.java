package entities;

public final class OutsourcedEmployeeRf extends EmployeeRf {
    
    private Double additionalCharge;

    public OutsourcedEmployeeRf() {
        super();
    }

    public OutsourcedEmployeeRf(String name, Integer hour, Double valuePerHour, Double additionalCharge) {
        super(name, hour, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment() {
        Double bonus = ((double) 110.0 / 100.0) * additionalCharge;
        return super.payment() + bonus;
    }
}
