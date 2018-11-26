package Staff.TechStaffTest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Square Pusher", "IO230964N", 22000);
    }

    @Test
    public void developerHasName(){
        assertEquals("Square Pusher", developer.getName());
    }

    @Test
    public void developerCanUpdateName(){
        developer.setName("Jonah Wiringham");
        assertEquals("Jonah Wiringham", developer.getName());
    }

    @Test
    public void developerCantUpdateNullName(){
        developer.setName(null);
        assertEquals("Square Pusher", developer.getName());
    }

    @Test
    public void developerHasNINumber(){
        assertEquals("IO230964N", developer.getNationalInsuranceNum());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(22000, developer.getSalary(), .01);
    }

    @Test
    public void developerCanGetARaise(){
        assertEquals(23000, developer.raiseSalary(1000), .01);
    }

    @Test
    public void developerCanGetARaiseNoNegs(){
        assertEquals(22000, developer.raiseSalary(-1000), .01);
    }

    @Test
    public void developerGetsPayBonus(){
        assertEquals(220, developer.payBonus(), .01);
    }
}
