import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer("Ralph", 100.00, 22, 6, 55);
    }

    @Test
    public void canGetName(){
        assertEquals("Ralph", customer.getName());
    }

    @Test
    public void canGetCash(){
        assertEquals(100.00, customer.getCash(), 0.01);
    }

    @Test
    public void canGetAge(){
        assertEquals(22, customer.getAge());
    }

    @Test
    public void canGetHeight(){
        assertEquals(6, customer.getHeight());
    }

    @Test
    public void canGetWeight(){
        assertEquals(55, customer.getWeight());
    }
}
