package aplications;

import entities.Worker;
import entities.Contract;
import entities.Department;
import entities_enums.WorkerLevel;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Calendar;
import java.util.Date;

public class WorkerMainProgram {
    
    public static void main(String[] args) throws ParseException{
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
        SimpleDateFormat sdfr = new SimpleDateFormat("MM/yyyy");

        System.out.print("Enter department's name: ");
        Department department = new Department(sc.nextLine());
        
        System.out.println("Enter worker data:");
        
        System.out.print("Name: ");
        String name = sc.nextLine();
        
        System.out.print("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(sc.nextLine());

        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(name, level, baseSalary, department);

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            System.out.printf("Enter contract #%d data:%n", i+1);
            
            System.out.print("Date (DD/MM/YYYY): ");
            Date date = sdf.parse(sc.next());

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            Contract contract = new Contract(date, valuePerHour, hours);
            
            worker.addContract(contract);
        }
        
        System.out.println();
        
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        Date dateIncome = sdfr.parse(sc.next());
        Calendar calIncome = Calendar.getInstance();
        calIncome.setTime(dateIncome);
        int yearIncome = calIncome.get(Calendar.YEAR);
        int monthIncome = calIncome.get(Calendar.MONTH);
        double incomeValue = worker.income(yearIncome, monthIncome);
        
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + department.getDepartment());
        System.out.println("Income for " + sdfr.format(dateIncome) + ": " + String.format("%.2f", incomeValue));

        sc.close();
    }
}
