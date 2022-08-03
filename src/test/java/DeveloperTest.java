import org.junit.Before;

import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("James", "JK12345", 30000.00);
    }

    @Test
    public void employeeHasName() {
        assertEquals("James", developer.getName());
    }

    @Test
    public void employeeHasNumber() {
        assertEquals("JK12345", developer.getNINumber());
    }

    @Test
    public void employeeHasSalary() {
        assertEquals(30000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1000);
        assertEquals(31000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(300.00, developer.payBonus(), 0.01);
    }
}
