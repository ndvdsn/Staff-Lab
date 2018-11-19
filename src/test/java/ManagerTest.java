import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Mussorgsky", 84, 22000, "Cats");
    }

    @Test
    public void hasName(){
        assertEquals("Mussorgsky", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals(84, manager.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(22000, manager.getSalary(), 0.01);
    }

    @Test
    public void hasDepartment(){
        assertEquals("Cats", manager.getDepartmentName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary();
        assertEquals(22010, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(22220, manager.getSalary(), 0.01);
    }


}
