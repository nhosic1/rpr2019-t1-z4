package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    Artikl a1 = new Artikl("prvi", 15, "1");
    Artikl a2 = new Artikl("drugi", 20, "2");
    Artikl a3 = new Artikl("treci", 10, "3");
    Artikl[] artikli = new Artikl[1000];
    {
        artikli[0] = a1;
        artikli[1] = a2;
        artikli[2] = a3;
    }
    @Test
    void dodajArtikl() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(a1);
        assertEquals(supermarket.getArtikli()[0], a1);
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket supermarket = new Supermarket(artikli);
        supermarket.izbaciArtiklSaKodom("2");
        assertNull(supermarket.getArtikli()[1]);
    }
}