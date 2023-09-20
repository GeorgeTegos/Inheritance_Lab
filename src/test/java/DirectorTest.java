import Staff.Employee;
import Staff.Manager.Director;
import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Employee employee;

    @Before
    public void before () {
        employee = new Director("John", "AB123456C", 30000.00, "Sales", 100000.00);
    }

    @Test

    public void testDirectorGetBudget() {
        Director director = (Director) employee;
        assertEquals(100000.00, director.getBudget(), 0.01);
    }

    @Test

    public void testDirectorPayBonus() {
        assertEquals(600.00, employee.payBonus(), 0.01);
    }
}
