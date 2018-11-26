package Staff.TechStaffTest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Abby Cussed", "SA43239R", 22000);
    }

    @Test
    public void dbAdminHasAName(){
        assertEquals("Abby Cussed", databaseAdmin.getName());
    }

    @Test
    public void dbAdminCanUpdateName(){
        databaseAdmin.setName("Sonia Filihumpton");
        assertEquals("Sonia Filihumpton", databaseAdmin.getName());
    }

    @Test
    public void dbAdminHasNINumber(){
        assertEquals("SA43239R", databaseAdmin.getNationalInsuranceNum());
    }

    @Test
    public void dbAdminHasSalary(){
        assertEquals(22000, databaseAdmin.getSalary(), .01);
    }

    @Test
    public void dbAdminCanGetARaise(){
        assertEquals(23000, databaseAdmin.raiseSalary(1000), .01);
    }


    @Test
    public void databaseAdminCanGetARaiseNoNegs(){
        assertEquals(22000, databaseAdmin.raiseSalary(-1000), .01);
    }

    @Test
    public void dbAdminGetsPayBonus(){
        assertEquals(220, databaseAdmin.payBonus(), .01);
    }
}
