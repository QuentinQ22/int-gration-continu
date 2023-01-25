package nombreromain;

public class NombreRomain {
    public static String Convertir(int nombreArabe) {
            StringBuilder resultat = new StringBuilder();

            switch (nombreArabe) {
                case 1,2,3:
                    for (int i = 0; i < nombreArabe; i++) {
                        resultat.append("I");
                    }
                        break;
                case 4:
                    resultat.append("IV");
                    break;
                case 5 :
                    resultat.append("V");
                    break;
                case 6,7,8:
                    resultat.append("V");
                    for (int i =5; i<nombreArabe; i++) {
                        resultat.append("I");
                    }
                    break;
                case 9:
                    resultat.append("IX");
                    break;
                case 10:
                    resultat.append("X");
                    break;
                case 11,12:
                    resultat.append("X");
                    for(int i = 10; i < nombreArabe; i++)
                    {
                        resultat.append("I");
                    }


            }
//            if(nombreArabe < 4) {
//                for (int i = 0; i < nombreArabe; i++) {
//                    resultat.append("I");
//                }
//            }
//            else if (nombreArabe == 4) {
//                resultat.append("IV");
//            }
//            else if (nombreArabe == 5) {
//                resultat.append("V");
//            }
//            else if(nombreArabe > 5 && nombreArabe < 9) {
//                resultat.append("V");
//                for (int i =5; i<nombreArabe; i++) {
//                    resultat.append("I");
//                }
//            }
//            else if (nombreArabe == 9) {
//                resultat.append("IX");
//            }
//            else if (nombreArabe == 10) {
//                resultat.append("X");
//            }
//            else {
//                resultat.append("X");
//                for(int i = 10; i < nombreArabe; i++)
//                {
//                    resultat.append("I");
//                }
//            }

            return resultat.toString();
        }
    }