package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl[] artikli = new Artikl[1000];

    public Supermarket(Artikl[] artikli) {
        this.artikli = artikli;
    }

    public Supermarket() {

    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public void setArtikli(Artikl[] artikli) {
        this.artikli = artikli;
    }
    public void dodajArtikl(Artikl artikl){
        for (int i=0; i<1000; i++){
            if (artikli[i] == null){
                artikli[i] = artikl;
                break;
            }
        }
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl a = null;
        for (int i=0; i<1000; i++){
            if (artikli[i] != null && artikli[i].getKod().equals(kod)){
                a = artikli[i];
                artikli[i] = null;
                break;
            }
        }
        return a;
    }
}
