public class tp3_ej5 {
    //Escribir un programa que mientras el usuario ingrese un número
    //entero entre 1 y 10, pida ingresar un carácter, y por cada carácter
    //ingresado imprima
    //a. “letra minúscula” si el carácter es una letra del abecedario en
    //minúscula;
    //b. “letra mayúscula” si el carácter es una letra del abecedario
    //en mayúscula;
    //c. “dígito” si el carácter corresponde a un número;
    //d. “otro” para los restantes casos de caracteres.
    public static void charTipo1() {
        System.out.println("Ingrese un carácter: ");
        char caracterUser = Utils.leerChar();
        int caracterNum = 0;
        if (caracterUser >= '0' && caracterUser <= '9') {
            caracterNum = caracterUser - '0';
            if (caracterNum % 5 == 0) {
                System.out.println("El carácter es dígito y múltiplo de 5");
            } else {
                System.out.println("El carácter es dígito");
            }

        } else if (caracterUser >= 'a' && caracterUser <= 'z') {
            System.out.println("Minúscula");
        } else if (caracterUser >= 'A' && caracterUser <= 'Z') {
            System.out.println("Mayúscula");
        } else {
            System.out.println("otro caracter");
        }
    }

    public static void main(String[] args) {
        int numIngresado = 0;
        System.out.println("ingrese un numero entre el 1 y el 10: ");
        numIngresado = Utils.leerInt();
        while (numIngresado >= 0 && numIngresado <= 10) {
            charTipo1();
            System.out.println("reingrese un numero del 1 al 10: ");
            numIngresado = Utils.leerInt();
        }
    }
}