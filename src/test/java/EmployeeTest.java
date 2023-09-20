import Staff.Employee;
import Staff.Manager.Manager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before () {
        employee = new Manager("John", "AB123456C", 30000.00, "Sales");
    }

    @Test
     public void testManagerRaiseSalary() {
        employee.raiseSalary(100.00);
        assertEquals(30100.00, employee.getSalary(), 0.01);
    }

    @Test
    public void testManagerPayBonus() {
        assertEquals(300.00, employee.payBonus(), 0.01);
    }


}
