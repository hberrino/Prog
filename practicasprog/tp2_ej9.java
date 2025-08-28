public class tp2_ej9 {
    public static void main(String[] Args) {
        // Escribir un programa que mientras que el usuario ingrese un
        //carácter dígito o carácter letra minúscula, imprima si es carácter
        //dígito o carácter letra minúscula, y si es letra minúscula imprimir si
        //es vocal o consonante.
        char caracteringresado = ' ';
        System.out.println("Ingrese un caracter: ");
        caracteringresado = Utils.leerChar();
        while (caracteringresado >= '0' && caracteringresado <= '9' || caracteringresado >= 'a' && caracteringresado <= 'z') {
            if (caracteringresado >= '0' && caracteringresado <= '9') {
                System.out.println("el caracter es digito y es: " + caracteringresado);
            } else if (caracteringresado >= 'a' && caracteringresado <= 'z') {
                switch (caracteringresado) {
                    case 'a', 'e', 'i', 'o', 'u':
                        System.out.println("el caracter es vocal y es: " + caracteringresado);
                        break;
                    default:
                        System.out.println("el caracter es consonante y es: " + caracteringresado);
                        break;
                }
            }
            {System.out.println("ingrese nuevamente un caracter: ");
                caracteringresado = Utils.leerChar();}
        }

    }
}