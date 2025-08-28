public class tp2_ej7 {
    public static void main(String[] args) {
        // Escribir un programa que mientras el usuario ingrese un caracter
        //distinto del carácter ‘*’, muestre por pantalla si es carácter dígito, o
        //si es carácter vocal minúscula.
        final char caracterfijo = '*';
        char caracteringresado = ' ';

        System.out.println("ingrese un caracter: ");
        caracteringresado = Utils.leerChar();

        while (caracteringresado != caracterfijo) {
            if (caracteringresado >= '0' && caracteringresado <= '9') {
                System.out.println("el caracter es digito y es: " + caracteringresado);
            } else if (caracteringresado == 'a' || caracteringresado == 'e' || caracteringresado == 'i' || caracteringresado == 'o' || caracteringresado == 'u') {
                System.out.println("el caracter es vocal y es: " + caracteringresado);
            } else {
                System.out.println("no es ni digito ni vocal minuscula");
            }
            System.out.println ("ingrese un caracter: ");
            caracteringresado = Utils.leerChar();
        }
    }
}


