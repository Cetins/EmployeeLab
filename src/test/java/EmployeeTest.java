import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Bob", "NI123456", 30000.00, "engineering");
    }

    @Test
    public void employeeHasName() {
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void employeeHasNumber() {
        assertEquals("NI123456", manager.getNINumber());
    }

    @Test
    public void employeeHasSalary() {
        assertEquals(30000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(1000);
        assertEquals(31000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(300.00, manager.payBonus(), 0.01);
    }

    @Test
    public void managerHasDept() {
        assertEquals("engineering", manager.getDeptName());
    }
}
