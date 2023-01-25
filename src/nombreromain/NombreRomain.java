package nombreromain;

public class NombreRomain {
    public static String Convertir(int nombreArabe) {
            StringBuilder resultat = new StringBuilder();

            if(nombreArabe < 4) {
                for (int i = 0; i < nombreArabe; i++) {
                    resultat.append("I");
                }
            }
            else if (nombreArabe == 4) {
                resultat.append("IV");
            }
            else if (nombreArabe == 5) {
                resultat.append("V");
            }
            else if(nombreArabe > 5 && nombreArabe < 9) {
                resultat.append("V");
                for (int i =5; i<nombreArabe; i++) {
                    resultat.append("I");
                }
            }
            else if (nombreArabe == 9) {
                resultat.append("IV");
            }

            return resultat.toString();
        }
    }