import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaltzerTest {

    Waltzer waltzer;
    Customer customer;

    @Before
    public void before(){
        waltzer = new Waltzer("Waltzer", 10.00, 12, 5, 60, 3);
        customer = new Customer("Billy", 100.00, 21, 6, 55);
    }

    @Test
    public void canGetName(){
        assertEquals("Waltzer", waltzer.getName());
    }

    @Test
    public void canGetFee(){
        assertEquals(10.00, waltzer.getFee(), 0.01);
    }

    @Test
    public void canGetMinAge(){
        assertEquals(12, waltzer.getMinAge());
    }

    @Test
    public void canGetMinHeight(){
        assertEquals(5, waltzer.getMinHeight());
    }

    @Test
    public void canGetMaxWeight(){
        assertEquals(60, waltzer.getMaxWeight());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(3, waltzer.getCapacity());
    }

    @Test
    public void canGetCustomerCount(){
        assertEquals(0, waltzer.getCustomerCount());
    }

    @Test
    public void canAddCustomer(){
        waltzer.checkIn(customer);
        waltzer.checkIn(customer);
        waltzer.checkIn(customer);
        waltzer.checkIn(customer);
        assertEquals(3, waltzer.getCustomerCount());
    }
}
