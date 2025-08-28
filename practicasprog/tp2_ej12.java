public class tp2_ej12 {
    public static void main(String[] Args) {
        //Escribir un programa que mientras el usuario ingrese un
        //carácter letra minúscula, se quede con la menor y la mayor letra
        //ingresada. Finalmente muestre por pantalla dichas letras.
        char letra = ' ', letramayor = ' ', letramenor = ' ';
        boolean primera = true;

        System.out.println("Ingrese una letra minúscula: ");
        letra = Utils.leerChar();

        while (letra >= 'a' && letra <= 'z') {
            if (primera) {
                letramayor = letra;
                letramenor = letra;
                primera = false;
            } else {
                if (letra > letramayor) {
                    letramayor = letra;
                }
                if (letra < letramenor) {
                    letramenor = letra;
                }
            }

            System.out.println("Ingrese una letra minúscula: ");
            letra = Utils.leerChar();
        }

        if (!primera) {
            System.out.println("La menor letra ingresada fue: " + letramenor);
            System.out.println("La mayor letra ingresada fue: " + letramayor);
        }
    }
}
