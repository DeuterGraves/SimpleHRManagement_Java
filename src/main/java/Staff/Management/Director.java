package Staff.Management;

public class Director extends Manager {

    protected double budget;

    public Director(String name, String nationalInsuranceNum, double salary, String deptName, double budget){
        super(name, nationalInsuranceNum, salary, deptName);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }
}
