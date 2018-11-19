package Management;

import Staff.Employee;

public class Director extends Manager {

    private double budget;

    public Director(String name, int niNumber, double salary, String departmentName, double budget){

        super(name , niNumber, salary, departmentName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus(){
        double bonusedSalary = (salary *= 1.02);
        return bonusedSalary;
    }


}
