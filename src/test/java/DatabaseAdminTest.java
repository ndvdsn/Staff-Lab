import Staff.Employee;
import TechStaff.DatabaseAdmin;
import org.junit.Before;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("Schubert", 55, 23000);
    }



}
