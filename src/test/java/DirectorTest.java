import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Melinda", "QW12345", 50000.00, "Management", 1000000);
    }

    @Test
    public void canGetName() {
        assertEquals("Melinda", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("QW12345", director.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000.00, director.getSalary(), 0.01);
    }

//    @Test
//    public void canPayBonus() {
//        assertEquals(500.00, director.payBonus(), 0.01);
//    }

    @Test
    public void hasDeptName() {
        assertEquals("Management", director.getDeptName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(1000000, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(5000);
        assertEquals(55000, director.getSalary(), 0.01);
    }

    @Test
    public void cannotDecreaseSalary() {
        director.raiseSalary(-1000);
        assertEquals(50000, director.getSalary(), 0.01);
    }

    @Test
    public void wontAcceptNullName() {
        director.setName("");
        assertEquals("Melinda", director.getName());
    }

    @Test
    public void isDirectorPayBonusGenerous() {
        assertEquals(1000.00, director.payBonus(), 0.01);
    }
}

