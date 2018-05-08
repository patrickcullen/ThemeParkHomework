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

    public void checkIntoBooster(Customer customer) {
        for (Booster booster : this.booster) {
            booster.checkIn(customer);
        }
    }

    public void checkIntoRollercoaster(Customer customer) {
        for (Rollercoaster rollercoaster : this.rollercoaster) {
            rollercoaster.checkIn(customer);
        }
    }
}
