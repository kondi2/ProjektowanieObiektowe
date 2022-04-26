import java.util.Random;

public class Papuga extends Zwierze implements Roslinozercy, Miesozercy{
    @Override
    void generujWage() {
        Random r = new Random();
        waga = r.nextInt()%3+3;
    }

    @Override
    public String toString() {
        return "Jestem papuga.\n" + super.toString();
    }

    @Override
    public void jedzRosliny(double wagaRoslin) {
        waga += wagaRoslin * 0.1;
    }
    @Override
    public void jedzMieso(double wagaMiesa) {
        waga += wagaMiesa* 0.15;
    }
}
