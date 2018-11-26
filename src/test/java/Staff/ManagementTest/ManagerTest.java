package Staff.ManagementTest;

import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Seagull Bighair", "SR43598A", 60000, "Engineering");
    }

    @Test
    public void managerHasName(){
        assertEquals("Seagull Bighair", manager.getName());
    }

    @Test
    public void managerCanUpdateName(){
        manager.setName("Ryan Thumplebarton");
        assertEquals("Ryan Thumplebarton", manager.getName());
    }
    @Test
    public void managerCantUpdateNullName(){
        manager.setName(null);
        assertEquals("Seagull Bighair", manager.getName());
    }

    @Test
    public void managerHasNINumber(){
        assertEquals("SR43598A", manager.getNationalInsuranceNum());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(60000, manager.getSalary(), .01);
    }

    @Test
    public void managerHasDepartment(){
        assertEquals("Engineering", manager.getDeptName());
    }

    @Test
    public void managerCanGetARaise(){
        assertEquals(61000, manager.raiseSalary(1000), .01);
    }


    @Test
    public void managerCanGetARaiseNoNegs(){
        assertEquals(60000, manager.raiseSalary(-1000), .01);
    }

    @Test
    public void managerGetsPayBonus(){
        assertEquals(600, manager.payBonus(), .01);
    }

}
