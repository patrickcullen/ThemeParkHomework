import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Waltzer> waltzer;
    private ArrayList<Booster> booster;
    private ArrayList<Rollercoaster> rollercoaster;

    public ThemePark(ArrayList<Waltzer> waltzer, ArrayList<Booster> booster, ArrayList<Rollercoaster> rollercoaster) {
        this.waltzer = waltzer;
        this.booster = booster;
        this.rollercoaster = rollercoaster;
    }

    public void checkIntoWaltzer(Customer customer) {
        for (Waltzer waltzer : this.waltzer) {
            waltzer.checkIn(customer);
        }
    }
}
