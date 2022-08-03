import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("John", "DV328280T", 32000.00);
    }

    @Test
    public void hasName() {
        assertEquals("John", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("DV328280T", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(32000.00, databaseAdmin.getSalary(), 0.01 );
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(1000.00);
        assertEquals(33000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(320.00, databaseAdmin.payBonus(), 0.01);
    }
 }
