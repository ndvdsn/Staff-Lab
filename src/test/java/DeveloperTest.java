import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;


    @Before
    public void setUp(){
        developer = new Developer("Claude", 77, 28000);
    }

    @Test
    public void hasName(){
        assertEquals("Claude", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals(77, developer.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(28000, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary();
        assertEquals(28010, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        developer.payBonus();
        assertEquals(28280, developer.getSalary(), 0.01);
    }

}
