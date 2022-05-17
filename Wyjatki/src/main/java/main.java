import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.log;

public class main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        while (true){
            try{
                System.out.print("Podaj liczbe: ");
                double liczba = scanner.nextDouble();
                if (liczba<=0) throw new IllegalArgumentException();

                double logarytm = log(liczba);
                System.out.println("Logarytm wynosi: " + logarytm);

            }catch (IllegalArgumentException e){
                System.out.println("Podales liczbe ujemna. Logarytm nie istnieje.");

            }catch (InputMismatchException e){
                System.out.println("To nie jest liczba!!!!");
                scanner.reset();
                scanner.next();

            }finally {
                System.out.println("Koniec!");
            }
        }

    }

}
