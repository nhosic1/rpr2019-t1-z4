package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] artikli = new Artikl[50];

    public Korpa(Artikl[] artikli) {
        this.artikli = artikli;
    }

    public Korpa() {

    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public void setArtikli(Artikl[] artikli) {
        this.artikli = artikli;
    }
    public boolean dodajArtikl(Artikl artikl){
        boolean dodan = false;
        for (int i=0; i<50; i++){
            if (artikli[i] == null){
                artikli[i] = artikl;
                dodan = true;
                break;
            }
        }
        return dodan;
    }
    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a = null;
        for (int i=0; i<50; i++){
            if (artikli[i] != null && artikli[i].getKod().equals(kod)){
                a = artikli[i];
                artikli[i] = null;
                break;
            }
        }
        return a;
    }

    public int dajUkupnuCijenuArtikala() {
        int suma = 0;
        for (int i=0; i<50; i++){
            if (artikli[i] != null){
                suma = suma + artikli[i].getCijena();
            }
        }
        return suma;
    }
}
