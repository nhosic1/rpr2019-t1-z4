package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    Artikl a1 = new Artikl("prvi", 15, "1");
    Artikl a2 = new Artikl("drugi", 20, "2");
    Artikl a3 = new Artikl("treci", 10, "3");
    Artikl[] artikli = new Artikl[50];
    {
        for(int i=0; i<=48; i++){
             artikli[i] = new Artikl("artikl", 10, String.valueOf(i+1));
        }
    }
    @Test
    void dodajArtikl() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(a1);
        assertEquals(korpa.getArtikli()[0], a1);
        korpa = new Korpa(artikli);
        assertTrue(korpa.dodajArtikl(new Artikl("artikl", 10, "50")));
        assertFalse(korpa.dodajArtikl(new Artikl("artikl", 10, "51")));
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpa = new Korpa(artikli);
        korpa.izbaciArtiklSaKodom("1");
        assertNull(korpa.getArtikli()[0]);
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(a1);
        korpa.dodajArtikl(a2);
        korpa.dodajArtikl(a3);
        assertEquals(korpa.dajUkupnuCijenuArtikala(), 45);
    }
}