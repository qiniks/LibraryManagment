abstract class Employee {
    protected String name;
    protected int id;
    protected double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayEmployeeInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Base Salary: $" + baseSalary);
    }
}

interface Payable {
    double getPaymentAmount();
}

class FullTimeEmployee extends Employee implements Payable {
    public FullTimeEmployee(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 1.2;
    }

    @Override
    public double getPaymentAmount() {
        return calculateSalary();
    }
}

class ContractEmployee extends Employee implements Payable {
    private int hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, int id, int hourlyRate, int hoursWorked) {
        super(name, id, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public double getPaymentAmount() {
        return calculateSalary();
    }
}

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee worker1 = new FullTimeEmployee("Alice Johnson", 101, 5000);
        ContractEmployee worker2 = new ContractEmployee("Bob Smith", 102,  25, 160);

        worker1.displayEmployeeInfo();
        System.out.println("Total Salary: $" + worker1.getPaymentAmount());
        System.out.println("--------------------");

        worker2.displayEmployeeInfo();
        System.out.println("Total Salary: $" + worker2.getPaymentAmount());
        System.out.println("--------------------");
    }
}