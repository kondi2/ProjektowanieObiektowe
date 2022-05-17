import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class main {


    public static void main(String[] args) throws IOException {
        System.out.print("Podaj rozmiar tablicy: ");
        Scanner scanner = new Scanner(System.in);

        int liczba = scanner.nextInt();

        double [] tab = new double[liczba];

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("wyniki.txt");

            fileWriter.write("Oryginalna talica:\n");

            double suma = 0.0;

            for (int i = 0; i < tab.length; i++) {
                System.out.print("Podaj wartosc na miejscu " + i + " : ");
                double el = scanner.nextInt();
                fileWriter.write(el + " ");
                tab[i] = el;
                suma += el;

            }
            double srednia = suma / liczba;

            double mediana;
            Arrays.sort(tab);
            int srodek = (liczba - 1) / 2;

            if (tab.length % 2 == 0) {
                mediana = (tab[srodek]) + (tab[srodek - 1] / 2);
            } else {
                mediana = tab[srodek];
            }
            System.out.println("Mediana: "+ mediana);

            fileWriter.write("\nPosortowana tablica:\n");
            for (double el : tab){
                fileWriter.write(el+ " ");
            }
            fileWriter.write("\nSrednia: " + srednia+"\n");
            fileWriter.write("Mediana: " + mediana+"\n");

            System.out.println(srednia);
            System.out.println(mediana);

            for (int i= 0; i<tab.length; i++){
                System.out.print(tab[i] + ", ");
            }
            System.out.println();
        }finally {
            if(fileWriter != null){
                fileWriter.close();
                System.out.println("Zapisano!");
            }
        }

    }
}
