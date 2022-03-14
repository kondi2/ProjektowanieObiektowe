public class Auto {

    String nazwa;
    String typ;
    int pojemnoscSilnika;
    int pojemnoscBaku;
    int rokProdukcji;
    String kolor;
    boolean wlaczony = true;
    int ktoryWlasciciel;
    int predkosc;
    int zwiekszPredkosc;
    int zmiejszPredkosc;

    Auto(String nazwa, String typ, int pojemnoscSilnika, int pojemnoscBaku, int rokProdukcji, String kolor, int ktoryWlasciciel, int predkosc){
        this.nazwa=nazwa;
        this.typ=typ;
        this.pojemnoscSilnika=pojemnoscSilnika;
        this.pojemnoscBaku=pojemnoscBaku;
        this.rokProdukcji=rokProdukcji;
        this.kolor=kolor;
        this.ktoryWlasciciel=ktoryWlasciciel;
        this.predkosc=predkosc;
        System.out.println("Nazwa: "+nazwa+", typ: "+typ+", pojemosc silnika: "+pojemnoscSilnika+", pojemosc baku: "+pojemnoscBaku+", rok produkcji: "+rokProdukcji+", kolor: "+kolor+", ktory wlasciciel: "+ktoryWlasciciel+", predkosc: "+predkosc);



    }


    void wlaczSilnik(){
        wlaczony = true;
    }

    boolean czyWlaczony(){
        return wlaczony;
    }
    void setKtoryWlasciciel(int ktoryWlasciciel){
        this.ktoryWlasciciel=ktoryWlasciciel;
    }
    void zwiekszPredkosc(int zwieksz){
        predkosc=predkosc+zwieksz;
    }
    void zmiejszPredkosc(int zmniejsz){
        predkosc=predkosc-zmniejsz;
    }

    public static void main(String[] args) {
        Auto BMW = new Auto("x5","SUV",3500,80,2021,"Czarny",2,50);

        BMW.wlaczSilnik();
        BMW.czyWlaczony();
        BMW.setKtoryWlasciciel(8);
        System.out.println(BMW);
        BMW.zwiekszPredkosc(40);
        System.out.println(BMW);


    }
}
