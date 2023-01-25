package nombreromain;

public class NombreRomain {
    public static String Convertir(int nombreArabe) {
            StringBuilder resultat = new StringBuilder();

            for (int i = 0; i < nombreArabe; i++) {
                resultat.append("I");
            }

            return resultat.toString();
        }
    }