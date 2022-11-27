package pl.pjatk.tdd.sklep;

public class Sklep {
    public static void dokonajZakupu(KartaKlienta karta, double kwotaZakupu) {
        //TODO: dodaj algorytm na liczenie ilości kuponów jakie należą się za zakup
        double upust = karta.pobierzIloscDostepnychKuponow() >= 10 ? 0.03 : 0;
        double znizka = 0;
        if(kwotaZakupu > 50){
            if(kwotaZakupu > 100){
                znizka = 0.1;
            } else {
                znizka = 0.05;
            }
        }
        kwotaZakupu -= kwotaZakupu * ((upust + znizka)/100);
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
