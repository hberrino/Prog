public class tp3_1 {
    public static void main(String[] Args) {
        char digito = ' ';
        char letra = ' ';
        System.out.println("ingrese un digito ");
        digito = Utils.leerChar();
        if (digito >= 0 && digito <= 9) {
            System.out.println(digito);
        } else if (letra >= 'a' && letra <= 'z' || letra >= 'A' && letra <= 'Z') {
            switch (letra) {
                case 'a', 'e', 'i', 'o', 'u':
                    System.out.println("es vocal " + letra);
                    break;
                default:
                    System.out.println("es consonante " + letra);
                    break;

            }
        }
    }
}