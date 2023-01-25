package test;

import nombreromain.NombreRomain;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NombreRomainsTest {

//    public void Test_Unite(int n) {
//        //ETANT DONNE un chiffre arabe 1
//        int chiffreArabe = 1;
//
//        // QUAND on le convertit en nombre romain
//        String nombreRomain = NombreRomain.Convertir(chiffreArabe);
//
//        // ALORS on obtient un I
//        assertEquals("I", nombreRomain);
//    }

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
        //ETANT DONNE un chiffre arabe 2
        int chiffreArabe = 2;

        // QUAND on le convertit en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        // ALORS on obtient un II
        assertEquals("II", nombreRomain);
    }
    @Test
    @DisplayName("ETANT DONNE un chiffre arabe 3" +
            "QUAND on le convertit en nombre romain" +
            "ALORS on obtient un III")
    public void Test_3() {
        //ETANT DONNE un chiffre arabe 3
        int chiffreArabe = 3;

        // QUAND on le convertit en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        // ALORS on obtient un III
        assertEquals("III", nombreRomain);
    }
    @Test
    @DisplayName("ETANT DONNE un chiffre arabe 4" +
            "QUAND on le convertit en nombre romain" +
            "ALORS on obtient un IV")
    public void Test_4() {
        //ETANT DONNE un chiffre arabe 4
        int chiffreArabe = 4;

        // QUAND on le convertit en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        // ALORS on obtient un IV
        assertEquals("IV", nombreRomain);
    }
    @Test
    @DisplayName("ETANT DONNE un chiffre arabe 6" +
            "QUAND on le convertit en nombre romain" +
            "ALORS on obtient un V")
    public void Test_5() {
        //ETANT DONNE un chiffre arabe 5
        int chiffreArabe = 5;

        // QUAND on le convertit en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        // ALORS on obtient un V
        assertEquals("V", nombreRomain);
    }
    @Test
    @DisplayName("ETANT DONNE un chiffre arabe 6" +
            "QUAND on le convertit en nombre romain" +
            "ALORS on obtient un VI")
    public void Test_6() {
        //ETANT DONNE un chiffre arabe 6
        int chiffreArabe = 6;

        // QUAND on le convertit en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        // ALORS on obtient un VI
        assertEquals("VI", nombreRomain);
    }
    @Test
    @DisplayName("ETANT DONNE un chiffre arabe 7" +
            "QUAND on le convertit en nombre romain" +
            "ALORS on obtient un VII")
    public void Test_7() {
        //ETANT DONNE un chiffre arabe 7
        int chiffreArabe = 7;

        // QUAND on le convertit en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        // ALORS on obtient un VII
        assertEquals("VII", nombreRomain);
    }
    @Test
    @DisplayName("ETANT DONNE un chiffre arabe 8" +
            "QUAND on le convertit en nombre romain" +
            "ALORS on obtient un VIII")
    public void Test_8() {
        //ETANT DONNE un chiffre arabe 8
        int chiffreArabe = 8;

        // QUAND on le convertit en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        // ALORS on obtient un VIII
        assertEquals("VIII", nombreRomain);
    }

    @Test
    @DisplayName("ETANT DONNE un chiffre arabe 9" +
            "QUAND on le convertit en nombre romain" +
            "ALORS on obtient un IX")
    public void Test_9() {
        //ETANT DONNE un chiffre arabe 9
        int chiffreArabe = 9;

        // QUAND on le convertit en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        // ALORS on obtient un IX
        assertEquals("IX", nombreRomain);
    }
    @Test
    @DisplayName("ETANT DONNE un chiffre arabe 10" +
            "QUAND on le convertit en nombre romain" +
            "ALORS on obtient un X")
    public void Test_10() {
        //ETANT DONNE un chiffre arabe 10
        int chiffreArabe = 10;

        // QUAND on le convertit en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        // ALORS on obtient un X
        assertEquals("X", nombreRomain);
    }

    @Test
    @DisplayName("ETANT DONNE un chiffre arabe 11" +
            "QUAND on le convertit en nombre romain" +
            "ALORS on obtient un XI")
    public void Test_11() {
        //ETANT DONNE un chiffre arabe 11
        int chiffreArabe = 11;

        // QUAND on le convertit en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        // ALORS on obtient un XI
        assertEquals("XI", nombreRomain);
    }

    @Test
    @DisplayName("ETANT DONNE un chiffre arabe 12" +
            "QUAND on le convertit en nombre romain" +
            "ALORS on obtient un XII")
    public void Test_12() {
        //ETANT DONNE un chiffre arabe 12
        int chiffreArabe = 12;

        // QUAND on le convertit en nombre romain
        String nombreRomain = NombreRomain.Convertir(chiffreArabe);

        // ALORS on obtient un XII
        assertEquals("XII", nombreRomain);
    }
}