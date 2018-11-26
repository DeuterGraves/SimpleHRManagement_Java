package Staff.Management;

import Staff.Employee;

public class Manager extends Employee {

    protected String deptName;

    public Manager(String name, String nationalInsuranceNum, double salary, String deptName){
        super(name, nationalInsuranceNum, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }
}
