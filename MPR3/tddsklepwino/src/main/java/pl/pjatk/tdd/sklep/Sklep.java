package pl.pjatk.tdd.sklep;

public class Sklep {
    public static void dokonajZakupu(KartaKlienta karta, double kwotaZakupu) {
        //TODO: dodaj algorytm na liczenie ilości kuponów jakie należą się za zakup
        double kupony = kwotaZakupu/40;
        if (kupony >= 3){
            karta.dodajKupony(3);
        } else {
            karta.dodajKupony((int) Math.floor(kupony));
        }
    }

    public static KartaKlienta wydajNowaKarte(){
        return new KartaKlienta();
    }
}
