import java.util.Random;

public class Orzel extends Zwierze implements Miesozercy{
    @Override
    void generujWage() {
        Random r = new Random();
        waga = r.nextInt()%8+8;
    }

    @Override
    public String toString() {
        return "Jestem orłem.\n" + super.toString();
    }

    @Override
    public void jedzMieso(double wagaMiesa) {
        waga += wagaMiesa * 0.1;
    }
}
