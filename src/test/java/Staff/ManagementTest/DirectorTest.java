package Staff.ManagementTest;

import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Bossy McBossface", "HQ340943P", 85000, "Engineering", 50000);
    }

    @Test
    public void directorHasName(){
        assertEquals("Bossy McBossface", director.getName());
    }

    @Test
    public void directorCantEditNullName(){
        director.setName(null);
        assertEquals("Bossy McBossface", director.getName());
    }

    @Test
    public void directorCanEditName(){
        director.setName("Howard Scrumbledongle");
        assertEquals("Howard Scrumbledongle", director.getName());
    }

    @Test
    public void directorHasNINumber(){
        assertEquals("HQ340943P", director.getNationalInsuranceNum());
    }

    @Test
    public void directorHasSalary(){
        assertEquals(85000, director.getSalary(), .01);
    }

    @Test
    public void directorHasDepartment(){
        assertEquals("Engineering", director.getDeptName());
    }

    @Test
    public void directorHasBudget(){
        assertEquals(50000, director.getBudget(), .01);
    }

    @Test
    public void directorCanGetARaise(){
        assertEquals(86000, director.raiseSalary(1000), .01);
    }

    @Test
    public void directorCanGetARaiseNoNegs(){
        assertEquals(85000, director.raiseSalary(-1000), .01);
    }

    @Test
    public void directorGetsPayBonus(){
        assertEquals(850, director.payBonus(), .01);
    }

}
