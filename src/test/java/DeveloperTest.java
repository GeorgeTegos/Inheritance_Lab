import Staff.Employee;
import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Employee employee;

    @Before
    public void before () {
        employee = new Developer("John", "AB123456C", 30000.00);
    }

    @Test
    public void testDeveloperRaiseSalary() {
        employee.raiseSalary(100.00);
        assertEquals(30100.00, employee.getSalary(), 0.01);
    }

    @Test
    public void testDeveloperPayBonus() {
        assertEquals(300.00, employee.payBonus(), 0.01);
    }

}
