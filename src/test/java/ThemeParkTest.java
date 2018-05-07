import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Waltzer waltzer;
    Booster booster;
    Rollercoaster rollercoaster;
    Customer customer1;
    Customer customer2;
    Customer customer3;
    Customer customer4;

    @Before
    public void before(){
        customer1 = new Customer("Jimmy", 100, 28, 6, 44);
        customer2 = new Customer("Walter", 100, 24, 6, 54);
        customer3 = new Customer("Malcolm", 100, 24, 6, 151);
        customer4 = new Customer("Malcolm", 100, 24, 6, 51);
        ArrayList<Waltzer> waltzers = new ArrayList<>();
        waltzer = new Waltzer("Waltzer", 10, 12, 5, 60, 3);
        waltzers.add(waltzer);
        ArrayList<Booster> boosters = new ArrayList<>();
        booster = new Booster("Booster", 10, 12, 5, 60, 3);
        boosters.add(booster);
        ArrayList<Rollercoaster> rollercoasters = new ArrayList<>();
        rollercoaster = new Rollercoaster("Rollercoaster", 10, 12, 5, 60, 3);
        rollercoasters.add(rollercoaster);
        themePark = new ThemePark(waltzers, boosters, rollercoasters);

    }

    @Test
    public void canCheckCustomerIntoWaltzer(){
        themePark.checkIntoWaltzer(customer1);
        themePark.checkIntoWaltzer(customer2);
        themePark.checkIntoWaltzer(customer3);
//        themePark.checkIntoWaltzer(customer4);
        assertEquals(2, waltzer.getCustomerCount());
    }

    @Test
    public void getCustomerName(){
        assertEquals("Jimmy", customer1.getName() );
    }
}
