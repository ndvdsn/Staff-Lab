package Staff;

public abstract class Employee {

    private String name;
    private int niNumber;
    protected double salary;

    public Employee(String name, int niNumber, double salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }


//    public void setName(String name) {
//        this.name = name;
//    }

    public void setName(String name) {
        if(name != null){
            this.name = name;
        }
    }
    

    public int getNiNumber() {
        return niNumber;
    }

    public void setNiNumber(int niNumber) {
        this.niNumber = niNumber;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

//    public double raiseSalary(){
//        this.salary += 10;
//
//        return salary;
//    }

    public double raiseSalary(){
        if (this.salary > 0) {
        }
        return this.salary += 10;
    }




    public double payBonus(){
        double bonusedSalary = (salary *= 1.01);
        return bonusedSalary;
    }
}
