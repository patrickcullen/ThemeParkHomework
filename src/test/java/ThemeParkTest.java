import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Waltzer waltzer;
    Customer customer1;
    Customer customer2;
    Customer customer3;
    Customer customer4;

    @Before
    public void before() {


        customer1 = new Customer("Jimmy", 100, 28, 6, 44);
        customer2 = new Customer("Walter", 100, 24, 6, 54);
        customer3 = new Customer("Malcolm", 100, 24, 6, 51);
        customer4 = new Customer("Malcolm", 100, 24, 6, 51);
        ArrayList<Waltzer> waltzers = new ArrayList<>();
        waltzer = new Waltzer("Waltzer", 10, 12, 5, 60, 3);
        waltzers.add(waltzer);
    }

    @Test
    public void canCheckCustomerIntoWaltzer(){
        themePark.checkIntoWaltzer(customer1);
        assertEquals(1, waltzer.getCustomerCount());
    }
}
