package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class tpTest {

    @Test
    void testCalculerSomme() {
        int[] notes = {12, 15, 10, 18, 14};
        int resultatAttendu = 69;

        int resultat = tp.calculerSomme(notes);

        assertEquals(resultatAttendu, resultat, "La somme des notes doit être correcte");
    }
}
