import Staff.Employee;
import Staff.techStaff.DataBaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {

    Employee employee;

    @Before
    public void before () {
        employee = new DataBaseAdmin("John", "AB123456C", 30000.00);
    }

    @Test
    public void testDataBaseAdminRaiseSalary() {
        employee.raiseSalary(100.00);
        assertEquals(30100.00, employee.getSalary(), 0.01);
    }

    @Test
    public void testDataBaseAdminPayBonus() {
        assertEquals(300.00, employee.payBonus(), 0.01);
    }

}
