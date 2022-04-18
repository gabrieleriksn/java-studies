package entities;

import entities_enums.WorkerLevel;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

public class Worker {
    
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<Contract> listContracts = new ArrayList<Contract>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    
    public List<Contract> getListContracts() {
        return listContracts;
    }

    public void addContract(Contract contract) {
        listContracts.add(contract);        
    }

    public void removeContract(Contract contract) {
        listContracts.remove(contract);
    }

    public Double income(int year, int month) {
        double sum = baseSalary;
        for (Contract c : listContracts) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(c.getDate());
            int contractYear = cal.get(Calendar.YEAR);
            int contractMonth = cal.get(Calendar.MONTH);
            if (contractMonth == month && contractYear == year) {
                sum += c.totalValue();
            }
        }
        
        return sum;
    }

    public String toString() {
        return "Name: " + getName() + "%n" + "Departmen: " + department.getDepartment();
    }
}
