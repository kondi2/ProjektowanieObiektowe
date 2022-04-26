public class Zoo {
    public static void main(String[] args) {


        Papuga papuga = new Papuga();
        papuga.nadajImie("Major");
        papuga.jedzRosliny(0.1);
        papuga.jedzMieso(0.2);
        //System.out.println(papuga.jakMaszNaImie());



        Lew lew = new Lew();
        lew.nadajImie("Simba");
        lew.jedzMieso(1.0);


        Rekin rekin = new Rekin();
        rekin.nadajImie("Szczeki");
        rekin.jedzMieso(2.0);


        Slon slon = new Slon();
        slon.nadajImie("Ziutek");
        slon.jedzRosliny(5.0);


        Orzel orzel = new Orzel();
        orzel.nadajImie("America");
        orzel.jedzMieso(1.0);

        Zwierze[] zoo = new Zwierze[5];
        zoo[0] = lew;
        zoo[1] = papuga;
        zoo[2] = slon;
        zoo[3] = orzel;
        zoo[4] = rekin;

       /*
       for (int i = 0; i< zoo.length; i++){
            System.out.println(zoo[i]);
        }

        */

        for (Zwierze zwierze:zoo){
            System.out.println(zwierze);
        }
        

    }
}
