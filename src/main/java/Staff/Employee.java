package Staff;

public abstract class Employee {
    protected String name;
    protected String nationalInsuranceNum;
    protected double salary;

    public Employee(String name, String nationalInsuranceNum, double salary){
        this.name = name;
        this.nationalInsuranceNum = nationalInsuranceNum;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNationalInsuranceNum(){
        return this.nationalInsuranceNum;
    }

    public double getSalary(){
        return this.salary;
    }

    public double raiseSalary(double amt){
        if (amt > 0) {
            return this.salary + amt;
        }
        return this.salary;
    }

    public double payBonus(){
        return this.salary * 0.01;
    }

    public void setName(String newName){
        if (newName != null){
            this.name = newName;
        }
    }
}
