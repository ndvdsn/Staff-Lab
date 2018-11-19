import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp(){

        director = new Director("Meg", 22, 30000, "Cats", 500000);

    }


    @Test
    public void hasName(){
        assertEquals("Meg", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals(84, director.getNiNumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, director.getSalary(), 0.01);
    }

    @Test
    public void hasDepartment(){
        assertEquals("Cats", director.getDepartmentName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary();
        assertEquals(30010, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        director.payBonus();
        assertEquals(30300, director.getSalary(), 0.01);
    }

    @Test
    public void hasBudget(){
        assertEquals(500000, director.getBudget(), 0.01);
    }

}
