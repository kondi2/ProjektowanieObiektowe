import java.util.Random;

public class Slon extends Zwierze implements Roslinozercy{
    @Override
    void generujWage() {
        Random r = new Random();
        waga = r.nextInt()%2000+2000;
    }

    @Override
    public String toString() {
        return "Jestem słoniem.\n" + super.toString();
    }

    @Override
    public void jedzRosliny(double wagaRoslin) {
        waga += wagaRoslin * 0.15;
    }
}
