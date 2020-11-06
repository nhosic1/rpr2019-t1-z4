package ba.unsa.etf.rpr;

public class Artikl {
      private String naziv;
      private int cijena;
      private String kod;

    public Artikl(String naziv, int cijena, String kod) {
        this.naziv = naziv;
        this.cijena = cijena;
        this.kod = kod;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCijena() {
        return cijena;
    }

    public void setCijena(int cijena) {
        this.cijena = cijena;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Artikl)) return false;
        Artikl a = (Artikl)o;
        return  (naziv.equals(a.getNaziv()) && cijena == a.getCijena() && kod.equals(a.getKod()));
    }
}
