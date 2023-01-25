package test;

import nombreromain.NombreRomain;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NombreRomainsTest {

    @Test
    @DisplayName("ETANT DONNE un chiffre arabe 1" +
            "QUAND on le convertit en nombre romain" +
            "ALORS on obtient un I")
    public void Test_1() {
        //ETANT DONNE un chiffre arabe 1
        int chiffreArabe = 1;

        // QUAND on le convertit en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        // ALORS on obtient un I
        assertEquals("I", nombreRomain);
    }

    @Test
    @DisplayName("ETANT DONNE un chiffre arabe 2" +
            "QUAND on le convertit en nombre romain" +
            "ALORS on obtient un II")
    public void Test_2() {
        //ETANT DONNE un chiffre arabe 1
        int chiffreArabe = 2;

        // QUAND on le convertit en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        // ALORS on obtient un I
        assertEquals("II", nombreRomain);
    }
}